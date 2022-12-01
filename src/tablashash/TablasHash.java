/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tablashash;

/**
 *
 * @author ikero
 */
public class TablasHash {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        HashTableADT tablaHashiana = new HashTableADT(8);
        
        tablaHashiana.add(98,"Iker");
        tablaHashiana.add(99,"Fer");
        tablaHashiana.add(100,"Isa");
        tablaHashiana.add(101,"Martha");
        tablaHashiana.add(102,"Armando");
        tablaHashiana.add(103,"Jose Armando");
        tablaHashiana.add(104,"Max");
        tablaHashiana.add(105,"Bruno");
        
        tablaHashiana.valueOf(98);
        tablaHashiana.valueOf(99);
        tablaHashiana.valueOf(100);
        tablaHashiana.valueOf(101);
        tablaHashiana.valueOf(102);
        tablaHashiana.valueOf(103);
        tablaHashiana.valueOf(104);
        tablaHashiana.valueOf(105);
        
        tablaHashiana.remove(98);
        tablaHashiana.remove(99);
        tablaHashiana.remove(100);
        tablaHashiana.remove(101);
        tablaHashiana.remove(102);
        tablaHashiana.remove(103);
        tablaHashiana.remove(104);
        tablaHashiana.remove(105);

        
    }
    
}
