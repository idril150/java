package Logica;

public class Alumno {
    //atributos
    int id, edad;
    String nombre, apellido;
    
    //constructor
    public Alumno() {
    }

    public Alumno(int id, int edad, String nombre, String apellido) {
        this.id = id;
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
    
    
    //metodos
    public void mostrarNombre(){
        System.out.println("hola, soy "+nombre+" "+edad);
    }
    
    public void saberAprobado (double calificacion){
        if (calificacion>=7){
            System.out.println("aprobe la materia");
        }
        else{
            System.out.println("efe reprobe");
        }
    }
    
}
