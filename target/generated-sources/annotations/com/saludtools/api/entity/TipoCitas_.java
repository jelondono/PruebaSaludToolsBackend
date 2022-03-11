package com.saludtools.api.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-03-11T17:04:29")
@StaticMetamodel(TipoCitas.class)
public class TipoCitas_ { 

    public static volatile SingularAttribute<TipoCitas, String> descripcion;
    public static volatile SingularAttribute<TipoCitas, String> color;
    public static volatile SingularAttribute<TipoCitas, Date> fecCreacion;
    public static volatile SingularAttribute<TipoCitas, Integer> duracionMinutos;
    public static volatile SingularAttribute<TipoCitas, Integer> id;
    public static volatile SingularAttribute<TipoCitas, String> nombre;
    public static volatile SingularAttribute<TipoCitas, Date> fecActualizacion;
    public static volatile SingularAttribute<TipoCitas, Boolean> activo;

}