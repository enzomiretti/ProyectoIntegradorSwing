/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto.persistencia;

import com.mycompany.proyecto.modelo.Aerolinea;
import com.mycompany.proyecto.modelo.Avion;
import com.mycompany.proyecto.modelo.Fecha;
import com.mycompany.proyecto.modelo.Pago;
import com.mycompany.proyecto.modelo.Persona;
import com.mycompany.proyecto.modelo.Reserva;
import com.mycompany.proyecto.modelo.Vuelo;
import com.mycompany.proyecto.modelo.Usuario;
import com.mycompany.proyecto.modelo.Tarjeta;
import com.mycompany.proyecto.modelo.Ciudad;
import com.mycompany.proyecto.modelo.Aeropuerto;
import com.mycompany.proyecto.modelo.Asiento;
import com.mycompany.proyecto.modelo.Consulta;
import com.mycompany.proyecto.modelo.Piloto;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class ControladoraPersistencias {
    AerolineaJpaController aeroJpa = new AerolineaJpaController();
    AeropuertoJpaController aeropJpa = new AeropuertoJpaController();
    AsientoJpaController asiJpa = new AsientoJpaController();
    AvionJpaController avJpa = new AvionJpaController();
    CiudadJpaController ciJpa = new CiudadJpaController();
    ConsultaJpaController conJpa = new ConsultaJpaController();
    FechaJpaController feJpa = new FechaJpaController();
    PagoJpaController paJpa = new PagoJpaController();
    PersonaJpaController peJpa = new PersonaJpaController();
    PilotoJpaController pilJpa = new PilotoJpaController();
    ReservaJpaController reJpa = new ReservaJpaController();
    TarifaJpaController taJpa = new TarifaJpaController();
    TarjetaJpaController tarJpa = new TarjetaJpaController();
    UsuarioJpaController usJpa = new UsuarioJpaController();
    VueloJpaController vuJpa = new VueloJpaController();

    public void guardar(Pago pa1, Fecha f1, Aerolinea aero, Avion a1, Persona p1, Usuario u1, Ciudad c1, Aeropuerto ae1, Asiento as1, Tarjeta t1, Vuelo v1, Reserva r1) {
        try {
            paJpa.create(pa1);
            feJpa.create(f1);
            aeroJpa.create(aero);
            avJpa.create(a1);
            peJpa.create(p1);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencias.class.getName()).log(Level.SEVERE, null, ex);
        }
            usJpa.create(u1);
            ciJpa.create(c1);
            aeropJpa.create(ae1);
            asiJpa.create(as1);
        try {
            tarJpa.create(t1);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencias.class.getName()).log(Level.SEVERE, null, ex);
        }
        vuJpa.create(v1);
        reJpa.create(r1);
        
        
        
        
        
        
       
        
    }

   public List<Usuario> traerUsuario() {
        return usJpa.findUsuarioEntities();
    }

    public List<Consulta> traerConsultas() {
        return conJpa.findConsultaEntities();
    }

    public List<Reserva> traerReserva() {
        return reJpa.findReservaEntities();
    }

    public List<Asiento> traerAsiento() {
        return asiJpa.findAsientoEntities();
    }

    public List<Aeropuerto> traerAeropuerto() {
        return aeropJpa.findAeropuertoEntities();
    }

    public List<Piloto> traerPilotos() {
        return pilJpa.findPilotoEntities();
    }
    
    
    
}
