package modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Empleado implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private String zona;

    public Empleado() {
    }

    public Empleado(int id, String nom, String pue, double sal, String zona) {
        this.id = id;
        this.nombre = nom;
        this.puesto = pue;
        this.salario = sal;
        this.zona = zona;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nombre;
    }

    public void setNom(String nom) {
        this.nombre = nom;
    }

    public String getPue() {
        return puesto;
    }

    public void setPue(String pue) {
        this.puesto = pue;
    }

    public double getSal() {
        return salario;
    }

    public void setSal(double sal) {
        this.salario = sal;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nom=" + nombre + ", pue=" + puesto + ", sal=" + salario + ", zona=" + zona + '}';
    }
    
}
