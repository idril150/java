package sobreescrituraysobrecarga;

public class Animal {

    private int id_animal;
    private String descripcion;

    public Animal() {
    }

    public Animal(int id_animal, String descripcion) {
        this.id_animal = id_animal;
        this.descripcion = descripcion;
    }

    public int getId_animal() {
        return id_animal;
    }

    public void setId_animal(int id_animal) {
        this.id_animal = id_animal;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
    //sobrecargade metodos, metodos con el mismo nombre pero
    //diferente cantidad de parametros a recibir
    public void hacerSonido(){
        System.out.println("sonido");
    }
    
    public void hacerSonido(String nombre){
        System.out.println("el animal "+nombre+" hace sonido");
        
    }
    
    public void hacerSonido(String nombre, String sonido){
        System.out.println("el anima "+nombre+" hace un sonido tipo "+sonido);
    }
    
}
