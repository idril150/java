/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package encapsulamiento;

/**
 *
 * @author Soporte
 */
public class Encapsulamiento {

    public static void main(String[] args) {
        
        Alumno alu = new Alumno();
        Alumno alu2 = new Alumno(12, "juan", "rodriguez");
                
        System.out.println("Id: "+ alu2.getId());
        System.out.println("Nombre: "+alu2.getNombre());
        System.out.println("Apellido: "+alu2.getApellido());
    }
}
