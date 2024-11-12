package com.TiendaVideoJuegs.Juegos.Repositories;

import com.TiendaVideoJuegs.Juegos.Entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
