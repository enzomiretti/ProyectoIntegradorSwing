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
public class Asiento implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;
    @Basic
    private int filaAsiento;
    private String letraAsiento;
    private String claseAsiento;
    

    public Asiento(int id, int filaAsiento, String letraAsiento, String claseAsiento) {
        this.id = id;
        this.filaAsiento = filaAsiento;
        this.letraAsiento = letraAsiento;
        this.claseAsiento = claseAsiento;
      
    }

   
    

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    

    public Asiento() {
    }

    public int getFilaAsiento() {
        return filaAsiento;
    }

    public void setFilaAsiento(int filaAsiento) {
        this.filaAsiento = filaAsiento;
    }

    public String getLetraAsiento() {
        return letraAsiento;
    }

    public void setLetraAsiento(String letraAsiento) {
        this.letraAsiento = letraAsiento;
    }

    public String getClaseAsiento() {
        return claseAsiento;
    }

    public void setClaseAsiento(String claseAsiento) {
        this.claseAsiento = claseAsiento;
    }
    
    
}
