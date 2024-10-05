package co.edu.uniquindio.poo;

import java.util.List;

public class Prestamo {
        private String fechaDevolucion;
    private String fechaPrestamo;
    private List<Libro> libros;
    private Bibliotecario bibliotecario;
    private Estudiante estudiante;

    public Prestamo(String fechaDevolucion, String fechaPrestamo, List<Libro> libros, Bibliotecario bibliotecario, Estudiante estudiante) {
        this.fechaDevolucion = fechaDevolucion;
        this.fechaPrestamo = fechaPrestamo;
        this.libros = libros;
        this.bibliotecario = bibliotecario;
        this.estudiante = estudiante;
    }

    public Prestamo(String fechaDevolucion, String fechaPrestamo, List<Bibliotecario> listaBibliotecarios, Estudiante estudiante2) {
        //TODO Auto-generated constructor stub
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public Bibliotecario getBibliotecario() {
        return bibliotecario;
    }

    public void setBibliotecario(Bibliotecario bibliotecario) {
        this.bibliotecario = bibliotecario;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public void mostrarDetalles() {
        System.out.println("Fecha de devolución: " + getFechaDevolucion());
        System.out.println("Fecha de préstamo: " + getFechaPrestamo());
        System.out.println("Libros:"+getLibros());
        for (Libro libro : getLibros()) {
            System.out.println(libro.toString());
        }
        System.out.println("Bibliotecario: " + getBibliotecario().toString());
        System.out.println("Estudiante: " + getEstudiante().toString());
    }
}