/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import model.Passagem;
import negocio.GerenciadorPassagem;

/**
 *
 * @author caiovosilva
 */
@Named(value = "passagensManagedBean")
@SessionScoped
public class PassagensManagedBean implements Serializable {

    /**
     * Creates a new instance of PassagensManagedBean
     */
    public PassagensManagedBean() {
        gerenciadorPassagem = new GerenciadorPassagem();
    }
    
    public List<Passagem> getAllPassagens(){
        return gerenciadorPassagem.getPassagems();
    }
    
    private GerenciadorPassagem gerenciadorPassagem;
    
}
