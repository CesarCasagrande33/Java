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
public class ponto {
    
        protected float  x, y;

        public ponto(){
            x = y = 0;
        }
        
        public ponto(float x, float y){
            setPonto(x,y);                
        }
        
        public void setPonto(float x, float y) {
            this.x = x;
            this.y = y;
        }
        
        public float getX() {
            return x;
        }
        public float getY() {
            return y;
        }
        
        public String toString() {
            return "[" + x + ", " + y + "]";
        }
      
}
