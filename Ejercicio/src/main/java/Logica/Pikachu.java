package Logica;

public class Pikachu extends Pokemon implements IElectrico{

    public Pikachu() {
    }

    @Override
    protected void ataquePlacaje() {
        System.out.println("placaje pikachu");
    }

    @Override
    protected void ataqueAranazo() {
        System.out.println("arañazo pikachu");
    }

    @Override
    protected void ataqueMordisco() {
        System.out.println("modisco pikachu");
    }

    @Override
    public void ataqueImpacTrueno() {
        System.out.println("impactrueno pikachu");
    }

    @Override
    public void ataquePunoTrueno() {
        System.out.println("Puño trueno pikachu");
    }
    
}
