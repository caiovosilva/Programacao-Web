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
    public boolean PersistirAluno(Aluno aluno);
    public List getAllAlunos();
}
