/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion;

import Modulo.Factura;
import Modulo.Fecha;
import Modulo.Hora;
import java.util.Scanner;

/**
 *
 * @author juancarlosmoguel
 */
public class PruebaFactura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entradadbl= new Scanner(System.in);
        Scanner entradastr= new Scanner(System.in);
        Scanner entradaint= new Scanner (System.in);
        
        System.out.println("Ingresa el nombre del emisor: ");
        String nombreEmisor=entradastr.nextLine();
        
        System.out.println("Ingresa el RFC del emisor: ");
        String rfcEmisor=entradastr.nextLine();
        
        System.out.println("Ingresa el nombre del receptor: ");
        String nombreReceptor=entradastr.nextLine();
        
        System.out.println("Ingresa el RFC del receptor: ");
        String rfcReceptor=entradastr.nextLine();
        
        System.out.println("Ingresa la clave del producto o servicio: ");
        String clave=entradastr.nextLine();
        
        System.out.println("Ingresa la cantidad de servicios: ");
        double cantidadServicios=entradadbl.nextDouble();
        
        System.out.println("Ingresa la descripción del servicio: ");
        String descripcion=entradastr.nextLine();
        
        System.out.println("Ingrese el precio unitario del servicio: ");
        double precioServicio=entradadbl.nextDouble();
        
        System.out.println("Ingrese el dia de emision:");
        int dia=entradaint.nextInt();
        
        System.out.println("Ingrese el mes de emision:");
        int mes=entradaint.nextInt();
        
        System.out.println("Ingrese el año de emision");
        int anio= entradaint.nextInt();
        
        System.out.println("Ingrese la hora (Sin minutos) de la emision: ");
        int hora= entradaint.nextInt();
        
        System.out.println("Ingrese los minutos de la hora de la emision: ");
        int minutos= entradaint.nextInt();
        
        Fecha fecha= new Fecha(dia,mes,anio);
        Hora horas= new Hora(hora,minutos);
        
        Factura facturas = new Factura(nombreEmisor, rfcEmisor, nombreReceptor,rfcReceptor,clave, cantidadServicios,descripcion,precioServicio,fecha,horas);
        
        System.out.println(facturas);
    }
    
}
