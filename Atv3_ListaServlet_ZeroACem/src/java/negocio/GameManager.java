/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.Random;

/**
 *
 * @author caiov
 */
public class GameManager {
    int numero;
    
    public GameManager(){
        this.sortear();
    }
    
    private void sortear(){
        Random r = new Random();
        numero = new Random().nextInt(101);
    }
    
    public String chute(int n){
        if(n>this.numero)
            return(n+" é maior que o número!");
        if(n<this.numero)
            return (n+" é menor que o número!");
        this.sortear();
        return ("Você acertou!");
    }
}
