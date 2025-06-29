package com.mycompany.proyecto.modelo;

import com.mycompany.proyecto.modelo.Vuelo;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-06-28T21:31:30", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Consulta.class)
public class Consulta_ { 

    public static volatile SingularAttribute<Consulta, Integer> id;
    public static volatile SingularAttribute<Consulta, Vuelo> vuelo;
    public static volatile SingularAttribute<Consulta, Integer> numeroConsulta;

}