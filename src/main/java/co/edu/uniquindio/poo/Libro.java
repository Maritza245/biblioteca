package co.edu.uniquindio.poo;

public class Libro {
    private String codigo;
    private String isbn;
    private String titulo;
    private String autor;
    private String editorial;
    private String fecha;
    private int unidadesDisponibles;

    public Libro(String codigo, String isbn, String titulo, String autor, String editorial, String fecha, int unidadesDisponibles) {
        this.codigo = codigo;
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.fecha = fecha;
        this.unidadesDisponibles = unidadesDisponibles;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getUnidadesDisponibles() {
        return unidadesDisponibles;
    }

    public void setUnidadesDisponibles(int unidadesDisponibles) {
        this.unidadesDisponibles = unidadesDisponibles;
    }

    public void mostrarDetalles() {
        System.out.println("Detalles del libro:");
        System.out.println("Código: " + getCodigo());
        System.out.println("ISBN: " + getIsbn());
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Editorial: " + getEditorial());
        System.out.println("Fecha: " + getFecha());
        System.out.println("Unidades disponibles: " + getUnidadesDisponibles());
    }
}
