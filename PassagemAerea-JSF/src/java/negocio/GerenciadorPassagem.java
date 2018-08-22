/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import DAO.DAOPassagemDerby;
import java.sql.Timestamp;
import java.util.List;
import model.Passagem;

/**
 *
 * @author caiovosilva
 */
public class GerenciadorPassagem {
    
    public GerenciadorPassagem() {
        this.local  = new Passagem();
        this.dao = new DAOPassagemDerby();
    }
    
    public void setSelecetdPassagem(){
        int id =this.local.getId();
        this.local = dao.getPassagem(id);
    }
    
    public boolean addPassagem(){
        return this.dao.addPassagem(local);
    }
    
    public String atualizarPassagem(){
        return this.dao.updatePassagem(local);
    }
    
    public String apagarPassagem(){
        return this.dao.deletePassagem(local);
    }
    
    public List getPassagems(){
        return dao.buscarTodosPassagems();
    }
    
    public List getPassagemsByNome(){
        return dao.buscarPassagemsByNome(local);
    }
    
    public int getId() {
        return local.getId();
    }

    public void setId(int id) {
        local.setId(id);
    }

    public String getNomePassageiro() {
        return local.getNomePassageiro();
    }

    public void setNomePassageiro(String nomePassageiro) {
        local.setNomePassageiro(nomePassageiro);
    }

    public String getCpf() {
        return local.getCpf();
    }

    public void setCpf(String cpf) {
        local.setCpf(cpf);
    }

    public String getDataNascimento() {
        return local.getDataNascimento();
    }

    public void setDataNascimento(String dataNascimento) {
        local.setDataNascimento(dataNascimento);
    }

    public String getOrigem() {
        return local.getOrigem();
    }

    public void setOrigem(String origem) {
        local.setOrigem(origem);
    }

    public Timestamp getPartida() {
        return local.getPartida();
    }

    public void setPartida(Timestamp partida) {
        local.setPartida(partida);
    }

    public String getDestino() {
        return local.getDestino();
    }

    public void setDestino(String destino) {
        local.setDestino(destino);
    }

    public Timestamp getChegada() {
        return local.getChegada();
    }

    public void setChegada(Timestamp chegada) {
        local.setChegada(chegada);
    }

    public Double getValor() {
        return local.getValor();
    }

    public void setValor(Double valor) {
        local.setValor(valor);
    }
    
    private Passagem local;
    private final DAO.DAOPassagem dao;
    
}
