/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import model.Passagem;
import negocio.GerenciadorPassagem;
import org.primefaces.event.CellEditEvent;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author caiovosilva
 */
@Named(value = "passagensManagedBean")
@SessionScoped
public class PassagensManagedBean implements Serializable {

    /**
     * Creates a new instance of PassagensManagedBean
     */
    public PassagensManagedBean() {
        gerenciadorPassagem = new GerenciadorPassagem();
    }
    
    public List<Passagem> getAllPassagens(){
        return gerenciadorPassagem.getPassagems();
    }
    
    public void onRowEdit(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Passagem Editada", Integer.toString(((Passagem) event.getObject()).getId()));
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
     
    public void onRowCancel(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Edição Cancelada", Integer.toString(((Passagem) event.getObject()).getId()));
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
     
    public void onCellEdit(CellEditEvent event) {
        Object oldValue = event.getOldValue();
        Object newValue = event.getNewValue();
         
        if(newValue != null && !newValue.equals(oldValue)) {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Cell Changed", "Old: " + oldValue + ", New:" + newValue);
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
    }
    
    private GerenciadorPassagem gerenciadorPassagem;
    
}
