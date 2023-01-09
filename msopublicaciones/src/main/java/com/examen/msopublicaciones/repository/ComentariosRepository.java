package com.examen.msopublicaciones.repository;

import com.examen.msopublicaciones.model.ComentariosDto;
import com.examen.msopublicaciones.model.PublicacionesDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ComentariosRepository extends JpaRepository<ComentariosDto, Integer> {

    @Query(value="select * from comentarios c where c.idpublicacion=?1", nativeQuery = true)
    List<ComentariosDto> findByIdUsuario(int idPublicacion);

}
