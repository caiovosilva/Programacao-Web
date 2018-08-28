/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Aluno;

/**
 *
 * @author caiovosilva
 */
public class AlunoDAODerby implements IAlunoDAO{

    public AlunoDAODerby(){
        conn = ConexaoDerby.getInstance().getConnection();
    }
    @Override
    public boolean PersistirAluno(Aluno aluno) {
        Statement st;
        try {
            st = conn.createStatement();
            st.executeUpdate("insert into caio.ALUNO (nome, matricula, endereco, nota1, nota2, nota3) values ('"
                    + aluno.getNome()+"', "
                    + aluno.getMatricula()+", '"
                    + aluno.getEndereco()+"',"
                    + aluno.getNota1()+","
                    + aluno.getNota2()+","
                    + aluno.getNota3()+")");
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAODerby.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    private Connection conn;

    @Override
    public List getAllAlunos() {
        ArrayList<Aluno> lista=new ArrayList<Aluno>();
        Statement st;
       
        try {
            st = this.conn.createStatement();
            ResultSet rs = st.executeQuery("Select * from CAIO.ALUNO");
            while(rs.next()){
                Aluno l= new Aluno();
                l.setNome(rs.getString("nome"));
                l.setMatricula(Integer.parseInt(rs.getString("matricula")));
                l.setEndereco(rs.getString("endereco"));
                l.setNota1(Double.parseDouble(rs.getString("nota1")));
                l.setNota2(Double.parseDouble(rs.getString("nota2")));
                l.setNota3(Double.parseDouble(rs.getString("nota3")));
                l.setId(Integer.parseInt(rs.getString("id")));
                lista.add(l);
            }          
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAODerby.class.getName()).log(Level.SEVERE, null, ex);           
        }
        return lista;
    }
}
