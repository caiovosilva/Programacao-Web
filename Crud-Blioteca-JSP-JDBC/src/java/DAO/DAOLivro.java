/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import model.Livro;

/**
 *
 * @author caiovosilva
 */
public interface DAOLivro {
    
    public String addLivro(Livro livro) ;
    public List buscarLivros(Livro livro);
    public Livro getLivro(int id);    
}
