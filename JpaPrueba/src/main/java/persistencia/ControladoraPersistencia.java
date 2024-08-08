package persistencia;

import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Alumno;

public class ControladoraPersistencia {

    AlumnoJpaController aluJpa = new AlumnoJpaController();

    public void crearAlumnio(Alumno alumno) {
        aluJpa.create(alumno);
    }

    public void eliminarAlumno(int id) {
        try {
            aluJpa.destroy(id);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void modificarAlumno(Alumno alumno){
        try {
            aluJpa.edit(alumno);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
