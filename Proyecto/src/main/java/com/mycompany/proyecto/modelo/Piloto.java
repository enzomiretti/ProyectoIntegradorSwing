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
import javax.persistence.OneToOne;

/**
 *
 * @author Usuario
 */
@Entity
public class Piloto implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;
    @Basic
    private int numeroPiloto;
    @OneToOne
    private Persona per;

    public Piloto(int id, int numeroPiloto, Persona per) {
        this.id = id;
        this.numeroPiloto = numeroPiloto;
        this.per = per;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   

    public Persona getPer() {
        return per;
    }

    public void setPer(Persona per) {
        this.per = per;
    }
    
    
    
    public Piloto() {
    }

    public int getNumeroPiloto() {
        return numeroPiloto;
    }

    public void setNumeroPiloto(int numeroPiloto) {
        this.numeroPiloto = numeroPiloto;
    }

   
    
}
