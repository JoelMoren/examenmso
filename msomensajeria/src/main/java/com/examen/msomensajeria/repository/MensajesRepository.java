package com.examen.msomensajeria.repository;

import com.examen.msomensajeria.model.ChatsDto;
import com.examen.msomensajeria.model.MensajesDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface MensajesRepository extends JpaRepository<MensajesDto, Integer> {


    @Query(value="select * from mensajes m where idchat=?1", nativeQuery = true)
    List<MensajesDto> findByIdChat(int idChat);

    @Transactional
    @Modifying
    @Query(value="DELETE from mensajes m WHERE m.idchat=?1", nativeQuery = true)
    int deleteChatUser(int idChat);

/*
    int updateVistoMensaje(idM);

    update mensajes set visto =true where idmensaje =1*/

}
