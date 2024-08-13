package persistencia;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import modelo.Empleado;

public class EmpleadoJpaController implements Serializable {
    private EntityManagerFactory emf;

    public EmpleadoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public EmpleadoJpaController() {
        emf = Persistence.createEntityManagerFactory("bd1");
    }
    
    public EntityManager getEntityManager(){
        return emf.createEntityManager();
    }
    
    public Empleado findEmpleado(int id) throws Exception{
        EntityManager em = getEntityManager();
        try{
            Empleado empleadoexist = em.find(Empleado.class, id);
            if(empleadoexist == null){
                throw new EntityNotFoundException("el empleado con ID: "+id+" no se eoncontro");
            }
            return empleadoexist;
        }catch(Exception ex){
            throw ex;
        }finally{
            if (em != null) {
                em.close();
            }
        }
    }
    
    public void create (Empleado empleado) throws Exception{
        EntityManager em = null;
        try{
            em = getEntityManager();
            Empleado empleadoexist = em.find(Empleado.class, empleado.getId());
            if(empleadoexist != null){
                throw new EntityExistsException("ya existe un empleado con el id"+empleado.getId());                
            }
            
            em.getTransaction().begin();
            em.persist(empleado);
            em.getTransaction().commit();
        }catch(Exception ex){
            throw ex;
        }finally{
            if(em != null){
                em.close();
            }
        }
    }
    
    public void edit(Empleado empleado){
        EntityManager em = null;
        try{
            em = getEntityManager();
            em.getTransaction().begin();
            Empleado existEmple = em.find(Empleado.class, empleado.getId());
            if(existEmple == null){
                throw new EntityNotFoundException("el empleado con el id "+empleado.getId()+" no se encontro");                
            }
            existEmple.setNom(empleado.getNom());
            existEmple.setPue(empleado.getPue());
            existEmple.setSal(empleado.getSal());
            existEmple.setZona(empleado.getZona());
            em.getTransaction().commit();
        }catch(Exception ex){
            throw ex;
        }finally{
            if(em != null){
                em.close();
            }
        }
    }
    
    public void destroyEmpleado(int id){
        EntityManager em = null;
        try{
            em = getEntityManager();
            em.getTransaction().begin();
            Empleado empleado;
            try{
                empleado = em.getReference(Empleado.class, id);
                empleado.getId();
            }catch(EntityNotFoundException enfe){
                throw new EntityNotFoundException("el Empleado con el ID "+id+" no se encontro");
            }
            em.remove(empleado);
            em.getTransaction().commit();
        }catch(Exception ex){
            throw ex;
        }finally{
            if(em != null){
                em.close();
            }
        }
    }
    
    public List<Empleado> findEmpleados(boolean all, int maxResults, int firstResult){
        EntityManager em = getEntityManager();
        try{
            javax.persistence.criteria.CriteriaQuery<Empleado> cq = em.getCriteriaBuilder().createQuery(Empleado.class);
            cq.select(cq.from(Empleado.class));
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
