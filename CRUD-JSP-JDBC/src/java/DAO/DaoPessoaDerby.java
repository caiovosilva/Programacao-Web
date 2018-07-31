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
import model.Pessoa;

/**
 *
 * @author aluno
 */
public class DaoPessoaDerby implements IDAOPessoa{

    private Connection conn;
    
    public DaoPessoaDerby() {
        try {
            this.conn = ConexaoDerby.getInstancia().getConn();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DaoPessoaDerby.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    

    @Override
    public String addPessoas(Pessoa pessoa) {
        Statement st;
        String resultado="";
        try {
            st = this.conn.createStatement();
            st.executeUpdate("insert into SA.PESSOAS values ('"+pessoa.getCpf()+"','"+pessoa.getNome()+"','"+pessoa.getTelefone()+"')");
            resultado="Pessoa adicionada com sucesso";
        } catch (SQLException ex) {
            Logger.getLogger(DaoPessoaDerby.class.getName()).log(Level.SEVERE, null, ex);
            resultado="Erro ao cadastrar pessoa";
        }
        return resultado;
    }

    @Override
    public ArrayList<Pessoa> buscarPessoas() {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        try {
            Statement statement = this.conn.createStatement();
            String query = "select CPF, NOME, TELEFONE from SA.PESSOAS";
            ResultSet rs = statement.executeQuery(query);
            Pessoa pessoa;
            while(rs.next()){
                pessoa = new Pessoa();
                pessoa.setCpf(rs.getString("CPF"));
                pessoa.setNome(rs.getString("NOME"));
                pessoa.setTelefone(rs.getString("TELEFONE"));
                pessoas.add(pessoa);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoPessoaDerby.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pessoas;
    }
    
}
