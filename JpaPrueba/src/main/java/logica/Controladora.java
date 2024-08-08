package logica;

import persistencia.ControladoraPersistencia;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void crearAlumno(Alumno alumno) {
        controlPersis.crearAlumnio(alumno);
    }
    
    public void eliminarAlumno(int id){      
        controlPersis.eliminarAlumno(id);
    }
    
    public void modificarAlumno(Alumno alumno){
        controlPersis.modificarAlumno(alumno);
    }

}
