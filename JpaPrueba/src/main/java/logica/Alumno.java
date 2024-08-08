package logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Alumno implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    @Basic
    private String nobre; 
    private String apellido;
    @Temporal(TemporalType.DATE)
    private Date fechaNAc;

    public Alumno() {
    }

    public Alumno(int id, String nobre, String apellido, Date fechaNAc) {
        this.id = id;
        this.nobre = nobre;
        this.apellido = apellido;
        this.fechaNAc = fechaNAc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNobre() {
        return nobre;
    }

    public void setNobre(String nobre) {
        this.nobre = nobre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNAc() {
        return fechaNAc;
    }

    public void setFechaNAc(Date fechaNAc) {
        this.fechaNAc = fechaNAc;
    }
    
}
