/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import negocio.QuadradoMagico;

/**
 *
 * @author caiovosilva
 */
@Named(value = "quadradoMagicoBean")
@SessionScoped
public class quadradoMagicoBean implements Serializable {

    /**
     * Creates a new instance of quadradoMagicoBean
     */
    public quadradoMagicoBean() {
        quadradoMagico = new QuadradoMagico();
    }
    
    public QuadradoMagico getQuadradoMagico() {
        return quadradoMagico;
    }
    
    private QuadradoMagico quadradoMagico;

    
}
