/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Notebook1
 */
public class  Operaciones {
    private float resultado;
    public Operaciones(String signo,float A, float B) {
        
        switch(signo){
            case "+":
                suma(A,B);
                break;
            case "-":
                resta(A,B);
                break;
            case "*":
                multiplicacion(A,B);
                break;
            case "/":
                division(A,B);
                break;
        }
    }
    
    
    private float suma(float A, float B){
         resultado=A+B;
         return resultado;
    }
    private float resta(float A, float B){
        resultado=A-B;
         return resultado;
    }        
    private float multiplicacion(float A, float B){
         resultado=A*B;
         return resultado;
    }  
    private float division(float A, float B){
         resultado=A/B;
         return resultado;
    } 

    public float getResultado() {
        return resultado;
    }
    
    
}
