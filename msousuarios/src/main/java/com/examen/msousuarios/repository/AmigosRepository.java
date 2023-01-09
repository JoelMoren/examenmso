package com.examen.msousuarios.repository;

import com.examen.msousuarios.model.AmigosDto;
import com.examen.msousuarios.model.PerfilDto;
import com.examen.msousuarios.model.UsuarioAmigosDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Tuple;
import java.util.List;

@Repository
public interface AmigosRepository extends JpaRepository<AmigosDto, String> {


  /*  @Query(value="SELECT new com.examen.msousuarios.model.UsuarioAmigosDto(a.idamigos, a.idusuarioorigen, u.idusuarioamigo, u.idusuario, u.nombreusuario, u.correo, u.claveacceso) from amigos a inner join usuarios u on u.idusuario=a.idusuarioamigo where a.idusuarioorigen=?1", nativeQuery = true)
    List<UsuarioAmigosDto> findByIdUsuario(int idUsuario);
*/

    @Query(value="SELECT * from amigos a inner join usuarios u on u.idusuario=a.idusuarioamigo where a.idusuarioorigen=?1", nativeQuery = true)
    List<Tuple> findByIdUsuario(int idUsuario);

    @Transactional
    @Modifying
    @Query(value="delete from amigos a where a.idusuarioorigen=?1", nativeQuery = true)
    int deleteByIdUsuarioOrigen(int idUsuarioOrigen);

/*
    @Query("""   select new com.vladmihalcea.book.hpjp.hibernate.forum.dto.PostDTO( p.id, p.title ) from Post p where p.createdOn > :fromTimestamp """, PostDTO.class)
    .setParameter("fromTimestamp", Timestamp.from( LocalDate.of(2020, 1, 1).atStartOfDay()   .toInstant(ZoneOffset.UTC)    )   )  .getResultList();*/

}


