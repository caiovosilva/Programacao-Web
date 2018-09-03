/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import model.Aluno;
import negocio.GerenciadorAluno;
import org.primefaces.event.CellEditEvent;
import org.primefaces.event.RowEditEvent;
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.BarChartModel;
import org.primefaces.model.chart.BubbleChartModel;
import org.primefaces.model.chart.BubbleChartSeries;
import org.primefaces.model.chart.ChartSeries;

/**
 *
 * @author caiovosilva
 */
//@Named(value = "alunosManagedBean")
@ManagedBean(name="alunosManagedBean")
@ViewScoped
public class AlunosManagedBean implements Serializable{

    public AlunosManagedBean() {
        gerenciadorAluno = new GerenciadorAluno();
        listaAlunos = new ArrayList<Aluno>();
    }
    
    @PostConstruct
    public void init() {
        atualizar();
        createBarModel();
        createBubbleModel();
    }
    
    public List<Aluno> getAlunos(){
        return listaAlunos;
    }
    
      public void onRowEdit(RowEditEvent event) {     
        FacesContext context = FacesContext.getCurrentInstance();
        Aluno a = (Aluno) event.getObject();
        boolean resultado = gerenciadorAluno.updateAluno((Aluno) event.getObject());  
        
        if(resultado)
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Atualização", "Aluno atualizado com sucesso!"));
        else
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Atualização", "ERRO ao atualizar aluno!"));
    }
     
    public void onRowCancel(RowEditEvent event) {
//        FacesMessage msg = new FacesMessage("Edit Cancelled", Integer.toString(((Aluno) event.getObject()).getId()));
//        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
     
    public void onCellEdit(CellEditEvent event) {
        Object oldValue = event.getOldValue();
        Object newValue = event.getNewValue();
         
        if(newValue != null && !newValue.equals(oldValue)) {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Cell Changed", "Old: " + oldValue + ", New:" + newValue);
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
    }
    
    public void atualizar(){
        listaAlunos = gerenciadorAluno.getAllAlunos();
        createBarModel();
        createBubbleModel();
    }
    
    public void cadastrar(){
        FacesContext context = FacesContext.getCurrentInstance();
        boolean resultado = gerenciadorAluno.persistirAluno();  
        
        if(resultado)
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Persistência", "Aluno cadastrado com sucesso!"));
        else
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Persistência", "ERRO ao cadastrar aluno!"));
        atualizar();
    }
    
    public void buscarPorNome(){
        listaAlunos = gerenciadorAluno.buscarAlunoPorNome();
    }
    
    public void remove(Aluno aluno) {
        FacesContext context = FacesContext.getCurrentInstance();
        boolean resultado = gerenciadorAluno.removeAluno(aluno);  
        
        if(resultado)
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Remoção", "Aluno apagado com sucesso!"));
        else
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Remoção", "ERRO ao apagar aluno!"));
        atualizar();
    }

    public BarChartModel getBarModel() {
        return barModel;
    }
    
    public GerenciadorAluno getGerenciadorAluno() {
        return gerenciadorAluno;
    }
    
    public BubbleChartModel getBubbleModel() {
        return bubbleModel;
    }
    
    private void createBarModel() {
        barModel = new BarChartModel();
        ChartSeries notas = new ChartSeries();
        notas.setLabel("Notas");
        notas.set("Nota 1", gerenciadorAluno.mediaNota1());
        notas.set("Nota 2", gerenciadorAluno.mediaNota2());
        notas.set("Nota 3", gerenciadorAluno.mediaNota3());
        barModel.addSeries(notas);      
        barModel.setTitle("MÉDIA DE NOTAS DOS ALUNOS");
        barModel.setLegendPosition("ne");   
        Axis yAxis = barModel.getAxis(AxisType.Y);
        yAxis.setLabel("Média");
        yAxis.setMin(0);
        yAxis.setMax(10);
    }
    
    private void createBubbleModel(){
        bubbleModel = new BubbleChartModel();
        for(Aluno aluno: listaAlunos){
            double media = ((aluno.getNota1() + aluno.getNota2() + aluno.getNota3()) / 3);
            int intMedia = (int) Math.round(media*10);
            bubbleModel.add(new BubbleChartSeries(aluno.getNome(), listaAlunos.indexOf(aluno)+1, intMedia, intMedia));
        }    
        
        bubbleModel.setTitle("Bubble Chart");
        Axis yAxis = bubbleModel.getAxis(AxisType.Y);
        yAxis.setMin(0);
        yAxis.setMax(100);
        yAxis.setLabel("Média");
        Axis xAxis = bubbleModel.getAxis(AxisType.X);
        xAxis.setMin(0);
        xAxis.setMax(listaAlunos.size());
        xAxis.setLabel("Lugar na lista");
     
    }
     
    
    private List<Aluno> listaAlunos;
    private GerenciadorAluno gerenciadorAluno;
    private BarChartModel barModel;
    private BubbleChartModel bubbleModel;
}
