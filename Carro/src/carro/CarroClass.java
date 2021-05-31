/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carro;

/**
 *
 * @author cesar.casagrande
 */
public class CarroClass {
    private  String  placa;
    private int autonomia;
    private int distancia;
    private boolean ligado;
    
    public CarroClass() {
    
        this.placa = "Coloque uma placa";
        this.autonomia = 0;
        this.distancia = 0;
        this.ligado = false;
        
    }
    
    public CarroClass(String a, int b, int c, boolean d){
        this.placa = a;
        this.autonomia = b;
        this.distancia = c;
        this.ligado = d;
    }
    
    public float CalcMedia(int b, int c){
        float calcMedia;
        calcMedia = b / c;
        return calcMedia;
    }
    

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int c) {
        this.distancia = c;
    }
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int b) {
        this.autonomia = b;
    }
    public void setLigado(boolean ligado){
        this.ligado = ligado;
    }
    public boolean getLigado() {
        return ligado;
    }
    
 
  
    
}
