package Modelo;
// Generated 08-feb-2016 20:41:39 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Habitacion generated by hbm2java
 */
public class Habitacion  implements java.io.Serializable {


     private Integer idhabitacion;
     private Hotel hotel;
     private Integer numcamas;
     private Set huespeds = new HashSet(0);

    public Habitacion() {
    }

    public Habitacion(Hotel hotel, Integer numcamas, Set huespeds) {
       this.hotel = hotel;
       this.numcamas = numcamas;
       this.huespeds = huespeds;
    }
   
    public Integer getIdhabitacion() {
        return this.idhabitacion;
    }
    
    public void setIdhabitacion(Integer idhabitacion) {
        this.idhabitacion = idhabitacion;
    }
    public Hotel getHotel() {
        return this.hotel;
    }
    
    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
    public Integer getNumcamas() {
        return this.numcamas;
    }
    
    public void setNumcamas(Integer numcamas) {
        this.numcamas = numcamas;
    }
    public Set getHuespeds() {
        return this.huespeds;
    }
    
    public void setHuespeds(Set huespeds) {
        this.huespeds = huespeds;
    }




}


