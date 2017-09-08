/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo;

/**
 *
 * @author juancarlosmoguel
 */
public class Factura {
    private String nombreEmisor;
    private String rfcEmisor;
    private String nombreReceptor;
    private String rfcRecepetor;
    private String clave;
    private double cantidadServicios;
    private String descripcionServicio;
    private double precioServicio;
    private Fecha fechaEmision; 
    private Hora horaEmision;

    public Factura(String nombreEmisor, String rfcEmisor, String nombreReceptor, String rfcRecepetor, String clave, double cantidadServicios, String descripcionServicio, double precioServicio, Fecha fechaEmision, Hora horaEmision) {
        this.nombreEmisor = nombreEmisor;
        this.rfcEmisor = rfcEmisor;
        this.nombreReceptor = nombreReceptor;
        this.rfcRecepetor = rfcRecepetor;
        this.clave = clave;
        this.cantidadServicios = cantidadServicios;
        this.descripcionServicio = descripcionServicio;
        this.precioServicio = precioServicio;
        this.fechaEmision = fechaEmision;
        this.horaEmision = horaEmision;
        
    }
    
    public void setNombreEmisor(String nombreEmisor) {
        this.nombreEmisor = nombreEmisor;
    }

    public void setRfcEmisor(String rfcEmisor) {
        this.rfcEmisor = rfcEmisor;
    }

    public void setNombreReceptor(String nombreReceptor) {
        this.nombreReceptor = nombreReceptor;
    }

    public void setRfcRecepetor(String rfcRecepetor) {
        this.rfcRecepetor = rfcRecepetor;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setCantidadServicios(double cantidadServicios) {
        this.cantidadServicios =((cantidadServicios<0)? 0: cantidadServicios);
    }

    public void setDescripcionServicio(String descripcionServicio) {
        this.descripcionServicio = descripcionServicio;
    }

    public void setPrecioServicio(double precioServicio) {
        this.precioServicio = ((precioServicio<0)? 0: precioServicio);
    }

    public void setFechaEmision(Fecha fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public void setHoraEmision(Hora horaEmision) {
        this.horaEmision = horaEmision;
    }
    
    
    
    
    
    
    
    //Metodos Get

    public String getNombreEmisor() {
        return nombreEmisor;
    }

    public String getRfcEmisor() {
        return rfcEmisor;
    }

    public String getNombreReceptor() {
        return nombreReceptor;
    }

    public String getRfcRecepetor() {
        return rfcRecepetor;
    }

    public String getClave() {
        return clave;
    }

    public double getCantidadServicios() {
        return cantidadServicios;
    }

    public String getDescripcionServicio() {
        return descripcionServicio;
    }

    public double getPrecioServicio() {
        return precioServicio;
    }

    public Fecha getFechaEmision() {
        return fechaEmision;
    }

    public Hora getHoraEmision() {
        return horaEmision;
    }
    
    

    
    
    //Otros metodos
    
    public double obtenerFactura(){
        return getCantidadServicios()*getPrecioServicio();
    }

    @Override
    public String toString() {
        return "Factura:" + "\nNombre del Emisor: " + getNombreEmisor() + ",\nRFC del Emisor:" + getRfcEmisor() + "\nNombre del Receptor: " + getNombreReceptor() + "\nRFC del Recepetor: " + getRfcRecepetor() + "\nClave del Servicio: " + getClave() + "\nCantidad de Servicios: " + getCantidadServicios() + "\nDescripcion del Servicio: " + getDescripcionServicio() + "\nPrecio del Servicio=" + getPrecioServicio() + "\nFecha de Emision=" + getFechaEmision() + "\nHora Emision: " + getHoraEmision() + "\nEl monto de la factura es: " + obtenerFactura();
    }
    
    
    
}
