/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import negocio.Conta;

/**
 *
 * @author caiovosilva
 */
@Named(value = "contaBean")
@SessionScoped
public class ContaBean implements Serializable {

    /**
     * Creates a new instance of contaBean
     */
    public ContaBean() {
        conta = new Conta();
    }
    
    private Conta conta;

    public Conta getConta() {
        return conta;
    }
    
    public void calcularConta(){
        
    }
}
