/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;


import Model.Usuario;
import View.Agendamento;
import View.Login;
import java.util.ArrayList;
/**
 *
 * @author vinic
 */
public class LoginController {

    private final Login view;
    private int access;
    private ArrayList<Usuario> listaUser = new ArrayList<>();
    
    public LoginController(Login view){ 
        this.view = view; 
    };
    
    public void createUser(){
        
        Usuario usuario = new Usuario("Vinicius", 1, "vinicius");
        Usuario usuario2 = new Usuario("Raiza", 2, "raiza");
        Usuario usuario3 = new Usuario("Ana", 3, "ana");
        
       
        this.listaUser.add(usuario);
        this.listaUser.add(usuario2);
        this.listaUser.add(usuario3);
        
        taskDone();
    
    };
    
    public void taskDone(){ 
        
        String nome  = this.view.getTextUser();
        String senha = this.view.getTextPassword();
        
        for (Usuario user : this.listaUser) {
            
            if(nome.equals(user.getNome())){
                
                if(senha.equals(user.getSenha())){
                    
                    this.access = 1;
                    break;
                    
                }else{this.access = 3;};
                
            }else{this.access = 2;};
        };
        
        if(this.access == 1){
            this.view.exibeMensagem("Acesso Autorizado");
            new Agendamento(nome).setVisible(true);
            this.view.setVisible(false);
            
        }else if(this.access == 2){
            this.view.exibeMensagem("Usuario Incorreto!!!");
            
        }else if(this.access == 3){
            this.view.exibeMensagem("Senha Incorreta!!!");
        };
    };
    
}
