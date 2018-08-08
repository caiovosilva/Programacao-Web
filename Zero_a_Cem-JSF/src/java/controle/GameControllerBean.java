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
        context.addMessage(null, new FacesMessage("Valor da Conta", getGame().getResultado()));
    }
    
    private Game game;
}
