package com.examen.msopublicaciones.repository;

import com.examen.msopublicaciones.model.PublicacionesDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PublicacionesRepository extends JpaRepository<PublicacionesDto, Integer> {

    @Query(value="select * from publicaciones p where p.idusuario=?1", nativeQuery = true)
    List<PublicacionesDto> findByIdUsuario(int idUsuario);

}
