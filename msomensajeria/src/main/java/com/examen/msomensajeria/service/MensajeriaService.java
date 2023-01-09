package com.examen.msomensajeria.service;


import com.examen.msomensajeria.model.ChatsDto;
import com.examen.msomensajeria.model.MensajesDto;
import com.examen.msomensajeria.model.RespuestaApi;
import com.examen.msomensajeria.repository.ChatsRepository;
import com.examen.msomensajeria.repository.MensajesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MensajeriaService {

    @Autowired
    MensajesRepository mensajesRepository;

    @Autowired
    ChatsRepository chatsRepository;

    public RespuestaApi registraChat(ChatsDto chatsDto){
        RespuestaApi respuestaApi= new RespuestaApi();
        respuestaApi.setResultado(chatsRepository.save(chatsDto));
        respuestaApi.setMensaje("Operacion exitosa");
        return respuestaApi;
    }

    public RespuestaApi mostrarAllChats(){
        RespuestaApi respuestaApi= new RespuestaApi();
        respuestaApi.setResultado(chatsRepository.findAll());
        respuestaApi.setMensaje("Operacion exitosa");
        return respuestaApi;
    }

    public RespuestaApi mostrarChatsUsuario(int idUsuarioOrigen){
        RespuestaApi respuestaApi= new RespuestaApi();
        respuestaApi.setResultado(chatsRepository.findByIdUsuarioOrigen(idUsuarioOrigen));
        respuestaApi.setMensaje("Operacion exitosa");
        return respuestaApi;
    }

    public RespuestaApi eliminaChatsUsuario(int idUsuarioOrigen){
        RespuestaApi respuestaApi= new RespuestaApi();
        respuestaApi.setResultado(chatsRepository.deleteChatUser(idUsuarioOrigen));
        respuestaApi.setMensaje("Operacion exitosa");
        return respuestaApi;
    }

    public RespuestaApi registraMensaje(MensajesDto mensajesDto){
        RespuestaApi respuestaApi= new RespuestaApi();
        respuestaApi.setResultado(mensajesRepository.save(mensajesDto));
        respuestaApi.setMensaje("Operacion exitosa");
        return respuestaApi;
    }

    public RespuestaApi mostrarAllMensajes(){
        RespuestaApi respuestaApi= new RespuestaApi();
        respuestaApi.setResultado(mensajesRepository.findAll());
        respuestaApi.setMensaje("Operacion exitosa");
        return respuestaApi;
    }

    public RespuestaApi mostrarAllMensajesChat(int idChat){
        RespuestaApi respuestaApi= new RespuestaApi();
        respuestaApi.setResultado(mensajesRepository.findByIdChat(idChat));
        respuestaApi.setMensaje("Operacion exitosa");
        return respuestaApi;
    }

    public RespuestaApi actualizaMensajevisto(MensajesDto mensajesDto){
        RespuestaApi respuestaApi= new RespuestaApi();
        respuestaApi.setResultado(mensajesRepository.save(mensajesDto));
        respuestaApi.setMensaje("Operacion exitosa");
        return respuestaApi;
    }

    public RespuestaApi eliminaAllMensajesChat(int idChat){
        RespuestaApi respuestaApi= new RespuestaApi();
        respuestaApi.setResultado(mensajesRepository.deleteChatUser(idChat));
        respuestaApi.setMensaje("Operacion exitosa");
        return respuestaApi;
    }


}
