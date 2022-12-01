/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablashash;

/**
 *
 * @author ikero
 */
public class HashTableADT <T>{
    
    int tamanio;
    Nodos hash[];


    public HashTableADT(int tamanio) {
        
        this.tamanio = tamanio;
        this.hash = new Nodos[tamanio];
        
    }
    
    public void add(int key, T dato){
    
        int aux;
        aux = key%tamanio;
        
        System.out.println(aux);
        
        hash[aux]=new Nodos(key, dato);
        
        System.out.println("El dato se guardo en la casilla: "+aux);
    
    }
    
    public void valueOf(int key){
    
        int aux;
        aux = key%tamanio;    
        
        System.out.println("El id es: "+ key);
        System.out.println("El dato se encuentra en la posicion: "+ aux);
        System.out.println("El valor es: "+hash[aux].dato);
    
    }
    
    public void remove(int key){
    
        int aux;
        aux = key%tamanio;    
        
        hash[aux]=null;
        
        System.out.println("El elemento se elimino correctamente");
    
    }
    
    
}
