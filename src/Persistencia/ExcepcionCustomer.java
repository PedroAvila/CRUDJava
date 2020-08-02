/*
    Clase para manejar los errores de negocio
 */
package Persistencia;

import java.sql.SQLException;


public class ExcepcionCustomer extends RuntimeException {
    
    public ExcepcionCustomer(String message) {
        super(message);
    }

    public ExcepcionCustomer(String message, Throwable cause) {
        super(message, cause);
    }
}
