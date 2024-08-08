/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Logica;

/**
 *
 * @author Soporte
 */
public class Poo {

    public static void main(String[] args) {
        
        Alumno alu1 = new Alumno();
        Alumno alu2 = new Alumno(02, 24, "Victor", "munoz");
        
        System.out.println("el id del alumno "+alu2.getId()+" es: "+alu2.getId());
        System.out.println("el nombre del alumno "+alu2.getId()+" es: "+alu2.getNombre());
        System.out.println("el apellido del alumno "+alu2.getId()+" es: "+alu2.getApellido());
        System.out.println("el edad del alumno "+alu2.getId()+" es: "+alu2.getEdad());
        System.out.println("------------------------------------------------------------");
        alu1.setId(01);
        alu1.setNombre("joaquin");
        alu1.setApellido("martinez");
        alu1.setEdad(22);
        System.out.println("el id del alumno "+alu1.getId()+" es: "+alu1.getId());
        System.out.println("el nombre del alumno "+alu1.getId()+" es: "+alu1.getNombre());
        System.out.println("el apellido del alumno "+alu1.getId()+" es: "+alu1.getApellido());
        System.out.println("el edad del alumno "+alu1.getId()+" es: "+alu1.getEdad());
        System.out.println("------------------------------------------------------------");
        alu2.setId(35);
        System.out.println("el id del alumno "+alu2.getId()+" es: "+alu2.getId());
    }
}
