package com.examen.msousuarios.model;

import javax.persistence.*;

@Entity
@Table(name = "perfil", schema = "public")
public class PerfilDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idperfil", updatable=false)
    private int idperfil;
    @Column(name = "idusuario")
    private int idusuario;
    @Column(name = "nombrecompleto")

    private String nombrecompleto;

    public PerfilDto() {
    }

    public int getIdperfil() {
        return idperfil;
    }

    public void setIdperfil(int idperfil) {
        this.idperfil = idperfil;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getNombrecompleto() {
        return nombrecompleto;
    }

    public void setNombrecompleto(String nombrecompleto) {
        this.nombrecompleto = nombrecompleto;
    }
}
