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
import javax.persistence.OneToOne;

/**
 *
 * @author Usuario
 */
@Entity
public class Vuelo implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;
    @Basic
    private int numeroVuelo;
    @OneToOne
    private Avion avion;
    @OneToMany
    private ArrayList<Aeropuerto> aeropuertos = new ArrayList();
    @OneToOne
    private Fecha fecha;
    @OneToOne
    private Piloto piloto;
    @OneToOne
    private Aerolinea aerolinea;
    @OneToMany
    private ArrayList<Tarifa> tarifas = new ArrayList();

    public Vuelo(int id, int numeroVuelo, Avion avion, Fecha fecha, Piloto piloto, Aerolinea aerolinea) {
        this.id = id;
        this.numeroVuelo = numeroVuelo;
        this.avion = avion;
        this.fecha = fecha;
        this.piloto = piloto;
        this.aerolinea = aerolinea;
    }

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    

   

    
    public Vuelo() {
    }

    public int getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(int numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public ArrayList<Tarifa> getTarifas() {
        return tarifas;
    }

    public void addTarifas(Tarifa tarifas) {
        this.tarifas.add(tarifas);
    }

  

    public ArrayList<Aeropuerto> getAeropuertos() {
        return aeropuertos;
    }

    public void addAeropuertos(Aeropuerto aeropuertos) {
        this.aeropuertos.add(aeropuertos);
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public Aerolinea getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(Aerolinea aerolinea) {
        this.aerolinea = aerolinea;
    }

    public void setAeropuertos(ArrayList<Aeropuerto> arrayList) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
