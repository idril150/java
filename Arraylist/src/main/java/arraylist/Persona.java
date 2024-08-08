package arraylist;

public class Persona {
    private int num,edad;
    private String nombre;

    public Persona() {
    }

    public Persona(int num, int edad, String nombre) {
        this.num = num;
        this.edad = edad;
        this.nombre = nombre;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "num=" + num + ", edad=" + edad + ", nombre=" + nombre + '}';
    }
    
    
    
}
