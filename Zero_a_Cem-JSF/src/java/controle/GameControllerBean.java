/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import negocio.Game;

/**
 *
 * @author caiovosilva
 */
@Named(value = "gameControllerBean")
@SessionScoped
public class GameControllerBean implements Serializable {

    /**
     * Creates a new instance of GameController
     */
    public GameControllerBean() {
        game = new Game();
    }
    
    public Game getGame(){
        return game;
    }
    
    public void chute(){
        FacesContext context = FacesContext.getCurrentInstance();
        int resultado = getGame().getResultado();
        if(resultado>0)
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Valor da Conta", "O número digitado é Maior que o número Sorteado"));
        else if(resultado<0)
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Valor da Conta", "O número digitado é Menor que o número Sorteado"));
        else
           context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Valor da Conta", "Parabens Você acertou"));
    }
    
    private Game game;
}
