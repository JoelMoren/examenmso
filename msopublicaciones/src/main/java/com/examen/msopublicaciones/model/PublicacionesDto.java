package com.examen.msopublicaciones.model;

import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name = "publicaciones", schema = "public")
public class PublicacionesDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpublicacion", updatable=false)
    private int idpublicacion;
    @Column(name = "contenidopublicacion")
    private String contenidopublicacion;
    @Column(name = "fechapublicacion")
    private Timestamp fechapublicacion;
    @Column(name = "idusuario")
    private int idusuario;


    public PublicacionesDto() {
    }

    public int getIdpublicacion() {
        return idpublicacion;
    }

    public void setIdpublicacion(int idpublicacion) {
        this.idpublicacion = idpublicacion;
    }

    public String getContenidopublicacion() {
        return contenidopublicacion;
    }

    public void setContenidopublicacion(String contenidopublicacion) {
        this.contenidopublicacion = contenidopublicacion;
    }

    public Timestamp getFechapublicacion() {
        return fechapublicacion;
    }

    public void setFechapublicacion(Timestamp fechapublicacion) {
        this.fechapublicacion = fechapublicacion;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }
}
