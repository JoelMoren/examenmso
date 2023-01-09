package com.examen.msousuarios.repository;


import com.examen.msousuarios.model.UsuarioDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface UsuariosRepository extends JpaRepository<UsuarioDto, String> {

    @Query(value="select * from usuarios u where u.idusuario=?1", nativeQuery = true)
    List<UsuarioDto> findByIdUsuario(int idUsuario);

    @Transactional
    @Modifying
    @Query(value="delete from usuarios u where u.idusuario =?1", nativeQuery = true)
    int deleteByIdUsuario(int idUsuario);

}



