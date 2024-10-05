package co.edu.uniquindio.poo;

public class Bibliotecario extends Persona{
    private double salario;

    public Bibliotecario(String nombre, String cedula, String telefono, String correo, double salario) {
        super(nombre, cedula, telefono, correo);
        this.salario=salario;
        assert!nombre.isBlank();
        assert!cedula.isBlank();
        assert!telefono.isBlank();
        assert correo.contains("@");
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularPago() {
        // Método para calcular el pago (puedes expandirlo con lógica adicional)
        return salario;
    }

    public void mostrarDetalles() {
        System.out.println("Detalles del bibliotecario:");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Cédula: " + getCedula());
        System.out.println("Teléfono: " + getTelefono());
        System.out.println("Correo: " + getCorreo());
        System.out.println("Salario: " + getSalario());
    }
}