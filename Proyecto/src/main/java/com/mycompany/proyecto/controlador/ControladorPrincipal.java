/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto.controlador;

import com.mycompany.proyecto.UI.Consultas;
import com.mycompany.proyecto.UI.Principal;
import com.mycompany.proyecto.UI.Reservas;
import com.mycompany.proyecto.modelo.ControladoraModelo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Usuario
 */
public class ControladorPrincipal implements ActionListener {
    private Principal p;
    private ControladoraModelo ctr;
    
    public ControladorPrincipal(Principal p, ControladoraModelo ctr){
    this.p = p;
    this.ctr = ctr;
    this.p.setVisible(true);
    this.p.jButton2.addActionListener(this);
    this.p.jButton3.addActionListener(this);
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource().equals(p.jButton2)){
        Consultas con = new Consultas();
        con.setVisible(true);
        con.setLocationRelativeTo(null);
        ControladorConsultas a = new ControladorConsultas(con,ctr);
        
       }
       else if(e.getSource().equals(p.jButton3)){
        
        Reservas res = new Reservas();
        res.setVisible(true);
        res.setLocationRelativeTo(null);
        ControladorReservas a = new ControladorReservas( res,  ctr);
       }
       
    }
    }
