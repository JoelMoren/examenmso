package com.examen.msousuarios.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "usuarios", schema = "public")
public class UsuarioDto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idusuario", updatable=false)
    private int idusuario;
    @Column(name = "nombreusuario")
    private String nombreusuario;
    @Column(name = "correo")
    private String correo;
    @Column(name = "claveacceso")
    private String claveacceso;

    public UsuarioDto() {
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getNombreusuario() {
        return nombreusuario;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClaveacceso() {
        return claveacceso;
    }

    public void setClaveacceso(String claveacceso) {
        this.claveacceso = claveacceso;
    }
}
