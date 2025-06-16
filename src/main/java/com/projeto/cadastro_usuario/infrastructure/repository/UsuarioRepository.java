package com.projeto.cadastro_usuario.infrastructure.repository;

import com.projeto.cadastro_usuario.infrastructure.entitys.Usuario;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Optional<Usuario> findById(Integer id);

    @Transactional
    void deleteById(Integer id);
}
