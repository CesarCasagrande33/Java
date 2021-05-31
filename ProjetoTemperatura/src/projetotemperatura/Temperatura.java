/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetotemperatura;

/**
 *
 * @author cesar.liranco
 */
public class Temperatura {
    
    private String nome;
    private int farenheit;

    public float TempKelvin() {
         
         float tempK;
         tempK = ((this.farenheit - 32) * (5/9) + 273);
         
         return tempK;
    }
    
    public float TempCelsius(){
        float tempC;
        tempC = (this.farenheit - 32) * (5/9);
        
        return tempC;
    }
    
    public Temperatura(String nome, int farenheit) {
        this.nome = nome;
        this.farenheit = farenheit;

    }
    
    public int getFarenheit() {
        return farenheit;
    }

    public void setFarenheit(int farenheit) {
        this.farenheit = farenheit;
    }
     public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}