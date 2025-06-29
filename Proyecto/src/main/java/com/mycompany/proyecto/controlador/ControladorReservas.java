/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto.controlador;

import com.mycompany.proyecto.UI.Reservas;
import com.mycompany.proyecto.modelo.ControladoraModelo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Usuario
 */
public class ControladorReservas implements ActionListener {
    //ControladoraModelo control = new ControladoraModelo();
    private Reservas r;
    private ControladoraModelo ctr;
    public ControladorReservas(Reservas r, ControladoraModelo ctr){
    this.r = r;
    this.ctr = ctr;
    this.r.setVisible(true);
    this.r.btnLimpiar.addActionListener(this);
    this.r.btnReservar.addActionListener(this);
    
    
}

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource().equals(r.btnReservar)){
        
        int tarifa = Integer.parseInt(this.r.txtTarifa.getText());
        String fecha = this.r.txtFecha.getText();
        String aero = this.r.txtAerolinea.getText();
        int avion = Integer.parseInt(this.r.txtAvion.getText());
        String contraseña = this.r.txtContrase.getText();
        String usuario = this.r.txtUsuario.getText();
        String nombre = this.r.txtNombre.getText();
        String apellido = this.r.txtApellido.getText();
        int dni = Integer.parseInt(this.r.txtDni.getText());
        String ciudad = this.r.txtCiudad.getText();
        String aerop = this.r.txtAeropuerto.getText();
        int fila = Integer.parseInt(this.r.txtAsiento.getText());
        String asiento = this.r.txtFila.getText();
        String clase = (String)this.r.cmbClaseAsiento.getSelectedItem();
        int tarjeta = Integer.parseInt(this.r.txtTarjeta.getText());
        String tipotarj = (String)this.r.cmbTipotarjeta.getSelectedItem();
        int vuelo = Integer.parseInt(this.r.txtVuelo.getText());
        int res = Integer.parseInt(this.r.txtReserva.getText());
       ctr.guardar(tarifa, fecha, aero, avion, contraseña, usuario, nombre, apellido, dni, ciudad, aerop, fila, asiento, clase, tarjeta, tipotarj, vuelo, res);
       
       
        }else if(e.getSource().equals(r.btnLimpiar)){
    this.r.txtAerolinea.setText("");
    this.r.txtUsuario.setText("");
    this.r.txtApellido.setText("");
    this.r.txtAsiento.setText("");
    this.r.txtAvion.setText("");
    this.r.txtCiudad.setText("");
    this.r.txtDni.setText("");
    this.r.txtFecha.setText("");
    this.r.txtNombre.setText("");
    this.r.txtPAgo.setText("");
    this.r.txtReserva.setText("");
    this.r.txtTarifa.setText("");
    this.r.txtTarjeta.setText("");
    this.r.txtVuelo.setText("");
    this.r.txtAeropuerto.setText("");
    this.r.txtContrase.setText("");
    this.r.txtFila.setText("");
    this.r.cmbTipotarjeta.setSelectedIndex(0);
    this.r.cmbClaseAsiento.setSelectedIndex(0);
    
    }
}
}
