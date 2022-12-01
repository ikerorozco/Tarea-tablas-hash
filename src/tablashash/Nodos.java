/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablashash;

/**
 *
 * @author ikero
 */
public class Nodos <T> {
    
    int id;
    
    T dato;

    public Nodos() {
    }

    public Nodos(int id, T dato) {
        this.id = id;
        this.dato = dato;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    
    
    
}
