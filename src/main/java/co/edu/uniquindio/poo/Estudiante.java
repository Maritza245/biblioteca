package co.edu.uniquindio.poo;

public class Estudiante extends Persona{
    private int estudianteConMasPrestamo;

    public Estudiante(String nombre, String cedula, String telefono, String correo, int estudianteConMasPrestamo){
        super(nombre, cedula, telefono, correo);
        this.estudianteConMasPrestamo = estudianteConMasPrestamo;
        assert!nombre.isBlank();
        assert!cedula.isBlank();
        assert!telefono.isBlank();
        assert correo.contains("@");

    }


    public int getEstudianteConMasPrestamo() {
        return estudianteConMasPrestamo;
    }

    public void setEstudianteConMasPrestamo(int estudianteConMasPrestamo) {
        this.estudianteConMasPrestamo = estudianteConMasPrestamo;
    }

    public void mostrarDetalles() {
        System.out.println("Detalles del estudiante:");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Cédula: " + getCedula());
        System.out.println("Teléfono: " + getTelefono());
        System.out.println("Correo: " + getCorreo());
        System.out.println("Cantidad de prestamos : " + getEstudianteConMasPrestamo());
    }

}