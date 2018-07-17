/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author caiov
 */
public class QuadradoMagico {
    private int[][] matriz;
    
    public QuadradoMagico(){
        preencherParcialmente();
    }
    
    public void preencherParcialmente(){
        int [][] quadrado = new int[3][3];
        
        this.matriz = quadrado;
    }
    
    public int[][] getMatriz(){
        return this.matriz;
    }
    public String verificarQuadrado(int [][] quadrado){
        return "sim ou nao";
    }
}
