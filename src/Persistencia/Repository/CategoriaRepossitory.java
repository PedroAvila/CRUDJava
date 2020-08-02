/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia.Repository;

import Persistencia.Categoria;
import Persistencia.IRepository;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

/*
    Encerrando la conexión en un bloque try-with-resources ya no necesito llamar
    a Close para detruir el objeto Connection.
*/
public class CategoriaRepossitory implements IRepository<Categoria> {
    
    @Override
    public void Create(Categoria entity) {
        String CATEGORIAS_INSERT_SQL = "INSERT INTO categorias(descripcion) VALUES(?)";
        try (Connection cn = Conexion.Con();
                PreparedStatement ps = cn.prepareStatement(CATEGORIAS_INSERT_SQL) ) {
                ps.setString(1, entity.getDescripcion());
                ps.execute();
        }catch(SQLException e) {
            //se puede mejorar usando una librería de Logging como Log4j o Logback....
            e.printStackTrace();
        }
    }

    @Override
    public void Update(Categoria entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DefaultTableModel List() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
