/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import model.Aluno;

/**
 *
 * @author caiovosilva
 */
public interface IAlunoDAO {
    public boolean persistirAluno(Aluno aluno);
    public List getAllAlunos();
    public boolean updateAluno(Aluno aluno);
    public boolean removeAluno(Aluno aluno);
    public List getAlunosByName(String name);
    public double mediaNota1();
    public double mediaNota2();
    public double mediaNota3();
}
