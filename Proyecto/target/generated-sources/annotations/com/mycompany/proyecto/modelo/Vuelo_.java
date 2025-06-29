package com.mycompany.proyecto.modelo;

import com.mycompany.proyecto.modelo.Aerolinea;
import com.mycompany.proyecto.modelo.Aeropuerto;
import com.mycompany.proyecto.modelo.Avion;
import com.mycompany.proyecto.modelo.Fecha;
import com.mycompany.proyecto.modelo.Piloto;
import com.mycompany.proyecto.modelo.Tarifa;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-06-28T21:31:30", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Vuelo.class)
public class Vuelo_ { 

    public static volatile SingularAttribute<Vuelo, Fecha> fecha;
    public static volatile SingularAttribute<Vuelo, Aerolinea> aerolinea;
    public static volatile ListAttribute<Vuelo, Tarifa> tarifas;
    public static volatile ListAttribute<Vuelo, Aeropuerto> aeropuertos;
    public static volatile SingularAttribute<Vuelo, Integer> id;
    public static volatile SingularAttribute<Vuelo, Avion> avion;
    public static volatile SingularAttribute<Vuelo, Piloto> piloto;
    public static volatile SingularAttribute<Vuelo, Integer> numeroVuelo;

}