/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herancacilindro;

/**
 *
 * @author cesar.casagrande
 */
public class HerancaCilindro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cilindro cilindro = new Cilindro(1,1,1,50);
        Circulo circulo = new Circulo(1,1,1);
        
        System.out.println("area cilindro: " + cilindro.toString());
        System.out.println("area Cilindro: " + cilindro.area());
        System.out.println("-----------------------------------------");
        System.out.println("area cilindro: " + circulo.toString());
        System.out.println("area circulo: " + circulo.area());
        
    }
    
}
