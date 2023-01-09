package com.examen.msopublicaciones.service;

import com.examen.msopublicaciones.model.ComentariosDto;
import com.examen.msopublicaciones.model.PublicacionesDto;
import com.examen.msopublicaciones.model.RespuestaApi;
import com.examen.msopublicaciones.repository.ComentariosRepository;
import com.examen.msopublicaciones.repository.PublicacionesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PublicacionesService {


    @Autowired
    PublicacionesRepository publicacionesRepository;

    @Autowired
    ComentariosRepository comentariosRepository;


    public RespuestaApi registraPublicacion(PublicacionesDto publicacionesDto){
        RespuestaApi respuestaApi= new RespuestaApi();
        respuestaApi.setResultado(publicacionesRepository.save(publicacionesDto));
        respuestaApi.setMensaje("Operacion exitosa");
        return respuestaApi;
    }


    public RespuestaApi mostrarPublicacionesAll(){
        RespuestaApi respuestaApi= new RespuestaApi();
        respuestaApi.setResultado(publicacionesRepository.findAll());
        respuestaApi.setMensaje("Operacion exitosa");
        return respuestaApi;
    }

    public RespuestaApi mostrarPublicacionesUsuario(int idUsuario){
        RespuestaApi respuestaApi= new RespuestaApi();
        respuestaApi.setResultado(publicacionesRepository.findByIdUsuario(idUsuario));
        respuestaApi.setMensaje("Operacion exitosa");
        return respuestaApi;
    }



    public RespuestaApi registraComentario(ComentariosDto comentariosDto){
        RespuestaApi respuestaApi= new RespuestaApi();
        respuestaApi.setResultado(comentariosRepository.save(comentariosDto));
        respuestaApi.setMensaje("Operacion exitosa");
        return respuestaApi;
    }

    public RespuestaApi mostrarComentariosPublicaciones(int idPublicacion){
        RespuestaApi respuestaApi= new RespuestaApi();
        respuestaApi.setResultado(comentariosRepository.findByIdUsuario(idPublicacion));
        respuestaApi.setMensaje("Operacion exitosa");
        return respuestaApi;
    }

}
