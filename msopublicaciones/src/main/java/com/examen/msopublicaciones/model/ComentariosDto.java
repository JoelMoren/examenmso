package com.examen.msopublicaciones.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "comentarios", schema = "public")
public class ComentariosDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcomentario", updatable=false)
    private int idcomentario;
    @Column(name = "idpublicacion")
    private int idpublicacion;
    @Column(name = "contenidocomentario")
    private String contenidocomentario;
    @Column(name = "fechacomentario")
    private Timestamp fechacomentario;


    public ComentariosDto() {
    }

    public int getIdcomentario() {
        return idcomentario;
    }

    public void setIdcomentario(int idcomentario) {
        this.idcomentario = idcomentario;
    }

    public int getIdpublicacion() {
        return idpublicacion;
    }

    public void setIdpublicacion(int idpublicacion) {
        this.idpublicacion = idpublicacion;
    }

    public String getContenidocomentario() {
        return contenidocomentario;
    }

    public void setContenidocomentario(String contenidocomentario) {
        this.contenidocomentario = contenidocomentario;
    }

    public Timestamp getFechacomentario() {
        return fechacomentario;
    }

    public void setFechacomentario(Timestamp fechacomentario) {
        this.fechacomentario = fechacomentario;
    }
}
