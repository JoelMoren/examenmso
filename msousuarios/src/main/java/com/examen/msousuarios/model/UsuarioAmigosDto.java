package com.examen.msousuarios.model;

import javax.persistence.Column;

public class UsuarioAmigosDto {

    private int idamigos;
    private int idusuarioorigen;

    private int idusuarioamigo;

    private int idusuario;

    private String nombreusuario;

    private String correo;

    private String claveacceso;

    public UsuarioAmigosDto() {
    }

    public UsuarioAmigosDto(int idamigos, int idusuarioorigen, int idusuarioamigo, int idusuario, String nombreusuario, String correo, String claveacceso) {
        this.idamigos = idamigos;
        this.idusuarioorigen = idusuarioorigen;
        this.idusuarioamigo = idusuarioamigo;
        this.idusuario = idusuario;
        this.nombreusuario = nombreusuario;
        this.correo = correo;
        this.claveacceso = claveacceso;
    }

    public int getIdamigos() {
        return idamigos;
    }

    public void setIdamigos(int idamigos) {
        this.idamigos = idamigos;
    }

    public int getIdusuarioorigen() {
        return idusuarioorigen;
    }

    public void setIdusuarioorigen(int idusuarioorigen) {
        this.idusuarioorigen = idusuarioorigen;
    }

    public int getIdusuarioamigo() {
        return idusuarioamigo;
    }

    public void setIdusuarioamigo(int idusuarioamigo) {
        this.idusuarioamigo = idusuarioamigo;
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
