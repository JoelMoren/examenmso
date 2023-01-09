package com.examen.msousuarios.model;

import javax.persistence.*;

@Entity
@Table(name = "amigos", schema = "public")
public class AmigosDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idamigos", updatable=false)
    private int idamigos;
    @Column(name = "idusuarioorigen")
    private int idusuarioorigen;
    @Column(name = "idusuarioamigo")
    private int idusuarioamigo;

    public AmigosDto() {
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
}
