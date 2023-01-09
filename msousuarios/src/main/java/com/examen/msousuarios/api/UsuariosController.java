package com.examen.msousuarios.api;

import com.examen.msousuarios.model.AmigosDto;
import com.examen.msousuarios.model.PerfilDto;
import com.examen.msousuarios.model.UsuarioDto;
import com.examen.msousuarios.service.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:81")
@RestController
@RequestMapping("/mso")
public class UsuariosController {

    @Autowired
    private UsuariosService usuariosService;

    @PostMapping("/usuarios/registrar")
    public ResponseEntity<Object> creaUsuario(@RequestBody UsuarioDto usuarioDto) {
        return new ResponseEntity<>(usuariosService.registraUsuario(usuarioDto), HttpStatus.OK);
    }

    @GetMapping("/usuarios/mostrar")
    public ResponseEntity<Object> mostrarUsuarios() {
        return new ResponseEntity<>(usuariosService.mostarUsuariosAll(), HttpStatus.OK);
    }
    @GetMapping("/usuarios/mostrar/{idUsuario}")
    public ResponseEntity<Object> mostrarUsuario(@PathVariable(value = "idUsuario") int idUsuario) {
        return new ResponseEntity<>(usuariosService.mostarUsuario(idUsuario), HttpStatus.OK);
    }

    @DeleteMapping("/usuarios/eliminar/{idUsuario}")
    public ResponseEntity<Object> eliminaUsuario(@PathVariable(value = "idUsuario") int idUsuario) {
        return new ResponseEntity<>(usuariosService.eliminaUsuario(idUsuario), HttpStatus.OK);
    }

    @PostMapping("/perfil/registrar")
    public ResponseEntity<Object> creaPerfil(@RequestBody PerfilDto perfilDto) {
        return new ResponseEntity<>(usuariosService.registraPerfil(perfilDto), HttpStatus.OK);
    }
    @GetMapping("/perfil/mostrar/{idUsuario}")
    public ResponseEntity<Object> mostrarPerfilUsuario(@PathVariable(value = "idUsuario") int idUsuario) {
        return new ResponseEntity<>(usuariosService.mostrarPerfilUsuario(idUsuario), HttpStatus.OK);
    }
    @DeleteMapping("/perfil/eliminar/{idUsuario}")
    public ResponseEntity<Object> eliminaPerfil(@PathVariable(value = "idUsuario") int idUsuario) {
        return new ResponseEntity<>(usuariosService.eliminaPerfilUsuario(idUsuario), HttpStatus.OK);
    }

    @PostMapping("/amigos/registrar")
    public ResponseEntity<Object> agregaamigos(@RequestBody AmigosDto amigosDto) {
        return new ResponseEntity<>(usuariosService.registraAmigos(amigosDto), HttpStatus.OK);
    }

    @GetMapping("/muestraamigos/usuario/{idUsuario}")
    public ResponseEntity<Object> mostrarAmigosUsuario(@PathVariable(value = "idUsuario") int idUsuario) {
        return new ResponseEntity<>(usuariosService.amigosUsuario(idUsuario), HttpStatus.OK);
    }

    @DeleteMapping("/amigos/eliminar/{idUsuario}")
    public ResponseEntity<Object> aliminaAmigos(@PathVariable(value = "idUsuario") int idUsuario) {
        return new ResponseEntity<>(usuariosService.eliminaamigosUsuario(idUsuario), HttpStatus.OK);
    }

}
