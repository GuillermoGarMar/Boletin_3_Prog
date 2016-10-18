/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg3;

/**
 *
 * @author ggarciamartinez
 */
public class Boletin3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Consumo cons1 = new Consumo ();
        cons1.setL(50);
        cons1.setPG(1.57f);
        int k;
        float l,v,p;
        k=200;
        l=8.9f;
        v=131;
        p=1.7f;
        Consumo cons2 = new Consumo(k,l,v,p);
    }
    
}
