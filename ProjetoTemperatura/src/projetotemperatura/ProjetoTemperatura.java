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
public class ProjetoTemperatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Temperatura eu = new Temperatura("Cesar Casagrande", 88);
        
        System.out.println("-------------------------------------------");
        
        System.out.println("Aluno................: " + eu.getNome());
        System.out.println("Temperatura Farenheit: " + eu.getFarenheit());
        System.out.println("Temperatura Celsius..: " + eu.TempCelsius());
        System.out.println("Temperatura Kelvin...:" + eu.TempKelvin());
        
        System.out.println("-------------------------------------------");
    }
    
}
    
