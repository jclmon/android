package com.example.helloworld;

/**
 *
 */
class Averia {
   private String titulo;
   private String modelo;
   private String urlImagen;
   private Integer numeroPresupuestos;

    public Averia() {
    }

    public Averia(String titulo, String modelo, String urlImagen, Integer numeroPresupuestos) {
        this.titulo = titulo;
        this.modelo = modelo;
        this.urlImagen = urlImagen;
        this.numeroPresupuestos = numeroPresupuestos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }

    public Integer getNumeroPresupuestos() {
        return numeroPresupuestos;
    }

    public void setNumeroPresupuestos(Integer numeroPresupuestos) {
        this.numeroPresupuestos = numeroPresupuestos;
    }
}
