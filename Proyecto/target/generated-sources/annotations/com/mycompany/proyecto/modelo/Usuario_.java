package com.mycompany.proyecto.modelo;

import com.mycompany.proyecto.modelo.Consulta;
import com.mycompany.proyecto.modelo.Persona;
import com.mycompany.proyecto.modelo.Reserva;
import com.mycompany.proyecto.modelo.Tarjeta;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-06-28T21:31:30", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, Integer> numeroUsuario;
    public static volatile SingularAttribute<Usuario, String> mail;
    public static volatile ListAttribute<Usuario, Tarjeta> tarjetas;
    public static volatile ListAttribute<Usuario, Consulta> consultas;
    public static volatile SingularAttribute<Usuario, Reserva> reserva;
    public static volatile SingularAttribute<Usuario, Persona> per;
    public static volatile SingularAttribute<Usuario, String> contraseña;

}