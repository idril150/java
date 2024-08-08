/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package logica;

/**
 *
 * @author Soporte
 */
public class Main {

    public static void main(String[] args) {
        
        Arbol arbol1 = new Arbol("roble", "duro", "rojo", "agujas", 80, "pepe", "glaciar", 1.89, true);
        arbol1.saludar();
        Flor flor1 = new Flor("rosa", "rojos", "verde", 25, "rocio", "fresco", 1600, true);
        flor1.saludar();
        Arbusto arbusto1 = new Arbusto("rosal", "verdes", true, true, 90, "raul", "tropical", 1, true);
        arbusto1.saludar();
        
        
        
    }
}
