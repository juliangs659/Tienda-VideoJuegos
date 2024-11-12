package com.TiendaVideoJuegs.Juegos.Entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Juego {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int idJuego;

  @Column(nullable = false)
  private String nombreJuego;

  @Column(nullable = false, length = 1000)
  private String descripcionJuego;

  @Column(nullable = false)
  private String generoJuego;

  @Column(nullable = false)
  private LocalDate fechaLanzamiento;

  @Column(nullable = false)
  private String plataforma;

  @Column(nullable = false)
  private String desarrolladora;

  @Column(nullable = false)
  private String urlImagen;

  @Column(nullable = false)
  private String urlTrailer;

  @Column(nullable = false)
  private Double precio;

  @Column(nullable = false)
  private Double calificacion;

  public Juego() {}

  public Juego(int idJuego, String nombreJuego, String descripcionJuego, String generoJuego, LocalDate fechaLanzamiento, String plataforma, String desarrolladora, String urlImagen, String urlTrailer, Double precio, Double calificacion) {
    this.idJuego = idJuego;
    this.nombreJuego = nombreJuego;
    this.descripcionJuego = descripcionJuego;
    this.generoJuego = generoJuego;
    this.fechaLanzamiento = fechaLanzamiento;
    this.plataforma = plataforma;
    this.desarrolladora = desarrolladora;
    this.urlImagen = urlImagen;
    this.urlTrailer = urlTrailer;
    this.precio = precio;
    this.calificacion = calificacion;
  }

  public int getIdJuego() {
    return idJuego;
  }

  public void setIdJuego(int idJuego) {
    this.idJuego = idJuego;
  }

  public String getNombreJuego() {
    return nombreJuego;
  }

  public void setNombreJuego(String nombreJuego) {
    this.nombreJuego = nombreJuego;
  }

  public String getDescripcionJuego() {
    return descripcionJuego;
  }

  public void setDescripcionJuego(String descripcionJuego) {
    this.descripcionJuego = descripcionJuego;
  }

  public String getGeneroJuego() {
    return generoJuego;
  }

  public void setGeneroJuego(String generoJuego) {
    this.generoJuego = generoJuego;
  }

  public LocalDate getFechaLanzamiento() {
    return fechaLanzamiento;
  }

  public void setFechaLanzamiento(LocalDate fechaLanzamiento) {
    this.fechaLanzamiento = fechaLanzamiento;
  }

  public String getPlataforma() {
    return plataforma;
  }

  public void setPlataforma(String plataforma) {
    this.plataforma = plataforma;
  }

  public String getDesarrolladora() {
    return desarrolladora;
  }

  public void setDesarrolladora(String desarrolladora) {
    this.desarrolladora = desarrolladora;
  }

  public String getUrlImagen() {
    return urlImagen;
  }

  public void setUrlImagen(String urlImagen) {
    this.urlImagen = urlImagen;
  }

  public String getUrlTrailer() {
    return urlTrailer;
  }

  public void setUrlTrailer(String urlTrailer) {
    this.urlTrailer = urlTrailer;
  }

  public Double getPrecio() {
    return precio;
  }

  public void setPrecio(Double precio) {
    this.precio = precio;
  }

  public Double getCalificacion() {
    return calificacion;
  }

  public void setCalificacion(Double calificacion) {
    this.calificacion = calificacion;
  }
}
