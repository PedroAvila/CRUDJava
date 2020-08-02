
package Persistencia.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    
     public static Connection Con() throws SQLException{
         Connection cn = null;
         try{
             cn = DriverManager
                     .getConnection("jdbc:postgresql://localhost:5432/market", "postgres", "pollita44");
             if(cn != null){
                 System.out.println("Conectado");
             }
         }catch(SQLException e){
             System.out.println("No se puedo conectar a la base de datos");
             e.printStackTrace();
         }
         return cn;
     }   
}
