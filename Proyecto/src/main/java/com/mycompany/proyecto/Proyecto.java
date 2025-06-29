/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto;


import com.mycompany.proyecto.UI.Principal;
import com.mycompany.proyecto.controlador.ControladorPrincipal;
import com.mycompany.proyecto.modelo.ControladoraModelo;



/**
 *
 * @author Usuario
 */
public class Proyecto {

    public static void main(String[] args) {
        System.out.println("Hello World!");

Principal p1 = new Principal();
          ControladoraModelo c1 = new ControladoraModelo();
          ControladorPrincipal cp1 = new ControladorPrincipal(p1,c1);
    }
}
