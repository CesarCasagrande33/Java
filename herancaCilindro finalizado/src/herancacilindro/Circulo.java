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
public class Circulo extends ponto {

        
        protected float raio;
        
        public Circulo() {
            setRaio(0);
        }
        
        public Circulo (float x, float y, float raio) {
            super(x, y);
            setRaio(raio);
        }
    
        public void setRaio(float raio) {
            if(raio <= 0) raio = 0;
            this.raio = raio;
        }
        
        public float getRaio (){
            return raio;
        }
        
        public double area() {
        
            return Math.PI * raio * raio;
            
        }
        public String toString() {
            return "Centro= " + super.toString()+ "Raio= " + raio;
        }
        
}
