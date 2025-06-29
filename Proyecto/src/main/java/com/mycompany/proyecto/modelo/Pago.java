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
public class Pago implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int numPago;
    @Basic
    private int cantPago;

    public Pago(int numPago, int cantPago) {
        this.numPago = numPago;
        this.cantPago = cantPago;
    }

    public Pago() {
    }

    
    public int getNumPago() {
        return numPago;
    }

    public void setNumPago(int numPago) {
        this.numPago = numPago;
    }

    public int getCantPago() {
        return cantPago;
    }

    public void setCantPago(int cantPago) {
        this.cantPago = cantPago;
    }
    
}
