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
public class Carro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CarroClass eu = new CarroClass();
        CarroClass carroB = new CarroClass("BRA2E19", 10, 120, true);
        float media;
        eu.setAutonomia(10);
        eu.setDistancia(100);
        System.out.println("Meu carro Edenilson Dias");
        System.out.println("Placa do carro: " +eu.getPlaca());
        System.out.println("Autonomia: " + eu.getAutonomia());
        System.out.println("Distancia percorrida: " + eu.getDistancia());
        media = eu.CalcMedia(eu.getDistancia(), eu.getAutonomia());
        System.out.println("Média de consumo: " + media);
        System.out.println("Ligado ou desligado: " + eu.getLigado());
        System.out.println("-----------------------------------------");
        System.out.println("Carro do professor");
        System.out.println("Placa do carro: " + carroB.getPlaca());
        System.out.println("Autonomia: " + carroB.getAutonomia());
        System.out.println("Distancia percorrida: " + carroB.getDistancia());
        media = carroB.CalcMedia(carroB.getDistancia(), carroB.getAutonomia());
        System.out.println("Média de consumo: " + media);
        System.out.println("Ligado ou desligado: " + carroB.getLigado());
    }
    
}
