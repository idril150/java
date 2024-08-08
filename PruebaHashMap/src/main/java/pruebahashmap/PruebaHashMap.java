package pruebahashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PruebaHashMap {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        Map<Integer,String> mapaEmpleado = new HashMap<>();
        
        mapaEmpleado.put(1, "juan");
        mapaEmpleado.put(2, "David");
        mapaEmpleado.put(39, "enrique");
        mapaEmpleado.put(4, "mmarco");
        
        if (mapaEmpleado.containsValue("David")) {
            System.out.println("el empleado esta");
        }else{
            System.out.println("no anda");
        }
        
        int key=2;        
        if (mapaEmpleado.containsKey(key)) {
            System.out.println("el empleado "+mapaEmpleado.get(key)+" esta");
        }else{
            System.out.println("no anda");
        }
        
        System.out.println(mapaEmpleado.keySet());
        System.out.println(mapaEmpleado.values());
        System.out.println(mapaEmpleado.get(key));
        
        String busqueda = teclado.next();
        
        List<Integer> keys = new ArrayList<>(mapaEmpleado.keySet());
        System.out.println(keys.toString());
        for(int i=0; i<mapaEmpleado.size(); i++){
            
            if(mapaEmpleado.get(keys.get(i))==busqueda){
                System.out.println("el empleado "+busqueda+" tiene el ID "+keys.get(i));
                key = keys.get(i);
                break;
            }else{
                
            }
        }
        System.out.println(mapaEmpleado.get(key));
        
        mapaEmpleado.remove(key);
        
        System.err.println(mapaEmpleado.values());
        
        
    }
}
