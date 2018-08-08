/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import negocio.Conta;

/**
 *
 * @author caiovosilva
 */
@Named(value = "contaBean")
@RequestScoped
public class ContaBean {

    /**
     * Creates a new instance of ContaBean
     */
    private Conta conta;
    
    public ContaBean() {
        conta = new Conta();
    }
    
    public Conta getConta() {
        return conta;
    }
    
    public void calcularConta(){
        FacesContext context = FacesContext.getCurrentInstance();    
        context.addMessage(null, new FacesMessage("Valor da Conta", getConta().getConta()));
    }
    
}
