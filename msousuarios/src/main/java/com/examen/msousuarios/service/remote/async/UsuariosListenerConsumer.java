package com.examen.msousuarios.service.remote.async;

import com.examen.msousuarios.RabbitConfigConsumer;
import com.examen.msousuarios.model.UsuarioDto;
import com.examen.msousuarios.service.UsuariosService;
import com.google.gson.Gson;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class UsuariosListenerConsumer {


    private UsuariosService usuariosService;


    public UsuariosListenerConsumer(UsuariosService usuariosService) {
        this.usuariosService = usuariosService;
    }

    @RabbitListener(queues = RabbitConfigConsumer.QUEUE_EXAMEN_REGISTRA_USUARIO)
    public void listenerRegistraUsuario(Message message) {
        String body = new String(message.getBody());

        UsuarioDto usuarioDto=new Gson().fromJson(body, UsuarioDto.class);
        System.out.println("******************************* Event registrode usuario" );
        //System.out.println("******************************* Event eliminacion de chats" + message.getBody());
        //System.out.println("******************************* Event eliminacion de chats" + body);

        usuariosService.registraUsuario(usuarioDto);
    }


}
