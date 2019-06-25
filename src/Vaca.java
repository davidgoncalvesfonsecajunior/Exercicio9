/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class Vaca extends Mamifero {
    
    private boolean temLeite;

    public Vaca(String n, int p, boolean t) {

        super(n, p);
        this.setTemLeite(t);

    }

    public boolean isTemLeite() {
        return temLeite;
    }

    public void setTemLeite(boolean t) {
        this.temLeite = t;
    }

    @Override
    public void talk() {

        System.out.println("Som: Muuu");
    }
    
}
