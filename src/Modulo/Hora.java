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
public class Hora {
private int horas;
private int minutos;



    public Hora(int horas, int minutos) {
        this.horas = horas;
        this.minutos = minutos;
    }
    
    //Metodos get

    public int getHoras() {
        return horas;
    }

    public int getMinutos() {
        return minutos;
    }
    
  //Metodos set
    
    public void setHoras(int horas) {
        this.horas = ((horas<=0 || horas>24)? 00:horas);
    }

    public void setMinutos(int minutos) {
        this.minutos = ((minutos<=0 || minutos>59)? 00:minutos);
    }

    @Override
    public String toString() {
        return getHoras() +":"+ getMinutos();
    }
    
    

    

  
}
