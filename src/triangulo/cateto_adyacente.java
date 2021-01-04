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
public class cateto_adyacente {
       float hipotenusa,angulo;

    public cateto_adyacente(float hipotenusa, float angulo) {
        this.hipotenusa = hipotenusa;
        this.angulo = angulo;
    }
          public double calculo(){
        float resultado,cos,rad ;
        rad=(float) Math.toRadians(angulo);
        cos=(float) Math.cos(rad);
        resultado=hipotenusa*cos;
        
    return (resultado);
    }
    
}
