/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurascondicionales;

import java.util.Scanner;

/**
 *
 * @author iTC
 */
public class NumeroPositivoNegativo {
     public static void main(String[] args) {
        // TODO code application logic here
        Scanner numero = new Scanner (System.in);
        
        
        System.out.println("Ingrese un número");
        int num = numero.nextInt();
        
        if (num < 0)
            System.out.println("El numero: "+num+" es negativo");
        else
            System.out.println("El numero: "+num+" es positivo");
     }
}
