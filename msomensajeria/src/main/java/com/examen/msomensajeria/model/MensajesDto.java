package com.examen.msomensajeria.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "mensajes", schema = "public")
public class MensajesDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idmensaje", updatable=false)
    private int idmensaje;
    @Column(name = "idchat")
    private int idchat;
    @Column(name = "fechahora")
    private Timestamp fechahora;
    @Column(name = "texto")
    private String texto;
    @Column(name = "visto")
    private boolean visto;

    public MensajesDto() {
    }

    public int getIdmensaje() {
        return idmensaje;
    }

    public void setIdmensaje(int idmensaje) {
        this.idmensaje = idmensaje;
    }

    public int getIdchat() {
        return idchat;
    }

    public void setIdchat(int idchat) {
        this.idchat = idchat;
    }

    public Timestamp getFechahora() {
        return fechahora;
    }

    public void setFechahora(Timestamp fechahora) {
        this.fechahora = fechahora;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public boolean isVisto() {
        return visto;
    }

    public void setVisto(boolean visto) {
        this.visto = visto;
    }
}
