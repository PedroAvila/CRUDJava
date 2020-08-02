/*
    Clase para manejar los errores de negocio
 */
package Persistencia;

import java.sql.SQLException;


public class ExcepcionCustome extends RuntimeException {
    
    public ExcepcionCustome(String message) {
        super(message);
    }

    public ExcepcionCustome(String message, Throwable cause) {
        super(message, cause);
    }
}
