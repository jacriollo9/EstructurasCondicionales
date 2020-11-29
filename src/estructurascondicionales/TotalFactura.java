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
public class TotalFactura {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        
        //Inicializar y declarar las variables
         double subtotal,total,descuentos;
         int limite1, limite2;
         
         subtotal = 0; total = 0; descuentos = 0;
         limite1 = 200; limite2 = 500;
        
         System.out.println("Programa para calcular el valor total de una factura con descuentos \n");
         
         //Ingresar datos de entrada
         System.out.println("Ingrese el subtotal de la compra: ");
         subtotal = leer.nextDouble();
         
         //Proceso para determinar el descuento en base al subtotal de compra
         if ((subtotal >= limite1) && (100 >= limite2)){
             descuentos = 0.10;
        }
         else {
             if (subtotal >= limite2){
                 descuentos = 0.15;
             }
         }
         if (subtotal< limite1){
             System.out.println("No hay un descuento por su compra por que el valor es menor a 200 dolares");
    }
         total= subtotal - (subtotal * descuentos);
         
         //Presenta la salida de resultados
         System.out.println("El tota de la factura es: "+total+ "con un descuento de "+descuentos);
    }
}
