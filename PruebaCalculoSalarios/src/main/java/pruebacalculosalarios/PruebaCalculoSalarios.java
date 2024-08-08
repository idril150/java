/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pruebacalculosalarios;

import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Soporte
 */
public class PruebaCalculoSalarios {
     SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyyMMddHHmmss");
     public static int contarDiasTrabajados(List<String> registros){
        Set<String> diasTrabajados = new HashSet<>();
        
         
        
        for (String registro : registros){
            try{
                String fechaString = registro.substring(0,8);
                diasTrabajados.add(fechaString);
                System.out.print(fechaString);
                System.out.println(diasTrabajados);
            }catch(Exception e){
                System.out.println("error al procesar los registro");
            }
        }
        
        return diasTrabajados.size();
    }

    public static double calculoDeSalario(double salarioDiario, int diasTrabajados, double bono, boolean bonoAutorizado, int medioDia, int bonoGrupal){
        double salarioTotal;
        
        bonoGrupal = (bonoGrupal == 0) ? 0:bonoGrupal;
        
        if (bonoAutorizado) {
            salarioTotal=(salarioDiario*diasTrabajados)+bono-((salarioDiario/2)*medioDia)+bonoGrupal;
            return salarioTotal;
        } else {
            salarioTotal=(salarioDiario*diasTrabajados)-((salarioDiario/2)*medioDia)+bonoGrupal;
            return salarioTotal;
        }
        
    }

    public static void main(String[] args) {
        
        Lider lider1 = new Lider();
        double salario= 8500/30;
        lider1.setId(1);
        lider1.setNombre("Victor");
        lider1.setSalario(salario);
        lider1.setBono(3500);
        lider1.setSucursal("Yumka");
        
        System.out.println(lider1.getBono());
        
       
        List<String> registros = List.of("20240714100437","20240714165701","20240723100239","20240723171606","20240724100029","20240803172714","20240804100126","20240804174223");
        int diasTrabajados = contarDiasTrabajados(registros);
        System.out.println(diasTrabajados);
        System.out.println(calculoDeSalario(lider1.getSalario(), diasTrabajados, lider1.getBono(), false, 0, 0));
       
        
    }
    
    
}
