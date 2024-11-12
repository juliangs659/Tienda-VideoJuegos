package com.TiendaVideoJuegs.Juegos.Controllers;

import com.TiendaVideoJuegs.Juegos.Entities.Juego;
import com.TiendaVideoJuegs.Juegos.Services.JuegoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/juegos")
public class JuegoController {

  @Autowired
  private JuegoService juegoService;

  // crear Juego
  @PostMapping
  public ResponseEntity<Juego> crearJuego(@RequestBody Juego juego) {
    Juego juegoNuevo = juegoService.guardarJuego(juego);
    return new ResponseEntity<>(juegoNuevo, HttpStatus.CREATED);
  }

  // buscar juego por Id
  @GetMapping("{id}")
  public ResponseEntity<Juego> buscarJuegoId(int id) {
    Juego juego = juegoService.buscarJuegoPorId(id);
    return new ResponseEntity<>(juego, HttpStatus.OK);
  }

  // Obtener todos los Juegos
  @GetMapping
  public ResponseEntity<List<Juego>> buscarJuegos() {
    List<Juego> juegos = juegoService.buscarJuegos();
    return new ResponseEntity<>(juegos, HttpStatus.OK);
  }

  // Eliminar juego por Id
  @DeleteMapping("{id}")
  public ResponseEntity<Void> eliminarJuegoId(@PathVariable int id) {
    juegoService.eliminarJuego(id);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }

}
