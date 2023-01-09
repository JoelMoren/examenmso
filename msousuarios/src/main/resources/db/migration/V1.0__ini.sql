

create table usuarios(
idusuario SERIAL PRIMARY KEY,
nombreusuario VARCHAR ( 50 ) UNIQUE NOT NULL,
correo VARCHAR ( 50 ) UNIQUE NOT NULL,
claveacceso VARCHAR ( 50 ) NOT NULL
);


create table perfil(
    idperfil SERIAL PRIMARY KEY,
    idusuario int not null,
    nombrecompleto VARCHAR ( 500 ) NOT NULL
);


create table amigos(
idamigos SERIAL PRIMARY KEY,
idusuarioorigen INT NOT NULL,
idusuarioamigo INT NOT null
);


create table publicaciones(
idpublicacion SERIAL PRIMARY KEY,
contenidopublicacion VARCHAR ( 500 ) NOT NULL,
fechapublicacion  TIMESTAMP,
idusuario int not null
);


create table comentarios(
    idcomentario SERIAL PRIMARY KEY,
    idpublicacion int not null,
    contenidocomentario VARCHAR ( 500 ) NOT NULL,
    fechacomentario TIMESTAMP
);




create table chats(
idchat SERIAL PRIMARY KEY,
idusuarioorigen INT NOT NULL,
idusuariodestino INT NOT NULL
);


create table mensajes(
idmensaje SERIAL PRIMARY KEY,
idchat INT NOT NULL,
fechahora TIMESTAMP,
texto VARCHAR ( 500 ) NOT NULL,
visto BOOLEAN
);








select * from usuarios;

insert  into usuarios (nombreusuario,correo,claveacceso) values ('joerk','jjoerk@gmail.com','123456');
insert  into usuarios (nombreusuario,correo,claveacceso) values ('black','black@gmail.com','123456');
insert  into usuarios (nombreusuario,correo,claveacceso) values ('cpame','cpame@gmail.com','123456');
insert  into usuarios (nombreusuario,correo,claveacceso) values ('luis','luis@gmail.com','123456');
insert  into usuarios (nombreusuario,correo,claveacceso) values ('cesar','cesar@gmail.com','123456');
insert  into usuarios (nombreusuario,correo,claveacceso) values ('ruben','ruben@gmail.com','123456');
insert  into usuarios (nombreusuario,correo,claveacceso) values ('edgar','edgar@gmail.com','123456');
insert  into usuarios (nombreusuario,correo,claveacceso) values ('jose','jose@gmail.com','123456');

select * from perfil;

insert  into perfil (idusuario,nombrecompleto) values (1,'Joel Moreno Martinez');
insert  into perfil (idusuario,nombrecompleto) values (2,'Black Panter');
insert  into perfil (idusuario,nombrecompleto) values (3,'Capitan America');
insert  into perfil (idusuario,nombrecompleto) values (4,'Luis Salas');
insert  into perfil (idusuario,nombrecompleto) values (5,'Cesar Montoya');
insert  into perfil (idusuario,nombrecompleto) values (6,'Ruben Landa');
insert  into perfil (idusuario,nombrecompleto) values (7,'Edgar max');
insert  into perfil (idusuario,nombrecompleto) values (8,'Joselon');


select * from amigos;

insert  into amigos (idusuarioorigen,idusuarioamigo) values (1,1);
insert  into amigos (idusuarioorigen,idusuarioamigo) values (1,2);
insert  into amigos (idusuarioorigen,idusuarioamigo) values (1,3);
insert  into amigos (idusuarioorigen,idusuarioamigo) values (1,4);
insert  into amigos (idusuarioorigen,idusuarioamigo) values (1,5);
insert  into amigos (idusuarioorigen,idusuarioamigo) values (1,6);
insert  into amigos (idusuarioorigen,idusuarioamigo) values (1,7);
insert  into amigos (idusuarioorigen,idusuarioamigo) values (1,8);
insert  into amigos (idusuarioorigen,idusuarioamigo) values (2,1);
insert  into amigos (idusuarioorigen,idusuarioamigo) values (2,3);
insert  into amigos (idusuarioorigen,idusuarioamigo) values (2,4);
insert  into amigos (idusuarioorigen,idusuarioamigo) values (2,7);
insert  into amigos (idusuarioorigen,idusuarioamigo) values (3,1);
insert  into amigos (idusuarioorigen,idusuarioamigo) values (3,2);
insert  into amigos (idusuarioorigen,idusuarioamigo) values (3,5);
insert  into amigos (idusuarioorigen,idusuarioamigo) values (3,7);
insert  into amigos (idusuarioorigen,idusuarioamigo) values (4,1);
insert  into amigos (idusuarioorigen,idusuarioamigo) values (4,2);
insert  into amigos (idusuarioorigen,idusuarioamigo) values (5,1);
insert  into amigos (idusuarioorigen,idusuarioamigo) values (5,3);
insert  into amigos (idusuarioorigen,idusuarioamigo) values (6,1);
insert  into amigos (idusuarioorigen,idusuarioamigo) values (7,1);
insert  into amigos (idusuarioorigen,idusuarioamigo) values (7,2);
insert  into amigos (idusuarioorigen,idusuarioamigo) values (7,3);


select * from amigos a
inner join usuarios u on u.idusuario  =a.idusuarioamigo;



select * from publicaciones;


insert into publicaciones (contenidopublicacion,fechapublicacion,idusuario) values ('Publicacion inicial, conociendo mi red social',current_timestamp,1);
insert into publicaciones (contenidopublicacion,fechapublicacion,idusuario) values ('Segunda publicacion, conociendo mi red social',current_timestamp,1);
insert into publicaciones (contenidopublicacion,fechapublicacion,idusuario) values ('Vamonos de viaje',current_timestamp,2);
insert into publicaciones (contenidopublicacion,fechapublicacion,idusuario) values ('La vida es increible',current_timestamp,3);
insert into publicaciones (contenidopublicacion,fechapublicacion,idusuario) values ('Busco a personas que quieran generar ingresos',current_timestamp,7);


select * from comentarios ;

insert into comentarios (idpublicacion,contenidocomentario,fechacomentario) values (1,'Se ve bien la publicacion inicial',current_timestamp);
insert into comentarios (idpublicacion,contenidocomentario,fechacomentario) values (3,'Te acompaño',current_timestamp);
insert into comentarios (idpublicacion,contenidocomentario,fechacomentario) values (4,'Confirmo',current_timestamp);



select * from chats c;

insert into chats (idusuarioorigen,idusuariodestino) values (1,7);
insert into chats (idusuarioorigen,idusuariodestino) values (2,3);
insert into chats (idusuarioorigen,idusuariodestino) values (3,5);




select * from mensajes;


insert into mensajes (idchat,fechahora,texto,visto) values(1,current_timestamp,'Hola usuario 7 soy el usuario 1',false);
insert into mensajes (idchat,fechahora,texto,visto) values(1,current_timestamp,'Te saludo con mucho gusto',false);
insert into mensajes (idchat,fechahora,texto,visto) values(1,current_timestamp,'Espero puedas responderme',false);
insert into mensajes (idchat,fechahora,texto,visto) values(2,current_timestamp,'Hola usuario 3 soy el usuario 2',false);
insert into mensajes (idchat,fechahora,texto,visto) values(2,current_timestamp,'estamos validando otro chat',false);
insert into mensajes (idchat,fechahora,texto,visto) values(3,current_timestamp,'Hola usuario 3 soy el usuario 5',false);


