/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saludtools.api.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 *
 * @author eljua
 */
@Entity
@Table(name = "tbs_tipocitas")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "TipoCitas.findAll", query = "SELECT t FROM TipoCitas t"),
        @NamedQuery(name = "TipoCitas.findById", query = "SELECT t FROM TipoCitas t WHERE t.id = :id"),
        @NamedQuery(name = "TipoCitas.findByNombre", query = "SELECT t FROM TipoCitas t WHERE t.nombre = :nombre"),
        @NamedQuery(name = "TipoCitas.findByDescripcion", query = "SELECT t FROM TipoCitas t WHERE t.descripcion = :descripcion"),
        @NamedQuery(name = "TipoCitas.findByColor", query = "SELECT t FROM TipoCitas t WHERE t.color = :color"),
        @NamedQuery(name = "TipoCitas.findByDuracionMinutos", query = "SELECT t FROM TipoCitas t WHERE t.duracionMinutos = :duracionMinutos"),
        @NamedQuery(name = "TipoCitas.findByActivo", query = "SELECT t FROM TipoCitas t WHERE t.activo = :activo"),
        @NamedQuery(name = "TipoCitas.findByFecCreacion", query = "SELECT t FROM TipoCitas t WHERE t.fecCreacion = :fecCreacion"),
        @NamedQuery(name = "TipoCitas.findByFecActualizacion", query = "SELECT t FROM TipoCitas t WHERE t.fecActualizacion = :fecActualizacion") })
public class TipoCitas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "color")
    private String color;
    @Basic(optional = false)
    @NotNull
    @Column(name = "duracionMinutos")
    private int duracionMinutos;
    @Basic(optional = false)
    @NotNull
    @Column(name = "activo")
    private Boolean activo;
    @Basic(optional = false)
    @NotNull
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm", timezone = "America/Bogota")
    @Column(name = "fecCreacion")
    private Date fecCreacion;
    @Column(name = "fecActualizacion")
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm", timezone = "America/Bogota")
    private Date fecActualizacion;

    public TipoCitas() {
    }

    public TipoCitas(Integer id) {
        this.id = id;
    }

    public TipoCitas(Integer id, String nombre, String descripcion, String color, int duracionMinutos, Boolean activo,
            Date fecCreacion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.color = color;
        this.duracionMinutos = duracionMinutos;
        this.activo = activo;
        this.fecCreacion = fecCreacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public Date getFecCreacion() {
        return fecCreacion;
    }

    public void setFecCreacion(Date fecCreacion) {
        this.fecCreacion = fecCreacion;
    }

    public Date getFecActualizacion() {
        return fecActualizacion;
    }

    public void setFecActualizacion(Date fecActualizacion) {
        this.fecActualizacion = fecActualizacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoCitas)) {
            return false;
        }
        TipoCitas other = (TipoCitas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.saludtools.api.entity.TipoCitas[ id=" + id + " ]";
    }

}
