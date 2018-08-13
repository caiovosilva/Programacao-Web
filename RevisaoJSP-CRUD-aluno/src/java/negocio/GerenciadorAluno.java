/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import DAO.AlunoDAODerby;
import DAO.IAlunoDAO;
import model.Aluno;

/**
 *
 * @author caiovosilva
 */
public class GerenciadorAluno {
    
    public GerenciadorAluno(){
        alunoDAO = new AlunoDAODerby();
        aluno = new Aluno();
    }
    
    public String getNome() {
        return aluno.getNome();
    }

    public void setNome(String nome) {
        aluno.setNome(nome);
    }

    public int getMatricula() {
        return aluno.getMatricula();
    }

    public void setMatricula(int matricula) {
        aluno.setMatricula(matricula);
    }

    public String getEndereco() {
        return aluno.getEndereco();
    }

    public void setEndereco(String endereco) {
        aluno.setEndereco(endereco);
    }
    
    public String persistirAluno(){
        return alunoDAO.PersistirAluno(aluno);
    }
    
    private IAlunoDAO alunoDAO;
    private Aluno aluno;
}
