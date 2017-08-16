/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasico;
import java.util.Scanner;

/**
 *
 * @author Fernando Garzón
 */
public class ejercicios {
     public static void main(String[] args) {
    int num;
    Scanner ejercicio = new Scanner (System.in);
    
    System.out.println("introduzca los numeros: ");
      num = ejercicio.nextInt();
      
     
     int r;  
     int z;
     boolean h;
     h = true;
     for(int i=0; i < 6; i++)
     {
     r = num % 10;
     num = r;
     i++;
     } 
     
     System.out.println();
     }
     
}
