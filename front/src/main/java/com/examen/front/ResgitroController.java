package com.examen.front;

import com.examen.front.service.remote.async.UsuariosProducer;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/registro")
public class ResgitroController {


    @Autowired
    private UsuariosProducer usuariosProducer;

    private Gson json = new Gson();

    @PostMapping("/usuarios/registrar")
    public ResponseEntity<Object> creaUsuario(@RequestBody UsuarioDto usuarioDto) {
        usuariosProducer.sendCreate(json.toJson(usuarioDto) );
        //System.out.println(usuarioDto.getNombreusuario()+usuarioDto.getCorreo()+usuarioDto.getClaveacceso());
        //return new ResponseEntity<>(usuariosService.registraUsuario(usuarioDto), HttpStatus.OK);
        return new ResponseEntity<>("Operacion exitosa", HttpStatus.OK);
    }

    @GetMapping("/prueba")
    public ResponseEntity<Object> mostrarUsuarios() {
        return new ResponseEntity<>("Correcto version prueba", HttpStatus.OK);
    }

    @GetMapping("/inicio")
    public ModelAndView inicio() {
        ModelAndView modelAndView = new ModelAndView();
        return modelAndView;

    }


    @RequestMapping(
            value    = "/cargainicio"
            , method   = RequestMethod.GET
    )
    @ResponseBody
    public ModelAndView muestraindex(HttpServletRequest request) {
        System.out.println("*************************************"+request.getContextPath());


        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("../../index.html");
        return modelAndView;

    }

}
