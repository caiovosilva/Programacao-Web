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
import model.Livro;

/**
 *
 * @author aluno
 */
public class DAOLivroDerby implements DAOLivro{

    private Connection conn;
    
    public DAOLivroDerby() {
        this.conn = ConexaoDerby.getInstancia().getConn();
    }

    @Override
    public String addLivro(Livro livro) {
        Statement st;
        String resultado="";
        try {
            st = this.conn.createStatement();
            st.executeUpdate("insert into caio.LIVRO (autor, avaliacao, editora, isbn, paginas, titulo) "
                + "values ('"+livro.getAutor()+"'," 
                + ""+livro.getAvaliacao()+","
                + "'"+livro.getEditora()+"',"
                + "'"+livro.getIsbn()+"',"
                + ""+livro.getPaginas()+","
                + "'"+livro.getTitulo()+"')");
            resultado="Livro cadastrado com sucesso";
        } catch (SQLException ex) {
            Logger.getLogger(DAOLivroDerby.class.getName()).log(Level.SEVERE, null, ex);
            resultado="Erro ao cadastrar livro";
        }
        return resultado;
    }

    @Override
    public List buscarLivrosByNome(Livro livro) {
        
        ArrayList<Livro> lista=new ArrayList<Livro>();
        Statement st;
       
        try {
            st = this.conn.createStatement();
            ResultSet rs = st.executeQuery("Select * from caio.LIVRO where titulo like '%"+livro.getTitulo()+"%'");
            while(rs.next()){
                Livro l= new Livro();
                l.setAutor(rs.getString("autor"));
                l.setAvaliacao(Integer.parseInt(rs.getString("avaliacao")));
                l.setEditora(rs.getString("editora"));
                l.setAutor(rs.getString("autor"));
                l.setIsbn(rs.getString("isbn"));
                l.setPaginas(Integer.parseInt(rs.getString("paginas")));
                l.setTitulo(rs.getString("titulo"));
                l.setId(Integer.parseInt(rs.getString("id")));
                lista.add(l);
            }          
        } catch (SQLException ex) {
            Logger.getLogger(DAOLivroDerby.class.getName()).log(Level.SEVERE, null, ex);           
        }
        return lista;
    }

    @Override
    public Livro getLivro(int id) {
        
     Statement st;
      Livro l = new Livro(); 
        try {
            st = this.conn.createStatement();
            ResultSet rs = st.executeQuery("Select * from caio.LIVRO where  id= "+id+"");
            while(rs.next()){          
                l.setAutor(rs.getString("autor"));
                l.setAvaliacao(Integer.parseInt(rs.getString("avaliacao")));
                l.setEditora(rs.getString("editora"));
                l.setAutor(rs.getString("autor"));
                l.setIsbn(rs.getString("isbn"));
                l.setPaginas(Integer.parseInt(rs.getString("paginas")));
                l.setTitulo(rs.getString("titulo"));
                l.setId(Integer.parseInt(rs.getString("id")));
            }   
        } catch (SQLException ex) {
            Logger.getLogger(DAOLivroDerby.class.getName()).log(Level.SEVERE, null, ex);          
        }
        return l;
    }

    @Override
    public List buscarTodosLivros() {
        ArrayList<Livro> lista=new ArrayList<Livro>();
        Statement st;
       
        try {
            st = this.conn.createStatement();
            ResultSet rs = st.executeQuery("Select * from caio.LIVRO");
            while(rs.next()){
                Livro l= new Livro();
                l.setAutor(rs.getString("autor"));
                l.setAvaliacao(Integer.parseInt(rs.getString("avaliacao")));
                l.setEditora(rs.getString("editora"));
                l.setAutor(rs.getString("autor"));
                l.setIsbn(rs.getString("isbn"));
                l.setPaginas(Integer.parseInt(rs.getString("paginas")));
                l.setTitulo(rs.getString("titulo"));
                l.setId(Integer.parseInt(rs.getString("id")));
                lista.add(l);
            }          
        } catch (SQLException ex) {
            Logger.getLogger(DAOLivroDerby.class.getName()).log(Level.SEVERE, null, ex);           
        }
        return lista;
    }

    @Override
    public String updateLivro(Livro livro) {
        Statement st;
        String resultado="";
        try {
            st = this.conn.createStatement();
            st.executeUpdate("update caio.LIVRO"
                    + " set autor = '"+livro.getAutor()+"',"
                    + " avaliacao = "+livro.getAvaliacao()+","
                    + " editora = '"+livro.getEditora()+"',"
                    + " isbn = '"+livro.getIsbn()+"',"
                    + " paginas = "+livro.getPaginas()+","
                    + " titulo = '"+livro.getTitulo()+"'"
                    + " where id = "+livro.getId()+"");
            resultado="Livro atualizado com sucesso";
        } catch (SQLException ex) {
            Logger.getLogger(DAOLivroDerby.class.getName()).log(Level.SEVERE, null, ex);
            resultado="Erro ao atualizar livro";
        }
        return resultado;
    }

    @Override
    public String deleteLivro(Livro livro) {
        Statement st;
        String resultado="";
        try {
            st = this.conn.createStatement();
            st.executeUpdate("delete from caio.LIVRO"
                    + " where id = "+livro.getId()+"");
            resultado="Livro apagado com sucesso";
        } catch (SQLException ex) {
            Logger.getLogger(DAOLivroDerby.class.getName()).log(Level.SEVERE, null, ex);
            resultado="Erro ao apagar livro";
        }
        return resultado;
    }
}
