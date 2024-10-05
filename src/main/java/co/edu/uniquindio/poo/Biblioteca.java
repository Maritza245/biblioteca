package co.edu.uniquindio.poo;

import java.util.List;

public class Biblioteca {
    private String id;
    private String nombre;
    private String descripcion;
    private List<Bibliotecario> bibliotecarios;
    private List<Libro> libros;
    private List<Prestamo> prestamos;

    public Biblioteca(String id, String nombre, String descripcion, List<Bibliotecario> bibliotecarios, List<Libro> libros, List<Prestamo> prestamos) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.bibliotecarios = bibliotecarios;
        this.libros = libros;
        this.prestamos = prestamos;
        assert!id.isBlank();
        assert!nombre.isBlank();
        assert!descripcion.isBlank();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Bibliotecario> getBibliotecarios() {
        return bibliotecarios;
    }

    public void setBibliotecarios(List<Bibliotecario> bibliotecarios) {
        this.bibliotecarios = bibliotecarios;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(List<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }
    public void mostrarDetalles() {
        System.out.println("Detalles de la biblioteca:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Libros:");
        for (Libro libro : libros) {
            System.out.println(libro.toString());
        }
        System.out.println("Bibliotecarios:");
        for (Bibliotecario bibliotecario : bibliotecarios) {
            System.out.println(bibliotecario.toString());
        }
        System.out.println("Préstamos:");
        for (Prestamo prestamo : prestamos) {
            System.out.println(prestamo.toString());
        }
    
  }

}

