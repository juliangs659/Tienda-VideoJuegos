package com.TiendaVideoJuegs.Juegos.Services;

import com.TiendaVideoJuegs.Juegos.Entities.Juego;
import com.TiendaVideoJuegs.Juegos.Repositories.JuegoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JuegoService {

  @Autowired
  JuegoRepository juegoRepository;

  // Guardar Juego
  public Juego guardarJuego(Juego juego) {
    return juegoRepository.save(juego);
  }

  // Obtener Juego por Id
  public Juego buscarJuegoPorId(int id) {
    return juegoRepository.findById(id).orElse(null);
  }

  // Obtener todos los Juegos
  public List<Juego> buscarJuegos() {
    return juegoRepository.findAll();
  }

  // Eliminar juego por Id
  public void eliminarJuego(int id) {
    juegoRepository.deleteById(id);
  }

}
