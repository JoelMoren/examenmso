
$(document).ready(function () {




});//Fin document ready


function iniciaSesion(){



  get("http://localhost:8080/examen/mso/usuarios/mostrar").then(dataAxios => {
    var objetoRespuesta = dataAxios;
    console.log(objetoRespuesta.resultado);

    var usuario=document.getElementById("inputlogin").value;
    var password=document.getElementById("pass").value;

    if(objetoRespuesta.mensaje=="Operacion exitosa")
    {
    objetoRespuesta.resultado.forEach(function(item) {
    console.log(item.nombreusuario,item.claveacceso);

        if(usuario==item.nombreusuario && password==item.claveacceso){
        localStorage.setItem("idusuario", item.idusuario);
        localStorage.setItem("nombreusuario", item.nombreusuario);
        localStorage.setItem("correo", item.correo);
        localStorage.setItem("claveacceso", item.claveacceso);

        location.href = "http://localhost:81/redsocial/principal.html";

        }else {

        }
        });
    }else
    {
    //alert("consulta Fallida");
    }

  });

}



function registrarme(){


    var usuario=document.getElementById("inputlogin").value;
    var correo=document.getElementById("inputcorreo").value;
    var password=document.getElementById("pass").value;


var jsonregistro = {"nombreusuario": usuario,"correo": correo,"claveacceso": password};
//var jsonText = JSON.stringify(objeto);

  post("http://localhost:81/redsocial/registro/usuarios/registrar",jsonregistro).then(dataAxios => {
    //var objetoRespuesta = dataAxios;
    //console.log(objetoRespuesta.resultado);
    location.href = "http://localhost:81/redsocial/";

  });

}





function get(url) {
  return axios.get(url) // return here
    .then(response => response.data)
    .catch(error => error);
}

function post(url, param) {
  const headerss = {
    'Content-Type': 'application/json'
  }
  return axios.post(url, param, {
    headers: headerss
  })
    .then(response => response.data)
    .catch(error => error);
}
