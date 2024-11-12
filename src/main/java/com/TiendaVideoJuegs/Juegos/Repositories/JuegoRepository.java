package com.TiendaVideoJuegs.Juegos.Repositories;

import com.TiendaVideoJuegs.Juegos.Entities.Juego;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JuegoRepository extends JpaRepository<Juego, Integer> {
}
