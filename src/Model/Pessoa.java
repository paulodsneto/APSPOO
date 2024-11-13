/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author vinic
 */
abstract  public class Pessoa {
    
    protected String nome;
    protected String email;
    protected String telefone;
    
    public Pessoa(String nome){ this.nome = nome;};
    
    public Pessoa( String nome, String email, String telefone){
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    };
    
    public String getNome(){return this.nome;};
    public String getEmail(){return this.email;};
    public String getTelefone(){return this.telefone;};
    
    public void setNome(String nome){this.nome = nome;};
    public void setEmail(String email){this.email = email;};
    public void setTelefone(String telefone){this.telefone = telefone;};
    
    
    
    
    
}
