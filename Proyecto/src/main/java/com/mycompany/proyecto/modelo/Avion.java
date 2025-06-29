/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Usuario
 */
@Entity
public class Avion implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;
    @Basic
    private int numeroAvion;
    @OneToMany
    private ArrayList<Asiento> asientos = new ArrayList();

    public Avion(int id, int numeroAvion) {
        this.id = id;
        this.numeroAvion = numeroAvion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    

    public Avion() {
    }

    
    public int getNumeroAvion() {
        return numeroAvion;
    }

    public void setNumeroAvion(int numeroAvion) {
        this.numeroAvion = numeroAvion;
    }

    public ArrayList<Asiento> getAsientos() {
        return asientos;
    }

    public void addAsientos(Asiento asientos) {
        this.asientos.add(asientos);
    }

    public void setAsientos(ArrayList<Asiento> arrayList) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
