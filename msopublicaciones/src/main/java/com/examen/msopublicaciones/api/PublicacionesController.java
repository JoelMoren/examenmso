package com.examen.msopublicaciones.api;

import com.examen.msopublicaciones.model.ComentariosDto;
import com.examen.msopublicaciones.model.PublicacionesDto;
import com.examen.msopublicaciones.service.PublicacionesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mso")
public class PublicacionesController {


    @Autowired
    PublicacionesService publicacionesService;

    @PostMapping("/publicaciones/registrar")
    public ResponseEntity<Object> creaPublicacion(@RequestBody PublicacionesDto publicacionesDto) {
        return new ResponseEntity<>(publicacionesService.registraPublicacion(publicacionesDto), HttpStatus.OK);
    }

    @GetMapping("/publicaciones/usuario/{idUsuario}")
    public ResponseEntity<Object> mostrarUsuarios(@PathVariable(value = "idUsuario") int idUsuario) {
        return new ResponseEntity<>(publicacionesService.mostrarPublicacionesUsuario(idUsuario), HttpStatus.OK);
    }

    @PostMapping("/comentarios/registrar")
    public ResponseEntity<Object> creacomentario(@RequestBody ComentariosDto comentariosDto) {
        return new ResponseEntity<>(publicacionesService.registraComentario(comentariosDto), HttpStatus.OK);
    }

    @GetMapping("/comentarios/publicacion/{idPublicacion}")
    public ResponseEntity<Object> mostrarcomentariosPublicacion(@PathVariable(value = "idPublicacion") int idPublicacion) {
        return new ResponseEntity<>(publicacionesService.mostrarComentariosPublicaciones(idPublicacion), HttpStatus.OK);
    }

}
