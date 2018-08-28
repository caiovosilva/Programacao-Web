/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.io.IOException;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import model.Aluno;
import negocio.GerenciadorAluno;
import org.primefaces.event.CellEditEvent;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author caiovosilva
 */
@Named(value = "alunosManagedBean")
@SessionScoped
public class AlunosManagedBean implements Serializable {

    /**
     * Creates a new instance of PassagensManagedBean
     */
    public AlunosManagedBean() {
        gerenciadorAluno = new GerenciadorAluno();
    }
    
    public List<Aluno> getAllAlunos(){
        return gerenciadorAluno.getAllAlunos();
    }
    
    public void onRowEdit(RowEditEvent event) {
//        FacesMessage msg = new FacesMessage("Aluno Editada", Integer.toString(((Aluno) event.getObject()).getId()));
//        FacesContext.getCurrentInstance().addMessage(null, msg);
//        
//        FacesContext context = FacesContext.getCurrentInstance();
//        boolean resultado = gerenciadorAluno.atualizarAluno();  
//        
//        if(resultado)
//            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Persistência", "Aluno cadastrada com sucesso!"));
//        else
//            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Persistência", "ERRO ao cadastrar aluno!"));
    }
     
    public void onRowCancel(RowEditEvent event) {
//        FacesMessage msg = new FacesMessage("Edição Cancelada", Integer.toString(((Aluno) event.getObject()).getId()));
//        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
     
    public void onCellEdit(CellEditEvent event) {
//        Object oldValue = event.getOldValue();
//        Object newValue = event.getNewValue();
//         
//        if(newValue != null && !newValue.equals(oldValue)) {
//            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Cell Changed", "Old: " + oldValue + ", New:" + newValue);
//            FacesContext.getCurrentInstance().addMessage(null, msg);
//        }
    }
    
    public void buscar(){
//        ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
//        try {
//            context.dispatch("buscar.xhtml");
//        } catch (IOException ex) {
//            Logger.getLogger(BibliotecaManagedBean.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
    
    public void cadastrar(){
        FacesContext context = FacesContext.getCurrentInstance();
        boolean resultado = gerenciadorAluno.persistirAluno();  
        
        if(resultado)
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Persistência", "Aluno cadastrada com sucesso!"));
        else
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Persistência", "ERRO ao cadastrar aluno!"));
    }    

    public GerenciadorAluno getGerenciadorAluno() {
        return gerenciadorAluno;
    }
    
    private GerenciadorAluno gerenciadorAluno;
    
}
