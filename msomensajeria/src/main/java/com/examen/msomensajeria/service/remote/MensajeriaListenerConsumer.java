package com.examen.msomensajeria.service.remote;

import com.examen.msomensajeria.RabbitConfigConsumer;
import com.examen.msomensajeria.model.RespuestaApi;
import com.examen.msomensajeria.service.MensajeriaService;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MensajeriaListenerConsumer {

    private MensajeriaService mensajeriaService;

    public MensajeriaListenerConsumer(MensajeriaService mensajeriaService) {
        this.mensajeriaService = mensajeriaService;
    }


    @RabbitListener(queues = RabbitConfigConsumer.QUEUE_EXAMEN_ELIMINA_MENSAJERIA)
    public void listenerEliminaMensajeria(int idUsuario) {
        //String body = new String(message.getBody());
        System.out.println("******************************* Event eliminacion de chats" + idUsuario);
        //System.out.println("******************************* Event eliminacion de chats" + message.getBody());
        //System.out.println("******************************* Event eliminacion de chats" + body);

        mensajeriaService.eliminaChatsUsuario(idUsuario);
    }


}
