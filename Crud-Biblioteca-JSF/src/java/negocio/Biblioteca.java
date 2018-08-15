/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import DAO.DAOLivroDerby;
import java.util.List;
import model.Livro;

/**
 *
 * @author caiovosilva
 */
public class Biblioteca {
    
    public Biblioteca() {
        this.local  = new Livro();
        this.dao = new DAOLivroDerby();
    }
    
    public void setSelecetdLivro(){
        int id =this.local.getId();
        this.local = dao.getLivro(id);
    }
    
    public boolean addLivro(){
        return this.dao.addLivro(local);
    }
    
    public String atualizarLivro(){
        return this.dao.updateLivro(local);
    }
    
    public String apagarLivro(){
        return this.dao.deleteLivro(local);
    }
    
    public List getLivros(){
        return dao.buscarTodosLivros();
    }
    
    public List getLivrosByNome(){
        return dao.buscarLivrosByNome(local);
    }
    
    public int getId() {
        return local.getId();
    }

    public void setId(int id) {
        local.setId(id);
    }

    public String getAutor() {
        return local.getAutor();
    }

    public void setAutor(String autor) {
        local.setAutor(autor);
    }

    public int getAvaliacao() {
        return local.getAvaliacao();
    }

    public void setAvaliacao(int avaliacao) {
        local.setAvaliacao(avaliacao);
    }

    public String getEditora() {
        return local.getEditora();
    }

    public void setEditora(String editora) {
        local.setEditora(editora);
    }

    public String getIsbn() {
        return local.getIsbn();
    }

    public void setIsbn(String isbn) {
        local.setIsbn(isbn);
    }

    public int getPaginas() {
        return local.getPaginas();
    }

    public void setPaginas(int paginas) {
        local.setPaginas(paginas);
    }

    public String getTitulo() {
        return local.getTitulo();
    }

    public void setTitulo(String titulo) {
        local.setTitulo(titulo);
    }
    
    private Livro local;
    private final DAO.DAOLivro dao;
    
}
