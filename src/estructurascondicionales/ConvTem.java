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
public class ConvTem {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        
        //Inicializar y declarar las variables
        
        double gC, gF, gK;
        
        gC = 0; gF = 0; gC = 0;
        
        System.out.println("Programa para convertir de grados Centigrados"
              +" a grados Farenhey y a grados Kelvin \n ");
        
        System.out.println("Ingrese los grados centigrados");
        
        gC = leer.nextDouble ();
        
        //Condicio para conversion de grados de temperatura
        
        if (gC > 0){
          gF = (gC * 9/5)+32;
          gK = (gC + 273.15);
          
          System.out.println("La equivalencia en grados farenhey es: " +gC);
          System.out.println("La equivalencia en grados kelvin es: "+gK);
        } 
    }
}
