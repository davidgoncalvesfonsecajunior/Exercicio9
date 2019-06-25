/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public abstract class Animal {

    private String nome;

    public Animal(String n) {
        this.setNome(n);

    }

    public void imprime() {
        System.out.println("nome: " + this.getNome());

    }

    public abstract void talk();

    public String getNome() {
        return nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }
}
