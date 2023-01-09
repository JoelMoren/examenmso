$(document).ready(function () {

var idusuario = localStorage.getItem("idusuario");
var nombreusuario = localStorage.getItem("nombreusuario");
var correo = localStorage.getItem("correo");
var claveacceso = localStorage.getItem("claveacceso");


$('#lblusuario').text('Bienvenido: ' + nombreusuario);
$('#lblcorreo').text('Correo: ' + correo);

});//Fin document ready




function eliminarcuenta(){
var idusuario = localStorage.getItem("idusuario");


  elimina("http://localhost:8080/examen/mso/usuarios/eliminar/"+idusuario).then(dataAxios => {
    var objetoRespuesta = dataAxios;
    console.log(objetoRespuesta);
    location.href = "http://localhost:81/redsocial/";

  });

}

function get(url) {
  return axios.get(url) // return here
    .then(response => response.data)
    .catch(error => error);
}

function elimina(url) {
  const headerss = {
    'Content-Type': 'application/json'
  }
  return axios.delete(url,  {
    headers: headerss
  })
    .then(response => response.data)
    .catch(error => error);
}


