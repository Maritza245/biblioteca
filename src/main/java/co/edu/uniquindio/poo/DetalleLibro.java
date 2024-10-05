package co.edu.uniquindio.poo;
import java.util.List;

public class DetalleLibro{
    private Estudiante estudianteConMasPrestamo;
    private double dineroPagado;
    private List<Prestamo> prestamos;

    public DetalleLibro(Estudiante estudianteConMasPrestamo, double dineroPagado, List<Prestamo> prestamos) {
        this.estudianteConMasPrestamo = estudianteConMasPrestamo;
        this.dineroPagado = dineroPagado;
        this.prestamos = prestamos;

    }

    public Estudiante getEstudianteConMasPrestamo() {
        return estudianteConMasPrestamo;
    }

    public void setEstudianteConMasPrestamo(Estudiante estudianteConMasPrestamo) {
        this.estudianteConMasPrestamo = estudianteConMasPrestamo;
    }

    public double getDineroPagado() {
        return dineroPagado;
    }

    public void setDineroPagado(double dineroPagado) {
        this.dineroPagado = dineroPagado;
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(List<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    @Override
    public String toString() {
        return "DetalleLibro" + estudianteConMasPrestamo + "," + dineroPagado
                + ", prestamos=" + prestamos + "]";
    }

    public void mostrarDetalleListaPrestamo() {
        System.out.println("Detalle de préstamos del estudiante " + estudianteConMasPrestamo.getNombre());
        System.out.println("Dinero pagado: " + dineroPagado);
        System.out.println("Lista de préstamos:");
        for (Prestamo prestamo : prestamos) {
            System.out.println("Fecha de préstamo: " + prestamo.getFechaPrestamo());
            System.out.println("Fecha de devolución: " + prestamo.getFechaDevolucion());
            System.out.println("Detalle de préstamos del estudiante " + estudianteConMasPrestamo.getNombre());
            System.out.println();
 }
}
}

