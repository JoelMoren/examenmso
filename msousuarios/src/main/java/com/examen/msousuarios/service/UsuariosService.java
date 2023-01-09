package com.examen.msousuarios.service;

import com.examen.msousuarios.model.*;
import com.examen.msousuarios.repository.AmigosRepository;
import com.examen.msousuarios.repository.PerfilRepository;
import com.examen.msousuarios.repository.UsuariosRepository;
import com.examen.msousuarios.service.remote.async.MensajeriaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Tuple;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class UsuariosService {

    @Autowired
    private UsuariosRepository usuariosRepository;

    @Autowired
    private PerfilRepository perfilRepository;

    @Autowired
    private AmigosRepository amigosRepository;

    @Autowired
    private MensajeriaProducer mensajeriaProducer;

    public RespuestaApi registraUsuario(UsuarioDto usuarioDto){
        RespuestaApi respuestaApi= new RespuestaApi();
        respuestaApi.setResultado(usuariosRepository.save(usuarioDto));
        respuestaApi.setMensaje("Operacion exitosa");
        return respuestaApi;
    }


    public RespuestaApi mostarUsuariosAll(){
        RespuestaApi respuestaApi= new RespuestaApi();
        respuestaApi.setResultado(usuariosRepository.findAll());
        respuestaApi.setMensaje("Operacion exitosa");
        return respuestaApi;
    }

    public RespuestaApi mostarUsuario(int idUsuario){
        RespuestaApi respuestaApi= new RespuestaApi();
        respuestaApi.setResultado(usuariosRepository.findByIdUsuario(idUsuario));
        respuestaApi.setMensaje("Operacion exitosa");
        return respuestaApi;
    }

    @Transactional
    public RespuestaApi eliminaUsuario(int idUsuario){
        System.out.println("Eliminando usuario......");
        RespuestaApi respuestaApi= new RespuestaApi();
        respuestaApi.setResultado(usuariosRepository.deleteByIdUsuario(idUsuario));
        respuestaApi.setMensaje("Operacion exitosa");

        mensajeriaProducer.sendDelete(idUsuario);

        return respuestaApi;
    }

    public RespuestaApi registraPerfil(PerfilDto perfilDto){
        RespuestaApi respuestaApi= new RespuestaApi();
        respuestaApi.setResultado(perfilRepository.save(perfilDto));
        respuestaApi.setMensaje("Operacion exitosa");
        return respuestaApi;
    }

    public RespuestaApi mostrarPerfilUsuario(int idUsuario){
        RespuestaApi respuestaApi= new RespuestaApi();
        respuestaApi.setResultado(perfilRepository.findByIdUsuario(idUsuario));
        respuestaApi.setMensaje("Operacion exitosa");
        return respuestaApi;
    }

    public RespuestaApi eliminaPerfilUsuario(int idUsuario){
        RespuestaApi respuestaApi= new RespuestaApi();
        respuestaApi.setResultado(perfilRepository.deleteByIdUsuario(idUsuario));
        respuestaApi.setMensaje("Operacion exitosa");
        return respuestaApi;
    }

    public RespuestaApi registraAmigos(AmigosDto amigosDto){
        RespuestaApi respuestaApi= new RespuestaApi();
        respuestaApi.setResultado(amigosRepository.save(amigosDto));
        respuestaApi.setMensaje("Operacion exitosa");
        return respuestaApi;
    }

    public RespuestaApi amigosUsuario(int idUsuario){
        RespuestaApi respuestaApi= new RespuestaApi();

        List<Tuple> resultado= amigosRepository.findByIdUsuario(idUsuario);

        List<UsuarioAmigosDto> listaTransfromada= new ArrayList<>();
        for (Tuple item: resultado) {
            listaTransfromada.add(
                    new UsuarioAmigosDto((Integer) item.get("idamigos"),
                            (Integer)item.get("idusuarioorigen"),
                            (Integer)item.get("idusuarioamigo"),
                            (Integer)item.get("idusuario"),
                            (String)item.get("nombreusuario"),
                            (String)item.get("correo"),
                            (String)item.get("claveacceso")
                            )
            );
            System.out.println("*************------------  "+item.get("nombreusuario"));

        }


        respuestaApi.setResultado(listaTransfromada);
        respuestaApi.setMensaje("Operacion exitosa");
        return respuestaApi;
    }


    public RespuestaApi eliminaamigosUsuario(int idUsuario){
        RespuestaApi respuestaApi= new RespuestaApi();
        respuestaApi.setResultado(amigosRepository.deleteByIdUsuarioOrigen(idUsuario));
        respuestaApi.setMensaje("Operacion exitosa");
        return respuestaApi;
    }




}
