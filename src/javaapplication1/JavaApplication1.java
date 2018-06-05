/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Notebook1
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        System.out.println("Ingrese numero A");
        String a = input.nextLine();
        
        System.out.println("Ingrese numero B");
        String b = input.nextLine();
        
        float A=Float.parseFloat(a);
        float B=Float.parseFloat(b);
        
        System.out.println("Indique Operacion");
        String operacion= input.nextLine();
        
        Operaciones operar= new Operaciones(operacion,A,B);
        System.out.println("El resultado es: "+ operar.getResultado());
    }
    
}
