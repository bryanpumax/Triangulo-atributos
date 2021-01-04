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
public class Catetoopuesto {
    float hipotenusa,angulo;

    public Catetoopuesto(float hipotenusa, float angulo) {
        this.hipotenusa = hipotenusa;
        this.angulo = angulo;
    }
    public double calculo(){
        float resultado,sen,rad ;
          rad=(float) Math.toRadians(angulo);
        sen=(float) Math.sin(rad);
        resultado=hipotenusa*sen;
        
    return (resultado);
    }
    
}
