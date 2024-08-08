package logica;

import java.util.Date;

public class JpaPrueba {

    public static void main(String[] args) {
        
        Controladora control = new Controladora();
        
       Alumno alu = new Alumno(25, "juan", "perez", new Date());
        
        control.crearAlumno(alu);
       
       //control.eliminarAlumno(24);
       
       alu.setApellido("marquez");
       control.modificarAlumno(alu);
        
    }
}
