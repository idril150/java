package pruebacalculosalarios;

public class Empleado {
    
    protected String nombre,sucursal;
    protected int id;

    protected Empleado() {
    }

    protected Empleado(String nombre, String sucursal, int id) {
        this.nombre = nombre;
        this.sucursal = sucursal;
        this.id = id;
    }

    protected String getNombre() {
        return nombre;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected String getSucursal() {
        return sucursal;
    }

    protected void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    protected int getId() {
        return id;
    }

    protected void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", sucursal=" + sucursal + ", id=" + id + '}';
    }
    
    
}
