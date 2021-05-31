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
public class Cilindro extends Circulo {
    
   protected float altura;
   
   public Cilindro() {
       setAltura(0);
   }
   
   public Cilindro (float x, float y, float raio, float alt){       
       super(x,y,raio);
       setAltura(alt);
   }
   
   public void setAltura(float alt) {
       if(altura <= 0) altura = 0;
       this.altura = alt;
   }
   
   public float getAltura () {
       return altura;
   }
   
   public double area() {
        return 2 * super.area() + Math.PI * raio * raio;  
   }
   
   public String toString() {
       return super.toString() + "Altura= " + altura;
   }
    
}
