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
public class CalculoConta {
    public double totalGeral(double totalGasto, double percentualGorjeta){
        return totalGasto+(totalGasto*percentualGorjeta/100);
    }
    
    public double totalGeral(){
        return totalGasto+(totalGasto*percentualGorjeta/100);
    }
    
    public double totalPorPessoa(double totalGasto, double percentualGorjeta, int numeroPessoas){
        return (totalGasto+(totalGasto*percentualGorjeta/100))/numeroPessoas;
    }

    public String getResposta() {
        return "total de "+(totalGasto+(totalGasto*percentualGorjeta/100))/numeroPessoas+" por pessoa.";
    }
    
    public void setTotalGasto(double totalGasto) {
        this.totalGasto = totalGasto;
    }

    public void setPercentualGorjeta(double percentualGorjeta) {
        this.percentualGorjeta = percentualGorjeta;
    }

    public void setNumeroPessoas(double numeroPessoas) {
        this.numeroPessoas = numeroPessoas;
    }
    
    private double totalGasto;  
    private double percentualGorjeta;
    private double numeroPessoas;
    private String resposta;
}
