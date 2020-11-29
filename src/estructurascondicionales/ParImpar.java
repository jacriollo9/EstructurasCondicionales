/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurascondicionales;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class ParImpar {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        
        //Inicializar y declarar las variables
        
        int num =0; // Valor que almacena el número a verificar
        String tipo =""; //Valor que se asigna para o impar 
        
        System.out.println("Programa para verificar si el programa es par o impar \n");
        
        System.out.println("Ingrese el numero a verificar: ");
        
        num = leer.nextInt();//Ingresa el numero
        
        //Condicion para verificar si el numero es para o impar
        if (num % 2 == 0){
            
            tipo = "Par";//Si la condicion es verdadera se asigna"Par"
        }
        else {
            tipo = "Impar";//Si la condicion es falsa se asigna"Impar"
        }
        System.out.println("El numero "+num+" es "+tipo);
    }
    
}
