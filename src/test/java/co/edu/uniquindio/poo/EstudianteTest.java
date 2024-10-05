/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class EstudianteTest {
    private static final Logger LOG = Logger.getLogger(EstudianteTest.class.getName());

    /**
     * Rigorous Test :-)
     * 
     *
     */
    
        
    @Test
    public void datosVacios() {
        LOG.info("Iniciando test datosVacios");

        assertThrows(Throwable.class, ()->new Estudiante(" ", " ", " ", " ", 3));

        LOG.info("Finalizando test datosVacios");
    }
    @Test
    public void validacionCorreo() {
        LOG.info("Iniciando test validacionCorreo");

        assertThrows(Throwable.class, ()->new Estudiante("Mayra López", "1094908684", "3167789078", "May", 3));

        LOG.info("Finalizando test validacionCorreo");
    }
    @Test
    public void datosVacio() {
        LOG.info("Iniciando test datosVacios");

        assertThrows(Throwable.class, ()->new Bibliotecario(" ", " ", " ", " ",1300000 ));

        LOG.info("Finalizando test datosVacios");
    }
    @Test
    public void validacioCorreo() {
        LOG.info("Iniciando test validacionCorreo");

        assertThrows(Throwable.class, ()->new Bibliotecario("Carlos Rua", "7550263", "123", "Crgmail.com", 1300000));

        LOG.info("Finalizando test validacionCorreo");
    }
}