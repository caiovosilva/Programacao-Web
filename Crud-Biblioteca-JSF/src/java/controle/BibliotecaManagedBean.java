/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.Dependent;
import javax.inject.Named;
import javax.faces.application.FacesMessage;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import model.Livro;
import negocio.Biblioteca;

/**
 *
 * @author caiovosilva
 */
@Named(value = "bibliotecaManagedBean")
@Dependent

public class BibliotecaManagedBean {

    private Biblioteca biblioteca;
    private Livro selectedLivro;
    
    public BibliotecaManagedBean() {
        biblioteca = new Biblioteca();
        selectedLivro = new Livro();
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }
    
    public List<Livro> getAllLivros(){
        return biblioteca.getLivros();
    }
    
    public Livro getSelectedLivro() {
        return selectedLivro;
    }
 
    public void setSelectedLivro(Livro selectedLivro) {
        this.selectedLivro = selectedLivro;
    }
    
    public void buscar(){
        ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
        try {
            context.dispatch("buscar.xhtml");
        } catch (IOException ex) {
            Logger.getLogger(BibliotecaManagedBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void cadastrar(){
        FacesContext context = FacesContext.getCurrentInstance();
        boolean resultado = biblioteca.addLivro();  
        
        if(resultado)
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Persistência", "Livro cadastrado com sucesso!"));
        else
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Persistência", "ERRO ao cadastrar livro!"));
    }    
}
