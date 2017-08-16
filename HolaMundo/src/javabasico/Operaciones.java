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
public class Operaciones {

    public static void main(String[] args) {
    int vint;
    float vfloat;
    String vstring;
    boolean b1, b2;
    Scanner chimba = new Scanner(System.in);
    
    
    vint = 5 + 5;
    System.out.println("vint= 5+5:"+vint);
    vint = 5 - 5;
    System.out.println("vint= 5-5::"+vint);
    vint = 5 * 5;
    System.out.println("vint= 5*5::"+vint);
    vint = 5 % 5;
    System.out.println("vint= 5%5::"+vint);
    vint = 5 ^ 5;
    System.out.println("vint= 5^5::"+vint);
    
    vfloat = 5 + 5;
    System.out.println("vint= 5+5:"+vfloat);
    vfloat = 5 - 5;
    System.out.println("vint= 5-5::"+vfloat);
    vfloat = 5 * 5;
    System.out.println("vint= 5*5::"+vfloat);
    vfloat = 5 % 5;
    System.out.println("vint= 5%5::"+vfloat);
    vfloat = 5 ^ 5;
    System.out.println("vint= 5^5::"+vfloat);
    
    vstring = "fercho";
    vstring= vstring+" diana";
    System.out.println("love "+vstring);
    
    b1= true;
    b2 = false;
    
    System.out.println("b1 and b2: " + (b1 && b2));
        System.out.println("b1 or b2: " + (b1 || b2));
        System.out.println("not b1: " + (!b1));
        System.out.println("not b2: " + (!b2));
        
       System.out.println("introduzca un texo: ");
        System.out.println(chimba.nextLine());
        
    //Ciclos
    int i;
    for( i=0; 1<5; i++)
    {
    System.out.println(i);
    
    }
    
    
    
    }
    
    
    
}
