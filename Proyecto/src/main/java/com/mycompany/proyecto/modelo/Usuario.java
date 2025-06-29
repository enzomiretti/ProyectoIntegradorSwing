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
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int numeroUsuario;
    @Basic
    private String contraseña;
    private String mail;
    @OneToOne
    private Reserva reserva;
    @OneToMany 
    private ArrayList<Consulta> consultas = new ArrayList();
    @OneToMany 
    private ArrayList<Tarjeta> tarjetas = new ArrayList();
    @OneToOne
    private Persona per;

    public Usuario(int numeroUsuario, String contraseña, String mail, Reserva reserva, Persona per) {
        this.numeroUsuario = numeroUsuario;
        this.contraseña = contraseña;
        this.mail = mail;
        this.reserva = reserva;
        this.per = per;
    }

   

    public Usuario() {
    }

    public int getNumeroUsuario() {
        return numeroUsuario;
    }

    public void setNumeroUsuario(int numeroUsuario) {
        this.numeroUsuario = numeroUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public ArrayList<Consulta> getConsultas() {
        return consultas;
    }

    public void addConsultas(Consulta consultas) {
        this.consultas.add(consultas);
    }

    public ArrayList<Tarjeta> getTarjetas() {
        return tarjetas;
    }

    public void addTarjetas(Tarjeta tarjetas) {
        this.tarjetas.add(tarjetas);
    }

    public Persona getPer() {
        return per;
    }

    public void setPer(Persona per) {
        this.per = per;
    }

    public void setConsultas(ArrayList<Consulta> arrayList) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setTarjetas(ArrayList<Tarjeta> arrayList) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
   
}
