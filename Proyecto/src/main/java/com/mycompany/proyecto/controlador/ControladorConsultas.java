/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto.controlador;

import com.mycompany.proyecto.UI.Consultas;
import com.mycompany.proyecto.modelo.Aeropuerto;
import com.mycompany.proyecto.modelo.Asiento;
import com.mycompany.proyecto.modelo.Consulta;
import com.mycompany.proyecto.modelo.Usuario;
import com.mycompany.proyecto.modelo.ControladoraModelo;
import com.mycompany.proyecto.modelo.Piloto;
import com.mycompany.proyecto.modelo.Reserva;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public final class ControladorConsultas implements ActionListener {
    private Consultas c1;
    private ControladoraModelo ctr; 
    public ControladorConsultas(Consultas c1, ControladoraModelo ctr){
    this.c1 = c1;
    this.ctr = ctr;
    this.c1.setVisible(true);
    this.c1.tablaUsuarios.setVisible(true);
    cargarConsultas();
    this.c1.tablaUsuarios1.setVisible(true);
    cargarConsultas1();
    
    this.c1.tablaUsuarios2.setVisible(true);
    cargarReservas();
    this.c1.tablaUsuarios3.setVisible(true);
    cargarReservas1();
    this.c1.tablaUsuarios4.setVisible(true);
    cargarReservas2();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
    
    }
    public void cargarConsultas(){
    DefaultTableModel tabla = new DefaultTableModel(){
       
        @Override
        public boolean isCellEditable (int row, int column){
            return false;
        }
    };
    String titulos[] = {"DNI","NOMBRE","APELLIDO","N° USUARIO","CORREO"};
    tabla.setColumnIdentifiers(titulos);
    
    List<Usuario> listaUsu = ctr.traerUsuarios();
    
    
    if(listaUsu!=null){
        for(Usuario usu : listaUsu){
            Object[] objeto ={usu.getPer().getDni(),usu.getPer().getNombre(),usu.getPer().getApellido()
            ,usu.getNumeroUsuario(),usu.getMail()};
        tabla.addRow(objeto);
        
        }
    }
    
     this.c1.tablaUsuarios.setModel(tabla);
    }
    public void cargarConsultas1(){
    DefaultTableModel tabla = new DefaultTableModel(){
       
        @Override
        public boolean isCellEditable (int row, int column){
            return false;
        }
    };
    String titulos1[] = {"N°Consulta","N°Vuelo","N° Avion","Fecha","Aerolinea","N° Piloto","Nombre","Apellido","Usuario"};
    tabla.setColumnIdentifiers(titulos1);
    
    List<Consulta> listaCon = ctr.traerConsultas();
    
    
    if(listaCon!=null){
        for(Consulta con : listaCon){
            Object[] objeto ={con.getNumeroConsulta(),con.getVuelo().getNumeroVuelo(),con.getVuelo().getAvion().getNumeroAvion(),con.getVuelo().getFecha().getFecha(),con.getVuelo().getAerolinea().getNombreAerolinea(),con.getVuelo().getPiloto().getNumeroPiloto(),con.getVuelo().getPiloto().getPer().getNombre(),con.getVuelo().getPiloto().getPer().getApellido(),"1"};
        tabla.addRow(objeto);
        
        }
    }
    this.c1.tablaUsuarios1.setModel(tabla);
    };
    
    public void cargarReservas(){
    DefaultTableModel tabla = new DefaultTableModel(){
       
        @Override
        public boolean isCellEditable (int row, int column){
            return false;
        }
    };
    String titulos2[] = {"N° Reserva","N° Vuelo","Tarifa","Aerolinea","Fecha"};
    tabla.setColumnIdentifiers(titulos2);
    
    List<Reserva> listare = ctr.traerReservas();
    
    
    if(listare!=null){
        for(Reserva re : listare){
            Object[] objeto ={re.getNumeroReserva(),re.getVuelo().getNumeroVuelo(),re.getPago().getCantPago(),re.getVuelo().getAerolinea().getNombreAerolinea(),re.getVuelo().getFecha().getFecha()};
        tabla.addRow(objeto);
        
        }
    }
    this.c1.tablaUsuarios2.setModel(tabla);
    };
    public void cargarReservas1(){
    DefaultTableModel tabla = new DefaultTableModel(){
       
        @Override
        public boolean isCellEditable (int row, int column){
            return false;
        }
    };
    String titulos2[] = {"Asiento","Fila","Clase",};
    tabla.setColumnIdentifiers(titulos2);
    
    List<Asiento> listaas = ctr.traerAsiento();
    
    
    if(listaas!=null){
        for(Asiento as : listaas){
            Object[] objeto ={as.getFilaAsiento(),as.getLetraAsiento(),as.getClaseAsiento()};
        tabla.addRow(objeto);
        
        }
    }
    this.c1.tablaUsuarios3.setModel(tabla);
    };
    public void cargarReservas2(){
    DefaultTableModel tabla = new DefaultTableModel(){
       
        @Override
        public boolean isCellEditable (int row, int column){
            return false;
        }
    };
    String titulos2[] = {"Aeropuerto","Destino"};
    tabla.setColumnIdentifiers(titulos2);
    
    List<Aeropuerto> listaae = ctr.traerAeropuerto();
    
    
    if(listaae!=null){
        for(Aeropuerto ae : listaae){
            Object[] objeto ={ae.getNombreAeropuerto(), ae.getCiudad().getNombreCiudad()};
        tabla.addRow(objeto);
        
        }
    }
    this.c1.tablaUsuarios4.setModel(tabla);
    };
    }
