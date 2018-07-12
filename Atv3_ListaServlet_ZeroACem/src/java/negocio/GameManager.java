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
    int tentativas;
    int ultimaTentativa;
    public GameManager(){
        this.inicializar();
    }
    
    private void inicializar(){
        this.tentativas=0;
        Random r = new Random();
        this.numero = new Random().nextInt(101);
    }
    
    public String numeroTentativas(){
        return "Número de tentativas: "+this.ultimaTentativa;
    }
    public String chute(int n){
        this.tentativas++;
        this.ultimaTentativa = this.tentativas;
        if(n>this.numero)
            return(n+" é maior que o número!");
        if(n<this.numero)
            return (n+" é menor que o número!");
        this.inicializar();
        if(this.ultimaTentativa>1)
            return ("Você acertou!");
        return ("Você acertou na primeira tentativa!!");
    }
}
