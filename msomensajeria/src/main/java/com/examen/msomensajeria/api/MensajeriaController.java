package com.examen.msomensajeria.api;

import com.examen.msomensajeria.model.ChatsDto;
import com.examen.msomensajeria.model.MensajesDto;
import com.examen.msomensajeria.service.MensajeriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mso")
public class MensajeriaController {


    @Autowired
    MensajeriaService mensajeriaService;

    @PostMapping("/chats/registrar")
    public ResponseEntity<Object> creaChat(@RequestBody ChatsDto chatsDto) {
        return new ResponseEntity<>(mensajeriaService.registraChat(chatsDto), HttpStatus.OK);
    }

    @GetMapping("/chats/mostrar/{idUsuario}")
    public ResponseEntity<Object> mostrarChatUsuarios(@PathVariable(value = "idUsuario") int idUsuario) {
        return new ResponseEntity<>(mensajeriaService.mostrarChatsUsuario(idUsuario), HttpStatus.OK);
    }

    @DeleteMapping("/chats/eliminar/{idUsuario}")
    public ResponseEntity<Object> eliminaChatUsuario(@PathVariable(value = "idUsuario") int idUsuario) {
        return new ResponseEntity<>(mensajeriaService.eliminaChatsUsuario(idUsuario), HttpStatus.OK);
    }


    @PostMapping("/mensajes/registrar")
    public ResponseEntity<Object> creaMensaje(@RequestBody MensajesDto mensajesDto) {
        return new ResponseEntity<>(mensajeriaService.registraMensaje(mensajesDto), HttpStatus.OK);
    }

    @GetMapping("/mensajes/mostrar/{idChat}")
    public ResponseEntity<Object> mostrarMensajesChatUsuarios(@PathVariable(value = "idChat") int idChat) {
        return new ResponseEntity<>(mensajeriaService.mostrarAllMensajesChat(idChat), HttpStatus.OK);
    }

    @DeleteMapping("/mensajes/eliminar/{idChat}")
    public ResponseEntity<Object> eliminaMensajesChatUsuario(@PathVariable(value = "idChat") int idChat) {
        return new ResponseEntity<>(mensajeriaService.eliminaAllMensajesChat(idChat), HttpStatus.OK);
    }

    @PatchMapping("/mensajes/actualiza")
    public ResponseEntity<Object> actualizaMensaje(@RequestBody MensajesDto mensajesDto) {
        return new ResponseEntity<>(mensajeriaService.actualizaMensajevisto(mensajesDto), HttpStatus.OK);
    }

}
