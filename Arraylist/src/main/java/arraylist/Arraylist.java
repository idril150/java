package arraylist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;


public class Arraylist {

    public static void main(String[] args) {
        /*
        List<Persona> lista = new ArrayList<Persona>();
        List<Persona> lista2 = new LinkedList<Persona>();
        
        
        lista.add(new Persona(1,24,"victor"));
        lista.add(new Persona(2,34,"IDRIL"));
        lista.add(new Persona(3,28,"geo"));
        lista.add(new Persona(4,29,"Manolo"));
        
        //agregar personas al final de la linked list        
        lista2.add(new Persona(1,24,"victor"));
        lista2.add(new Persona(2,34,"IDRIL"));
        lista2.add(new Persona(3,28,"geo"));
        lista2.add(new Persona(4,29,"Manolo"));
        */
        /*
        //agregar personas al principio de la linked llist
        lista2.add(0, new Persona(5,0,"se agrego al princio"));
        
        //recorrer por indice
        System.out.println("--------------------For----------------------");
        for(int i=0; i<lista.size(); i++){
            System.err.println("prueba: "+ lista.get(i).getNombre());
        }
                
        //recorrido foreach
        System.out.println("\n-------------------For each------------------");
        for(Persona person:lista){
            System.out.println("prueba: "+ person.getNombre());
        }
        
        System.out.println("\n-------------------For each linked list------------------");
        for(Persona person:lista2){
            System.out.println("prueba: "+ person.getNombre());
        }
        
        */
        /*
        //remove en array list
        lista.remove(1);
        
        //remover en linked list
        String nombreBorrar="geo";
        for (Persona persona2 : lista2){
            if (persona2.getNombre().equals(nombreBorrar)){
                lista2.remove(persona2);
                break;
            }
        }
        
        System.out.println("\n-------------------For each------------------");
        for(Persona person:lista){
            System.out.println("prueba: "+ person.getNombre());
        }
        
        System.out.println("\n-------------------For each linked list------------------");
        for(Persona person:lista2){
            System.out.println("prueba: "+ person.getNombre());
        }
        */
        
        Stack<Integer> pila = new Stack<Integer>();
        
        System.err.println("lista vacia: "+ pila);
        System.err.println("Esta vacia? "+ pila.isEmpty());
        
        //agregar
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);
        
        //recorrido
        for (Integer punto : pila){
            System.out.println(punto);
        }
        
        //mostrar
        System.out.println("Pila: "+pila);
        System.out.println("Pila vacia? "+pila.isEmpty());
        
        pila.pop();//elimina el ultimo registro que entro
        System.out.println("Pila: "+pila);
        System.out.println("esta el 3? "+pila.search(3));
        System.out.println("ultimo agregado "+pila.peek());
        
        
    }
}
