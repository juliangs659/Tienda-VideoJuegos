package com.TiendaVideoJuegs.Juegos.Controllers;

import com.TiendaVideoJuegs.Juegos.Entities.Usuario;
import com.TiendaVideoJuegs.Juegos.Services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

  @Autowired
  public UsuarioService usuarioService;

  // crear Usuario
  @PostMapping
  public ResponseEntity<Usuario> guardarUsuario(@RequestBody Usuario usuario) {
    Usuario usuarioNuevo = usuarioService.crearUsuario(usuario);
    return new ResponseEntity<>(usuarioNuevo, HttpStatus.CREATED);
  }

  // Eliminar Usuario
  @DeleteMapping("{id}")
  public ResponseEntity<Void> eliminarUsuario(@PathVariable Integer id) {
    usuarioService.eliminarUsuarioById(id);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }

  // Obtener todos los Usuarios
  @GetMapping
  public ResponseEntity<List<Usuario>> listarUsuarios() {
    List<Usuario> usuarios = usuarioService.obtenerTodosUsuarios();
    return new ResponseEntity<>(usuarios, HttpStatus.OK);
  }
}
