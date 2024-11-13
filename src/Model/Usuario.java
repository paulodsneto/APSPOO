/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author vinic
 */
public class Usuario extends Pessoa{
    
    protected int id;
    protected String senha;

    public Usuario(String nome, int id, String senha) {
        super(nome);
        this.id = id;
        this.senha = senha;
    }
    
    public int getID(){return this.id;};
    public String getSenha(){return this.senha;};
    
    public void setID(int id){ this.id = id;};
    public void setSenha(String senha){ this.senha = senha;};
    
}
