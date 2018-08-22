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
import model.Passagem;

/**
 *
 * @author aluno
 */
public class DAOPassagemDerby implements DAOPassagem{

    private Connection conn;
    
    public DAOPassagemDerby() {
        this.conn = ConexaoDerby.getInstancia().getConn();
    }

    @Override
    public boolean addPassagem(Passagem passagem) {
//        Statement st;
//        try {
//            st = this.conn.createStatement();
//            st.executeUpdate("insert into caio.PASSAGEM (autor, avaliacao, editora, isbn, paginas, titulo) "
//                + "values ('"+passagem.getAutor()+"'," 
//                + ""+passagem.getAvaliacao()+","
//                + "'"+passagem.getEditora()+"',"
//                + "'"+passagem.getIsbn()+"',"
//                + ""+passagem.getPaginas()+","
//                + "'"+passagem.getTitulo()+"')");
//            return true;
//        } catch (SQLException ex) {
//            Logger.getLogger(DAOPassagemDerby.class.getName()).log(Level.SEVERE, null, ex);          
//        }
        return false;
    }

    @Override
    public List buscarPassagemsByNome(Passagem passagem) {
        
        ArrayList<Passagem> lista=new ArrayList<Passagem>();
        Statement st;
//       
//        try {
//            st = this.conn.createStatement();
//            ResultSet rs = st.executeQuery("Select * from caio.PASSAGEM where titulo like '%"+passagem.getTitulo()+"%'");
//            while(rs.next()){
//                Passagem l= new Passagem();
//                l.setAutor(rs.getString("autor"));
//                l.setAvaliacao(Integer.parseInt(rs.getString("avaliacao")));
//                l.setEditora(rs.getString("editora"));
//                l.setAutor(rs.getString("autor"));
//                l.setIsbn(rs.getString("isbn"));
//                l.setPaginas(Integer.parseInt(rs.getString("paginas")));
//                l.setTitulo(rs.getString("titulo"));
//                l.setId(Integer.parseInt(rs.getString("id")));
//                lista.add(l);
//            }          
//        } catch (SQLException ex) {
//            Logger.getLogger(DAOPassagemDerby.class.getName()).log(Level.SEVERE, null, ex);           
//        }
        return lista;
    }

    @Override
    public Passagem getPassagem(int id) {
        
     Statement st;
      Passagem l = new Passagem(); 
//        try {
//            st = this.conn.createStatement();
//            ResultSet rs = st.executeQuery("Select * from caio.PASSAGEM where  id= "+id+"");
//            while(rs.next()){          
//                l.setAutor(rs.getString("autor"));
//                l.setAvaliacao(Integer.parseInt(rs.getString("avaliacao")));
//                l.setEditora(rs.getString("editora"));
//                l.setAutor(rs.getString("autor"));
//                l.setIsbn(rs.getString("isbn"));
//                l.setPaginas(Integer.parseInt(rs.getString("paginas")));
//                l.setTitulo(rs.getString("titulo"));
//                l.setId(Integer.parseInt(rs.getString("id")));
//            }   
//        } catch (SQLException ex) {
//            Logger.getLogger(DAOPassagemDerby.class.getName()).log(Level.SEVERE, null, ex);          
//        }
        return l;
    }

    @Override
    public List buscarTodosPassagems() {
        ArrayList<Passagem> lista=new ArrayList<Passagem>();
        Statement st;
       
        try {
            st = this.conn.createStatement();
            ResultSet rs = st.executeQuery("Select * from caio.Passagem");
            while(rs.next()){
                Passagem l= new Passagem();
                l.setNomePassageiro(rs.getString("nomePassageiro"));
                l.setCpf(rs.getString("cpf"));
                l.setDataNascimento(rs.getString("dataNascimento"));
                l.setOrigem(rs.getString("origem"));
                l.setPartida(rs.getTimestamp("partida"));
                l.setDestino(rs.getString("destino"));
                l.setChegada(rs.getTimestamp("chegada"));
                l.setValor(Double.parseDouble(rs.getString("valor")));
                l.setId(Integer.parseInt(rs.getString("id")));
                lista.add(l);
            }          
        } catch (SQLException ex) {
            Logger.getLogger(DAOPassagemDerby.class.getName()).log(Level.SEVERE, null, ex);           
        }
        return lista;
    }

    @Override
    public String updatePassagem(Passagem passagem) {
        Statement st;
        String resultado="";
//        try {
//            st = this.conn.createStatement();
//            st.executeUpdate("update caio.PASSAGEM"
//                    + " set autor = '"+passagem.getAutor()+"',"
//                    + " avaliacao = "+passagem.getAvaliacao()+","
//                    + " editora = '"+passagem.getEditora()+"',"
//                    + " isbn = '"+passagem.getIsbn()+"',"
//                    + " paginas = "+passagem.getPaginas()+","
//                    + " titulo = '"+passagem.getTitulo()+"'"
//                    + " where id = "+passagem.getId()+"");
//            resultado="Passagem atualizado com sucesso";
//        } catch (SQLException ex) {
//            Logger.getLogger(DAOPassagemDerby.class.getName()).log(Level.SEVERE, null, ex);
//            resultado="Erro ao atualizar passagem";
//        }
        return resultado;
    }

    @Override
    public String deletePassagem(Passagem passagem) {
        Statement st;
        String resultado="";
        try {
            st = this.conn.createStatement();
            st.executeUpdate("delete from caio.PASSAGEM"
                    + " where id = "+passagem.getId()+"");
            resultado="Passagem apagado com sucesso";
        } catch (SQLException ex) {
            Logger.getLogger(DAOPassagemDerby.class.getName()).log(Level.SEVERE, null, ex);
            resultado="Erro ao apagar passagem";
        }
        return resultado;
    }
}
