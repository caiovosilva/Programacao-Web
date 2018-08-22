/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import model.Passagem;

/**
 *
 * @author caiovosilva
 */
public interface DAOPassagem {
    
    public boolean addPassagem(Passagem passagem) ;
    public List buscarPassagemsByNome(Passagem passagem);
    public List buscarTodosPassagems();
    public Passagem getPassagem(int id);
    public String updatePassagem(Passagem passagem);
    public String deletePassagem(Passagem passagem);
}
