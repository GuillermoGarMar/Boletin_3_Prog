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
public class Consumo {
    private int km;
    private float l,vm,pgas;
    public Consumo (){
        km=0;
        l=0;
        vm=0;
        pgas=0;
    }
    public Consumo (int k,float li,float v,float p){
        km=k;
        l=li;
        vm=v;
        pgas=p;
    }
    public int getT (){
        int tiempo =0;
        return tiempo;
    }
    public float consumoMedio(){
        float cm = l/100;
        return cm;
    }
    public float consumoEuros (){
        float cm = l/100;
        float dolars = cm*pgas;
        return dolars;
    }
    public void setKm(int h){
        km = h;
    }
    public void setL(float h){
        l = h;
    }
    public void setV(float h){
        vm = h;
    }
    public void setPG(float h){
        pgas = h;
    }
}
