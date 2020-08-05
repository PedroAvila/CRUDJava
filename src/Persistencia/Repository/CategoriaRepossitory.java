/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia.Repository;

import Persistencia.Categoria;
import Persistencia.IRepository;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/*
    Encerrando la conexión en un bloque try-with-resources ya no necesito llamar
    a Close para detruir el objeto Connection.
*/
public class CategoriaRepossitory implements IRepository<Categoria> {
    
    @Override
    public void Create(Categoria entity) {
        String query = "INSERT INTO categorias(descripcion) VALUES(?)";
        try (Connection cn = Conexion.Con();
                PreparedStatement ps = cn.prepareStatement(query) ) {
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
    public List<Categoria> Listar() {
        ResultSet rs = null;
        Statement stm = null;
        String query = "SELECT * FROM categorias";
        List<Categoria> categoria = new ArrayList<>();
        try {
                Connection cn = Conexion.Con();
                stm = cn.createStatement();
                rs = stm.executeQuery(query);
                while(rs.next()){
                    Categoria c = new Categoria();
                    c.setCategoriaId(rs.getInt(1));
                    c.setDescripcion(rs.getString(2));
                    categoria.add(c);
                }   
        }catch(SQLException e) {
            e.printStackTrace();
        }
        return categoria;
    }
    
}
