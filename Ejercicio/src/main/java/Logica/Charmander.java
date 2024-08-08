package Logica;

public class Charmander extends Pokemon implements IFuego{

    public Charmander() {
    }
    
    @Override
    protected void ataquePlacaje() {
       System.out.println("placaje charmander");
    }

    @Override
    protected void ataqueAranazo() {
        System.out.println("arañazo charmander");
    }

    @Override
    protected void ataqueMordisco() {
        System.out.println("mordisco charmander");
    }

    @Override
    public void ataquePunoFuego() {
        System.out.println("puñofuego charmander");
    }

    @Override
    public void ataqueAzquas() {
        System.out.println("azquas charmander");
    }

    @Override
    public void ataqueLanzallamas() {
        System.out.println("Lanzallamas charmander");
    }
    
}
