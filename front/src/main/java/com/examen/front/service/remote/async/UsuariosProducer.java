package com.examen.front.service.remote.async;

import com.examen.front.RabbitConfigConsumer;
import com.examen.front.UsuarioDto;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
public class UsuariosProducer {

    private RabbitTemplate rabbitTemplate;


    public UsuariosProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendCreate(String contractEvent) {
        rabbitTemplate.convertAndSend(RabbitConfigConsumer.QUEUE_EXAMEN_REGISTRA_USUARIO, contractEvent);
        System.out.println("Se envio la peticion de registro de usuario correctamente");
    }

}
