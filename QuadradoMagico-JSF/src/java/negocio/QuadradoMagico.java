/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.Random;

/**
 *
 * @author caiovosilva
 */
public class QuadradoMagico {
    
    private int mat[][]=new int[3][3];

    public QuadradoMagico() {
        this.novoQuadrado();
    }
    
    private void initMat(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mat[i][j]=-1;
            }
        }
    }
    
    private void novoQuadrado(){
        this.initMat();
        Random rand=new Random();
        int qtd=rand.nextInt(5)+1;
        
        for (int i = 0; i < qtd; i++) {
            int linha =rand.nextInt(3);
            int coluna = rand.nextInt(3);
            int valor= rand.nextInt(10);
            mat[linha][coluna]=valor;
        }
    }
    
    public void setP00(int value){
        mat[0][0] = value;
    }
    
    public void setP01(int value){
        mat[0][1] = value;
    }
    
    public void setP02(int value){
        mat[0][2] = value;
    }
    
    public void setP10(int value){
        mat[1][0] = value;
    }
    
    public void setP11(int value){
        mat[1][1] = value;
    }
    
    public void setP12(int value){
        mat[1][2] = value;
    }
    
    public void setP20(int value){
        mat[2][0] = value;
    }
    
    public void setP21(int value){
        mat[2][1] = value;
    }
    
    public void setP22(int value){
        mat[2][2] = value;
    }
}