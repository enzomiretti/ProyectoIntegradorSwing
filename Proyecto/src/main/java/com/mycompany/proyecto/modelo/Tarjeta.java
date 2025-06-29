/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author Usuario
 */
@Entity
public class Tarjeta implements Serializable {
    @Id
    private int numTarjeta;
    @Basic
    private String tipoTarjeta;
    @OneToOne
    private Pago pago;
    

    public Tarjeta(int numTarjeta, String tipoTarjeta, Pago pago) {
        this.numTarjeta = numTarjeta;
        this.tipoTarjeta = tipoTarjeta;
        this.pago = pago;
        
    }

    
    

   
    public Tarjeta() {
    }

    public int getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(int numTarjeta) {
        this.numTarjeta = numTarjeta;
    }


    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }

    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    
    
}
