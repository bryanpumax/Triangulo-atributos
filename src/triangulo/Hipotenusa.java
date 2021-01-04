/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulo;

/**
 *
 * @author BRYAN
 */
public class Hipotenusa {
        float lado,angulo;

    public Hipotenusa(float lado, float angulo) {
        this.lado = lado;
        this.angulo = angulo;
    }

    
          public double calculo(){
        float resultado,tan,rad ;
        rad=(float) Math.toRadians(angulo);
        tan=(float) Math.tan(rad);
        resultado=lado*tan;
        
    return (resultado);
    }
}
