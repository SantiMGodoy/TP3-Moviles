package com.tp3_moviles.model;

import java.io.Serializable;
import java.util.List;

public class Libro implements Serializable {

    private String titulo;
    private String autor;
    private int paginas;
    private int anio;
    private List<String> categorias;
    private int portada;
    private String descripcion;

    public Libro(String titulo, String autor, int paginas, int anio,
                 List<String> categorias, int portada, String descripcion) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.anio = anio;
        this.categorias = categorias;
        this.portada = portada;
        this.descripcion = descripcion;
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getPaginas() { return paginas; }
    public int getAnio() { return anio; }
    public List<String> getCategorias() { return categorias; }
    public int getPortada() { return portada; }
    public String getDescripcion() { return descripcion; }
}