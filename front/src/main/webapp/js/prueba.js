

$(document).ready(function () {

  get("http://localhost:8080/examen/mso/usuarios/mostrar").then(dataAxios => {
    var objetoRespuesta = dataAxios;

    console.log(objetoRespuesta.resultado);

    //$("#mensajeResultado").html(objetoRespuesta.resultado.);

  //  $('#lablresultado').text('resultado: ' + objetoRespuesta.resultado[0].nombreusuario);


    if(objetoRespuesta.mensaje=="Operacion exitosa")
    {
   // alert("consulta exitosa");
    }else
    {
    //alert("consulta Fallida");
    }

  });


});//Fin document ready

function ingresa(){
alert("iniciando sesion");
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
