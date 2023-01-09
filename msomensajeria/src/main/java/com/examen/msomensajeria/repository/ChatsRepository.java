package com.examen.msomensajeria.repository;

import com.examen.msomensajeria.model.ChatsDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface ChatsRepository extends JpaRepository<ChatsDto, String> {

    @Query(value="select * from chats c where c.idusuarioorigen=?1", nativeQuery = true)
    List<ChatsDto> findByIdUsuarioOrigen(int idUsuario);

    @Transactional
    @Modifying
    @Query(value="DELETE from chats c WHERE c.idusuarioorigen=?1", nativeQuery = true)
    int deleteChatUser(int idUsuarioOrigen);


}
