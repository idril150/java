/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author Soporte
 */
public class Empleado extends Persona{
    
    int numEmp;
    String cargo;
    Double sueldo;

    public Empleado() {
    }

    public Empleado(int numEmp, String cargo, Double sueldo, int id, int edad, String nombre, String apellido, String domicilio, String telefono) {
        super(id, edad, nombre, apellido, domicilio, telefono);
        this.numEmp = numEmp;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public int getNumEmp() {
        return numEmp;
    }

    public void setNumEmp(int numEmp) {
        this.numEmp = numEmp;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }
    
    
    
}
