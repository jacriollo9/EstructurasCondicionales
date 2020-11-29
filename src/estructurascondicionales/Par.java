/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurascondicionales;

import java.util.Scanner;
/**
 *
 * @author Usuario iTC
 */
public class Par {
     public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        
        // El numero a verificar si es par
        int num = 0;
        System.out.println("Programa para verificar si es numero es par \n");
        
        System.out.println("Ingresa el numero que decea verificar ");
        
        num = leer.nextInt (); // Leer el numero
        
        if (num % 2 == 0){
            System.out.println("El numero que ha ingresado es par " +num);
        }
    }
}