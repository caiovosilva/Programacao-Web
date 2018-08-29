/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import DAO.AlunoDAODerby;
import DAO.IAlunoDAO;
import java.util.List;
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

    public void setNota1(double nota) {
        aluno.setNota1(nota);
    }
    
    public double getNota1() {
        return aluno.getNota1();
    }
    
    public void setNota2(double nota) {
        aluno.setNota2(nota);
    }
    
    public double getNota2() {
        return aluno.getNota2();
    }
    
    public void setNota3(double nota) {
        aluno.setNota3(nota);
    }
    
    public double getNota3() {
        return aluno.getNota3();
    }

    public void setEndereco(String endereco) {
        aluno.setEndereco(endereco);
    }
    
    public boolean persistirAluno(){
        return alunoDAO.persistirAluno(aluno);
    }
    
    public List getAllAlunos(){
        return alunoDAO.getAllAlunos();
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    
    public boolean updateAluno(Aluno aluno){
        this.aluno = aluno;
        return alunoDAO.updateAluno(this.aluno);
    }
    
    public boolean removeAluno(Aluno aluno){
        this.aluno = aluno;
        return alunoDAO.removeAluno(this.aluno);
    }
    
    public double mediaNota1(){
        return alunoDAO.mediaNota1();
    }
    
    public double mediaNota2(){
        return alunoDAO.mediaNota2();
    }
    
    public double mediaNota3(){
        return alunoDAO.mediaNota3();
    }
    private IAlunoDAO alunoDAO;
    private Aluno aluno;
}
