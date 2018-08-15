/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import javax.enterprise.context.Dependent;
import javax.inject.Named;
import javax.faces.application.FacesMessage;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import negocio.Biblioteca;

/**
 *
 * @author caiovosilva
 */
@Named(value = "bibliotecaManagedBean")
@Dependent

public class BibliotecaManagedBean {

    private Biblioteca biblioteca;
    
    public BibliotecaManagedBean() {
        biblioteca = new Biblioteca();
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
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
