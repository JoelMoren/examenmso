package com.examen.msomensajeria.model;

import javax.persistence.*;

@Entity
@Table(name = "chats", schema = "public")
public class ChatsDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idchat", updatable=false)
    private int idchat;
    @Column(name = "idusuarioorigen")
    private int idusuarioorigen;
    @Column(name = "idusuariodestino")
    private int idusuariodestino;


    public ChatsDto() {
    }


    public int getIdchat() {
        return idchat;
    }

    public void setIdchat(int idchat) {
        this.idchat = idchat;
    }

    public int getIdusuarioorigen() {
        return idusuarioorigen;
    }

    public void setIdusuarioorigen(int idusuarioorigen) {
        this.idusuarioorigen = idusuarioorigen;
    }

    public int getIdusuariodestino() {
        return idusuariodestino;
    }

    public void setIdusuariodestino(int idusuariodestino) {
        this.idusuariodestino = idusuariodestino;
    }
}
