package com.mycompany.proyecto.modelo;

import com.mycompany.proyecto.modelo.Asiento;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-06-28T21:31:30", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Avion.class)
public class Avion_ { 

    public static volatile ListAttribute<Avion, Asiento> asientos;
    public static volatile SingularAttribute<Avion, Integer> id;
    public static volatile SingularAttribute<Avion, Integer> numeroAvion;

}