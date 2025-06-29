/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 *
 * @author Usuario
 */
@Entity
public class Tarifa implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;
    @Basic
    private int numeroTarifa;
    private int impuestoTarifa;
    private int precioTarifa;
    private String clase;

    public Tarifa(int id, int numeroTarifa, int impuestoTarifa, int precioTarifa, String clase) {
        this.id = id;
        this.numeroTarifa = numeroTarifa;
        this.impuestoTarifa = impuestoTarifa;
        this.precioTarifa = precioTarifa;
        this.clase = clase;
    }
    
    

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   
   

    public Tarifa(int numeroTarifa, int impuestoTarifa, int precioTarifa) {
        this.numeroTarifa = numeroTarifa;
        this.impuestoTarifa = impuestoTarifa;
        this.precioTarifa = precioTarifa;
    }
    

    public Tarifa() {
    }

    
    public int getNumeroTarifa() {
        return numeroTarifa;
    }

    public void setNumeroTarifa(int numeroTarifa) {
        this.numeroTarifa = numeroTarifa;
    }

    public int getImpuestoTarifa() {
        return impuestoTarifa;
    }

    public void setImpuestoTarifa(int impuestoTarifa) {
        this.impuestoTarifa = impuestoTarifa;
    }

    public int getPrecioTarifa() {
        return precioTarifa;
    }

    public void setPrecioTarifa(int precioTarifa) {
        this.precioTarifa = precioTarifa;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

   
    
    
}
