/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Projeto;
import View.Agendamento;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vinic
 */
public class AgendamentoController {
    
    private final Agendamento view;
    private Projeto projeto;
    
    public AgendamentoController(Agendamento view){
        this.view = view;
    };
    
    public void createProjeto(){
        
        String nome = this.view.getTextProjeto();
        String solicitante = this.view.getTextSolicitante();
        String data = this.view.getTextData();
        String descricao = this.view.getTextDescricao();
        
        Projeto projeto = new Projeto(nome, solicitante, data, descricao);
        this.projeto = projeto;
        addToList();
        
    };
    
    public void addToList(){
        
        ArrayList<Projeto> listaProjeto = new ArrayList();
        listaProjeto.add(this.projeto);
        addToTable(listaProjeto);
        
    };
    
    public void addToTable(ArrayList<Projeto> listaProjeto){
        
        DefaultTableModel tableModel = (DefaultTableModel) this.view.getjTable1().getModel();
        //tableModel.setNumRows(0);
        
      
    
        for (Projeto projeto : listaProjeto ) {
            
            System.out.println("ERRORRRR");
            
            tableModel.addRow(new Object[]{
                projeto.getNome(),
                projeto.getSolicitante(),
                projeto.getData(),
                projeto.getDescricao(),
            });
        }
    };
    
    
}
