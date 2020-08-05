/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import java.util.List;

public interface IRepository<T>{                            
    void Create(T entity);
    void Update(T entity);                 
    void Delete(int id);   
    List<T> Listar();                     
}          
          