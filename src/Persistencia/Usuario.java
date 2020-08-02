/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;


public class Usuario {
    
    private int UsuarioId;

    
    public int getUsuarioId() {
        return UsuarioId;
    }

    
    public void setUsuarioId(int UsuarioId) {
        this.UsuarioId = UsuarioId;
    }

    private String Nombre;

    
    public String getNombre() {
        return Nombre;
    }

    
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    private String Clave;

    
    public String getClave() {
        return Clave;
    }

    
    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    private String Estado;

    
    public String getEstado() {
        return Estado;
    }

    
    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
}
