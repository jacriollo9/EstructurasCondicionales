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
public class MayorTresNumeros {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Programa para saber cual es el mayor de tres numeros en condiciones simples \n");
        // Declaración e inicialización de variables
        int Num1, Num2, Num3;
        Num1 = 0; Num2 = 0; Num3 = 0;
        
        System.out.println("Ingrese el primer numero");
        Num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        Num2 = leer.nextInt();
        System.out.println("Ingrese el tercer numero");
        Num3 = leer.nextInt();
        
        if ((Num1 > Num2) && (Num1 > Num3)){
            System.out.println("El numero mayor que has ingresado es: " +Num1);
        }
         else {
             if   ((Num2 > Num1) && (Num2 > Num3)){
                System.out.println("El numero mayor que has ingresado es: " +Num2);
             }
         }
        if ((Num3 > Num1) && (Num3 > Num2)){
                System.out.println("El numero mayor que has ingresado es: " +Num3);
    }
           
        System.out.println("");
        System.out.println("Programa para saber cual es el mayor de tres numeros en condiciones Compuestas \n");
        // Declaración e inicialización de variables
        System.out.println("Ingrese el primer numero");
        Num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        Num2 = leer.nextInt();
        System.out.println("Ingrese el tercer numero");
        Num3 = leer.nextInt();
        
        if ((Num1 > Num2) && (Num1 > Num3)){
            System.out.println("El numero mayor que has ingresado es: " +Num1);
        }
            else{
            System.out.println("");   
        }
        if ((Num2 > Num1) && (Num2 > Num3)){
            System.out.println("El numero mayor que has ingresado es: " +Num2);
        }
            else{
            System.out.println("");   
        }
        if ((Num3 > Num1) && (Num3 > Num2)){
            System.out.println("El numero mayor que has ingresado es: " +Num3);
        }
            else{
            System.out.println("");   
        }
        
        System.out.println("");
        System.out.println("Programa para saber cual es el mayor de tres numeros en condiciones anidadas \n");
        // Declaración e inicialización de variables
        System.out.println("Ingrese el primer numero");
        Num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        Num2 = leer.nextInt();
        System.out.println("Ingrese el tercer numero");
        Num3 = leer.nextInt();
        if ((Num1 > Num2) && (Num1 > Num3)){
                System.out.println("El numero mayor que has ingresado es: " +Num1);
            }
            else{
                if ((Num2 > Num1) && (Num2 > Num3)){ 
                    System.out.println("El numero mayor que has ingresado es: " +Num2);
                }else{
                    if ((Num3 > Num1) && (Num3 > Num2)){
                    System.out.println("El numero mayor que has ingresado es: " +Num3);
                }
            }
        }
    }
}





