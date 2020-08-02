/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;
                                                                             
import javax.swing.table.DefaultTableModel;


public class Articulo {   
    
    private int ArticuloId;

    
    public int getArticuloId() {
        return ArticuloId;
    }z

    
    public void setArticuloId(int ArticuloId) {
        this.ArticuloId = ArticuloId;
    }

    private int CategoriaId;

    
    public int getCategoriaId() {
        return CategoriaId;
    }

    
    public void setCategoriaId(int CategoriaId) {
        this.CategoriaId = CategoriaId;
    }

    private String Descripcion;

    
    public String getDescripcion() {
        return Descripcion;
    }

    
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    private double Costo;

    
    public double getCosto() {
        return Costo;
    }

    
    public void setCosto(double Costo) {
        this.Costo = Costo;
    }

    private double Stock;

    
    public double getStock() {
        return Stock;
    }

    
    public void setStock(double Stock) {
        this.Stock = Stock;
    }

    private double Pvp;

    
    public double getPvp() {
        return Pvp;
    }

    
    public void setPvp(double Pvp) {
        this.Pvp = Pvp;
    }

    private String Estado;

    
    public String getEstado() {
        return Estado;
    }

    
    public void setEstado(String Estado) {
        this.Estado = Estado;
    }


}                                                                 
                    