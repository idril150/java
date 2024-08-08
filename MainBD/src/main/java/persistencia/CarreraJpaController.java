package persistencia;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import logica.Carrera;

public class CarreraJpaController {
    
    // Atributo para almacenar la fábrica de EntityManager, que se utiliza para crear instancias de EntityManager.
    private EntityManagerFactory emf;
    
    // Constructor que recibe un EntityManagerFactory y lo asigna al atributo emf.
    public CarreraJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public CarreraJpaController() {
        emf = Persistence.createEntityManagerFactory("pruebaJPAPU");
    }
    
    
    // Método para obtener una instancia de EntityManager desde la fábrica.
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
    // Método para crear una nueva Carrera en la base de datos.
    public void create(Carrera carrera) throws Exception {
        EntityManager em = null; // Inicializa la variable para EntityManager
        try {
            em = getEntityManager(); // Obtiene una instancia de EntityManager
            em.getTransaction().begin(); // Inicia una transacción

            em.persist(carrera); // Persiste (guarda) la entidad Carrera en la base de datos

            em.getTransaction().commit(); // Confirma (commit) la transacción
        } catch (Exception ex) {
            // Maneja excepciones:
            // Verifica si la Carrera ya existe en la base de datos para evitar duplicados.
            if (findCarrera(carrera.getId()) != null) {
                throw new Exception("Carrera " + carrera + " already exists.", ex); // Lanza una excepción si ya existe
            }
            throw ex; // Lanza cualquier otra excepción que ocurra
        } finally {
            if (em != null) {
                em.close(); // Asegura que el EntityManager se cierra al final del proceso
            }
        }
    }
    
    // Método para editar una Carrera existente en la base de datos.
    public void edit(Carrera carrera) throws Exception {
        EntityManager em = null; // Inicializa la variable para EntityManager
        try {
            em = getEntityManager(); // Obtiene una instancia de EntityManager
            em.getTransaction().begin(); // Inicia una transacción

            // Busca la Carrera existente por su ID
            Carrera existingCarrera = em.find(Carrera.class, carrera.getId());
            if (existingCarrera == null) {
                throw new EntityNotFoundException("The carrera with id " + carrera.getId() + " no longer exists."); // Lanza una excepción si no se encuentra
            }

            // Actualiza los campos de la Carrera existente con los valores nuevos
            existingCarrera.setNombre(carrera.getNombre());

            em.getTransaction().commit(); // Confirma (commit) la transacción
        } catch (Exception ex) {
            throw ex; // Lanza cualquier excepción que ocurra
        } finally {
            if (em != null) {
                em.close(); // Asegura que el EntityManager se cierra al final del proceso
            }
        }
    }
    
    // Método para eliminar una Carrera de la base de datos por su ID.
    public void destroy(int id) throws Exception {
        EntityManager em = null; // Inicializa la variable para EntityManager
        try {
            em = getEntityManager(); // Obtiene una instancia de EntityManager
            em.getTransaction().begin(); // Inicia una transacción

            Carrera carrera;
            try {
                // Obtiene una referencia a la Carrera por su ID
                carrera = em.getReference(Carrera.class, id);
                carrera.getId(); // Lanza una excepción si la Carrera no existe
            } catch (EntityNotFoundException enfe) {
                throw new EntityNotFoundException("The carrera with id " + id + " no longer exists."); // Lanza una excepción si no se encuentra
            }

            // Elimina la Carrera de la base de datos
            em.remove(carrera);

            em.getTransaction().commit(); // Confirma (commit) la transacción
        } catch (Exception ex) {
            throw ex; // Lanza cualquier excepción que ocurra
        } finally {
            if (em != null) {
                em.close(); // Asegura que el EntityManager se cierra al final del proceso
            }
        }
    }
    
    // Método para encontrar una Carrera por su ID.
    public Carrera findCarrera(int id) {
        EntityManager em = getEntityManager(); // Obtiene una instancia de EntityManager
        try {
            // Busca y devuelve la Carrera con el ID especificado
            return em.find(Carrera.class, id);
        } finally {
            em.close(); // Asegura que el EntityManager se cierra al final del proceso
        }
    }
    
    // Método para obtener una lista de todas las Carreras.
    public List<Carrera> findCarreraEntities() {
        return findCarreraEntities(true, -1, -1); // Llama al método sobrecargado con parámetros predeterminados
    }
    
    public List<Carrera> findCarreraEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager(); // Obtiene una instancia de EntityManager
        try {
            // Crea una consulta de Criteria para obtener todas las Carreras
            javax.persistence.criteria.CriteriaQuery<Carrera> cq = em.getCriteriaBuilder().createQuery(Carrera.class);
            cq.select(cq.from(Carrera.class));
            javax.persistence.Query q = em.createQuery(cq);

            // Si no se obtienen todas las Carreras, aplica paginación
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }

            // Ejecuta la consulta y devuelve la lista de Carreras
            return q.getResultList();
        } finally {
            em.close(); // Asegura que el EntityManager se cierra al final del proceso
        }
    }

    
}
