/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
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
    public String PersistirAluno(Aluno aluno) {
        String result;
        Statement st;
        try {
            st = conn.createStatement();
            st.executeUpdate("insert into CAIO.ALUNO (nome, matricula, endereco) values ('"
                    + aluno.getNome()+"', "
                    + aluno.getMatricula()+", '"
                    + aluno.getEndereco()+"');");
            result = "aluno cadastrado com sucesso!";
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAODerby.class.getName()).log(Level.SEVERE, null, ex);
            result = "erro ao cadastrar aluno!";
        }
        return result;
    }
    
    private Connection conn;
}
