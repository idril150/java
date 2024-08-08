/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package exepciones;

/**
 *
 * @author Soporte
 */
public class Exepciones {

    public static void main(String[] args) {
        
        /*try{
            int resultado = 3/0;
        }
        catch(Exception e){
            System.out.println("no puede dividirse por sero!!!!!!");
        }*/
        
        int edades[]={1,2,3,4};
        try{
            System.out.println("la edad de la posicion 5 es: "+edades[5]);
        }
        catch(Exception e){
            System.out.println("el array es mas pequeño que 5");
        }
    }
}
