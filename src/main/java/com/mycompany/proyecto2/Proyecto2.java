/*
Este es una practica para refrescar la forma basica en la cuel se trabaja con funciones
*/
package com.mycompany.proyecto2;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Proyecto2 {

    public static void main(String[] args) throws IOException {
        //activamos la captura de los datos
        BufferedReader prenda = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader valor = new BufferedReader(new InputStreamReader(System.in));
        //mensajes de que es lo que le solicitamos al usuario
        System.out.println("Ingrese la cantidad de prenda de vestir");
        //realizamos la captura de datos
        String cantidad = prenda.readLine();
        //creamos variable para almacenar la sumatoria de los valores de cada prenda
        Double subtotal = 0.00;
        //creamos ciclo para solicitar el valor de cada una de las prendas
        for (int i = 0; i < Integer.parseInt(cantidad); i++) {
            //mensajes de que es lo que le solicitamos al usuario
            System.out.println("Ingrese el valor de la primera prenda");
            //realizamos la captura de datos
            String precio = valor.readLine();
            subtotal = subtotal + Double.valueOf(precio);
        }
        //creamos variable para cargar el porcentaje de descuento a aplicar
        Integer por_descuento;
        //condicional para determinar el porcentaje de descuento a aplicar
        if (Integer.parseInt(cantidad) < 3){
           por_descuento = 10;
           //Informamos el porcentaje que se aplicara
           System.out.println("Por llevar mas de 3 prendas el descuento es del 10%");
        } else {
            por_descuento = 5;
            //Informamos el porcentaje que se aplicara
            System.out.println("Por llevar mas de 3 prendas el descuento es del 5%");
        }       
        //trabajando con funciones
        subtotal = calcularValor(por_descuento,subtotal);
        double impuesto_final = 0.00;
        impuesto_final = calcularImpuesto(subtotal);
        System.out.println("El valor total a paga es de $"+subtotal+
                " y el impuesto es de $"+impuesto_final);
    }   
        //funcion creada para calcular el subtotal despues del descuento
        private static double calcularValor(Integer por_descuento,Double subtotal){
           //calculamos el subtotal despues del descuento
           double subtotal_descuento = subtotal - ((subtotal * por_descuento) /100);
           //retornamos el valor con descuento aplicado
           return subtotal_descuento; 
        }
        
        private static double calcularImpuesto(Double subtotal_descuento){
        //calculamos el impuesto bajo el descuento
           double impuesto = subtotal_descuento - ((subtotal_descuento * 2) / 1000);
           //retornamos el valor del impuesto 
           return impuesto; 
       }

   
       
        
        
       
    
}
