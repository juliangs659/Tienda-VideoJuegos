package com.TiendaVideoJuegs.Juegos.Services;

import com.TiendaVideoJuegs.Juegos.Entities.Usuario;
import com.TiendaVideoJuegs.Juegos.Repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

  @Autowired
  public UsuarioRepository usuarioRepository;

  // Guardar Usuario
  public Usuario crearUsuario(Usuario usuario) {
    return usuarioRepository.save(usuario);
  }

  // Obtener Usuario por Id
  public Usuario obtenerUsuarioById(int idUsuario) {
    return usuarioRepository.findById(idUsuario).orElse(null);
  }

  // Obtener Todos los Usuarios
  public List<Usuario> obtenerTodosUsuarios() {
    return usuarioRepository.findAll();
  }

  // Eliminar Usuario por Id
  public void eliminarUsuarioById(int idUsuario) {
    usuarioRepository.deleteById(idUsuario);
  }
}
