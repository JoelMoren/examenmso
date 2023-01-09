package com.examen.msousuarios.service.remote.async;

import com.examen.msousuarios.RabbitConfigConsumer;
import com.google.gson.Gson;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
public class MensajeriaProducer {


    private RabbitTemplate rabbitTemplate;
    private Gson json = new Gson();

    public MensajeriaProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }


    public void sendDelete(int contractEvent) {
        rabbitTemplate.convertAndSend(RabbitConfigConsumer.QUEUE_EXAMEN_ELIMINA_MENSAJERIA, contractEvent);
        System.out.println("Se envio la peticion eliminacion a mensajeria correctamente");
    }

}
