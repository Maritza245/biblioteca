package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args){
    
    //Crear la biblioteca
    Biblioteca biblioteca = new Biblioteca("BIB001", "Biblioteca Central", "Biblioteca pública", new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
    
    //Crear libros
    Libro libro1 = new Libro("001", "978-1234567890", "Java Programming", "John Doe", "TechBooks", "2022", 5);
    Libro libro2 = new Libro("002", "978-0987654321", "Data Structures", "Jane Smith", "CSBooks", "2021", 3);
    Libro libro3 = new Libro("003", "978-0983578938", "Vida 3.0", "Max Tegmark", "Penguin", "2018", 8);
    
    //Crear un bibliotecario
    Bibliotecario bibliotecario1 = new Bibliotecario("Carlos Rua", "7550263", "123", "Cr@gmail.com", 1300000);
    Bibliotecario bibliotecario2 = new Bibliotecario("Sara Mendoza", "756890", "1234", "Sarita@hotmail.com", 1300000);
    Bibliotecario bibliotecario3 = new Bibliotecario("María Lucía", "75521227", "12345", "ML_@gamil.com", 1300000);
    
    //Crear lista bibliotecario
    List<Bibliotecario> listaBibliotecarios = new ArrayList<>();
    listaBibliotecarios.add(bibliotecario1);
    listaBibliotecarios.add(bibliotecario2);
    listaBibliotecarios.add(bibliotecario3);
    
     //Crear un estudiante
    Estudiante estudiante1 = new Estudiante("Mayra López", "1094908684", "3167789078", "May_@gmail.com", 3);
    Estudiante estudiante2 = new Estudiante("David Salazar", "10947559232", "3167789123", "DS22@gmail.com", 5);
    Estudiante estudiante3 = new Estudiante("Dora Bedoya", "109490362682", "31677890456", "Dora32_@gmail.com", 1);

    //Crear un préstamo
    List<Prestamo> listaPrestamos1 = new ArrayList<>();
    listaPrestamos1.add(new Prestamo("2024-10-10", "2024-09-30", listaBibliotecarios, estudiante1));
    listaPrestamos1.add(new Prestamo("2024-10-28", "2024-10-01", listaBibliotecarios, estudiante2));
    
    List<Prestamo> listaPrestamos2 = new ArrayList<>();
    listaPrestamos2.add(new Prestamo("2024-09-22", "2024-08-16", listaBibliotecarios, estudiante3));
    List<Prestamo> listaPrestamos3 = new ArrayList<>();
    listaPrestamos3.add(new Prestamo("2024-09-22", "2024-08-16", listaBibliotecarios, estudiante3));
    
    //Crear lista de libro
    List<Libro> listaLibros = new ArrayList<>();
    listaLibros.add(libro1);
    listaLibros.add(libro2);
    listaLibros.add(libro3);
    
    //Agregar libros y bibliotecarios a la biblioteca
    biblioteca.setLibros(listaLibros);
    biblioteca.setBibliotecarios(listaBibliotecarios);
    
    //Mostrar detalle de préstamos usando DetalleLibro
    List<Estudiante> listaEstudiantes = new ArrayList<>();
    listaEstudiantes.add(estudiante1);
    listaEstudiantes.add(estudiante2);
    listaEstudiantes.add(estudiante3);
    
    for (int i = 0; i < listaEstudiantes.size(); i++) {
    Estudiante estudiante = listaEstudiantes.get(i);
        List<Prestamo> listaPrestamos = null;
        if (i == 0) {
            listaPrestamos = listaPrestamos1;
        } else if (i == 1) {
            listaPrestamos = listaPrestamos2;
        } else {
            listaPrestamos = listaPrestamos3;
        }
        DetalleLibro detalleLibro = new DetalleLibro(estudiante, 200.0, listaPrestamos);
        detalleLibro.mostrarDetalleListaPrestamo();
    }
    // Mostrar detalles de la biblioteca
    System.out.println("Detalles de la Biblioteca:");
    biblioteca.mostrarDetalles();
    System.out.println();        
    // Mostrar detalles de los libros
    System.out.println("Detalles de los Libros:");
        for (Libro libro : listaLibros) {
        libro.mostrarDetalles();
        System.out.println();
        }        
    // Mostrar detalles de los bibliotecarios
    System.out.println("Detalles de los Bibliotecarios:");
    for (Bibliotecario bibliotecario : listaBibliotecarios) {
            bibliotecario.mostrarDetalles();
             System.out.println();
        }        
    // Mostrar detalles de los estudiantes
    System.out.println("Detalles de los Estudiantes:");
        for (Estudiante estudiante : listaEstudiantes) {
            estudiante.mostrarDetalles();
                System.out.println();
        }       
    // Mostrar detalles de los préstamos
    System.out.println("Detalles de los Préstamos:");
        for (List<Prestamo> listaPrestamos : new ArrayList<List<Prestamo>>() {{
            add(listaPrestamos1);
            add(listaPrestamos2);
            add(listaPrestamos3);
    }}) {
        for (Prestamo prestamo : listaPrestamos) {
            prestamo.mostrarDetalles();
                System.out.println();
        }
     }        
    // Agregar más operaciones según sea necesario
        System.out.println("Información adicional:");
        System.out.println("Préstamos registrados: " + biblioteca.getPrestamos().size());
        System.out.println("Libros en la biblioteca: " + biblioteca.getLibros().size());
           }
}