/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import DAO.DaoPessoaDerby;

/**
 *
 * @author caiov
 */
public class Agenda {
    
    public Agenda(){
        pessoa = new Pessoa();
    }
    public void setNome(String nome){
        pessoa.setNome(nome);
    }
    public void setCpf(String cpf){
        pessoa.setCpf(cpf);
    }
    public void setTelefone(String tel){
        pessoa.setTelefone(tel);
    }
    public String getPersistirPessoa(){
        DaoPessoaDerby daoPessoa = new DaoPessoaDerby();
        return daoPessoa.addPessoas(pessoa);
    }
    public String getResposta() {
        return resposta;
    }
    
    private String resposta;
    private Pessoa pessoa;
}
