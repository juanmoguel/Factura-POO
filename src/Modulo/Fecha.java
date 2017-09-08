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
public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    //Constructor
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    
    //Metodo get

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }
     
    
    //Metodo set

    public void setDia(int dia) {
        this.dia = ((dia<=0 || dia>7)? 1:dia);
    }

    public void setMes(int mes) {
        this.mes = ((mes<=0 || mes>12)? 1:mes);
    }

    public void setAnio(int anio) {
        this.anio = ((anio<0 || anio>2017)? 1:anio);
    }

    @Override
    public String toString() {
        return  getDia() + "/" + getMes() + "/" + getAnio();
    }
    
    
    
   
}
