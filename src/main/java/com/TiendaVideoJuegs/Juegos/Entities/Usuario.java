package com.TiendaVideoJuegs.Juegos.Entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Usuario {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int idUsuario;

  @Column(nullable = false)
  private String nombre;

  @Column(nullable = false)
  private String email;

  @Column(nullable = false)
  private String username;

  @Column(nullable = false)
  private String password;

  @Column(nullable = false)
  private String direccion;

  @Column(nullable = false)
  private String telefono;

  @Column(nullable = false)
  private LocalDateTime fechaCreacion = LocalDateTime.now();

  public Usuario() {

  }

  public Usuario(int idUsuario, String nombre, String email, String username, String password, String direccion, String telefono, LocalDateTime fechaCreacion) {
    this.idUsuario = idUsuario;
    this.nombre = nombre;
    this.email = email;
    this.username = username;
    this.password = password;
    this.direccion = direccion;
    this.telefono = telefono;
    this.fechaCreacion = fechaCreacion;
  }

  public int getIdUsuario() {
    return idUsuario;
  }

  public void setIdUsuario(int idUsuario) {
    this.idUsuario = idUsuario;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public LocalDateTime getFechaCreacion() {
    return fechaCreacion;
  }

  public void setFechaCreacion(LocalDateTime fechaCreacion) {
    this.fechaCreacion = fechaCreacion;
  }
}
