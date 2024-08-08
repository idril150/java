/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import logica.Alumno;

/**
 *
 * @author Soporte
 */
public class AlumnoJpaController implements Serializable {
    
    private EntityManagerFactory emf;

    public AlumnoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public AlumnoJpaController() {
        emf = Persistence.createEntityManagerFactory("pruebaJPAPU");
    }
    
    public EntityManager getEntityManager(){
        return emf.createEntityManager();
    }
    
    public void create (Alumno alumno) throws Exception{
        EntityManager em = null;
        try{
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(alumno);
        }catch(Exception ex){
            
        }finally{
            if(em != null){
                em.close();
            }
        }
    }
    
    public void edit(Alumno alumno) throws Exception{
        EntityManager em = null;
        try{
            em = getEntityManager();
            em.getTransaction().begin();
            Alumno existingAlumno = em.find(Alumno.class, alumno.getId());
            if(existingAlumno == null){
                throw new EntityNotFoundException("El alumno con ID "+alumno.getId()+" no se encontro");
            }else{
                existingAlumno.setNombre(alumno.getNombre());
                existingAlumno.setApellido(alumno.getApellido());
                existingAlumno.setCarrera(alumno.getCarrera());
                existingAlumno.setFecha(alumno.getFecha());
                existingAlumno.setId(alumno.getId());
                em.getTransaction().commit();
            }
        }catch(Exception ex){
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback(); // Hacer rollback en caso de excepción
            }
            throw ex;
            
        }finally{
            if(em != null){
                em.close();
            }
        }
    }
    
    public Alumno findAlumno(int id) throws Exception{
        EntityManager em = getEntityManager();
        try{
            Alumno alumexist = em.find(Alumno.class, id);
            if(alumexist == null){
                throw new EntityNotFoundException("el alumno con ID "+id+" no se encontro");
            }
            return alumexist;
        }catch(Exception ex){
            throw ex;
        }finally{
            if(em != null){
                em.close();
            }
        }
    }
    
    public void destroyAlumno(int id) throws Exception{
        EntityManager em = null;
        try{
            em = getEntityManager();
            em.getTransaction().begin();
            Alumno alumno;
            try{
                alumno = em.getReference(Alumno.class, id);
                alumno.getId();
            }catch(EntityNotFoundException enfe){
                throw new EntityNotFoundException("el Alumno con ID "+id+" no se encontro");
            }
            em.remove(alumno);
            em.getTransaction().commit();
        }catch(Exception ex){
            throw ex;
        }finally{
            if(em != null){
                em.close();
            }
        }
    }
    
    public List<Alumno> findAlumnos(){
        return null;
    }
    
    public List<Alumno> findAlumnos(boolean all, int maxResults, int firstResult){
        EntityManager em = getEntityManager();
        try{
            javax.persistence.criteria.CriteriaQuery<Alumno> cq = em.getCriteriaBuilder().createQuery(Alumno.class);
            cq.select(cq.from(Alumno.class));
            javax.persistence.Query q = em.createQuery(cq);
            if(!all){
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        }finally{
            if (em != null) {
                em.close();                
            }
        }
    }
    
}
