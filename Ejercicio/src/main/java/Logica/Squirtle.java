package Logica;

public class Squirtle extends Pokemon implements IAgua{

    public Squirtle() {
    }
    

    @Override
    protected void ataquePlacaje() {
        System.out.println("placaje squirtle");
    }

    @Override
    protected void ataqueAranazo() {
        System.out.println("arañazo squirtle");
    }

    @Override
    protected void ataqueMordisco() {
        System.out.println("mordisco squirtle");
    }

    @Override
    public void ataqueHidrobomba() {
        System.out.println("Hidro bomba squirtle");
    }

    @Override
    public void ataqueBurbuja() {
        System.out.println("burbuja squirtle");
    }

    @Override
    public void ataquePistolaAgua() {
        System.out.println("Pistola de Agua squirtle");
    }
    
}
