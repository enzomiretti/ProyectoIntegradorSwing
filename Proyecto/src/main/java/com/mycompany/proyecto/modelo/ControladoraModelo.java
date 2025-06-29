/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto.modelo;

import com.mycompany.proyecto.persistencia.ControladoraPersistencias;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ControladoraModelo {
  ControladoraPersistencias controlPersis = new ControladoraPersistencias();

    public void guardar(int tarifa, String fecha, String aero, int avion, String contraseña, String usuario, String nombre, String apellido, int dni, String ciudad, String aerop, int numeroas, String asiento, String clase, int tarjeta, String tipotarj, int vuelo, int res) {
        Pago pa1 = new Pago();
        pa1.setCantPago(tarifa);
        Fecha f1 = new Fecha();
        f1.setFecha(fecha);
        Aerolinea aero1 = new Aerolinea();
        aero1.setNombreAerolinea(aero);
        Avion a1 = new Avion();
        a1.setNumeroAvion(avion);
        Persona per = new Persona();
        per.setDni(dni);
        per.setApellido(apellido);
        per.setNombre(nombre);
        Usuario usu = new Usuario();
        usu.setContraseña(contraseña);
        usu.setMail(usuario);
        usu.setPer(per);
        Ciudad c1 = new Ciudad();
        c1.setNombreCiudad(ciudad);
        Aeropuerto ae1 = new Aeropuerto();
        ae1.setNombreAeropuerto(aerop);
        ae1.setCiudad(c1);
        Asiento as1 = new Asiento();
        as1.setFilaAsiento(numeroas);
        as1.setLetraAsiento(asiento);
        as1.setClaseAsiento(clase);
        Tarjeta t1 = new Tarjeta();
        t1.setNumTarjeta(tarjeta);
        t1.setTipoTarjeta(nombre);
        t1.setPago(pa1);
        Vuelo v1 = new Vuelo();
        v1.setNumeroVuelo(vuelo);
        v1.setAerolinea(aero1);
        v1.setAvion(a1);
        v1.setFecha(f1);
        Reserva r1 = new Reserva();
        r1.setNumeroReserva(res);
        r1.setPago(pa1);
        r1.setVuelo(v1);
        
        controlPersis.guardar(pa1, f1, aero1, a1, per, usu, c1, ae1, as1, t1, v1, r1);
    }

   public List<Usuario> traerUsuarios() {
        
        return controlPersis.traerUsuario();
    }

    public List<Consulta> traerConsultas() {
        return controlPersis.traerConsultas();
    }

    public List<Reserva> traerReservas() {
        return controlPersis.traerReserva();
    }

    public List<Asiento> traerAsiento() {
        return controlPersis.traerAsiento();
    }

    public List<Aeropuerto> traerAeropuerto() {
        return controlPersis.traerAeropuerto();
    }

    public List<Piloto> traerPilotos() {
        return controlPersis.traerPilotos();
    }
  
}
