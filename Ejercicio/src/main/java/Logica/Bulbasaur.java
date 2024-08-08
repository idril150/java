package Logica;



public class Bulbasaur extends Pokemon implements IPlanta {

    public Bulbasaur() {
    }
   
    @Override
    protected void ataquePlacaje() {
        System.out.println("placaje bulbasaur");
    }

    @Override
    protected void ataqueAranazo() {
        System.out.println("arañazo bulbasaur");
    }

    @Override
    protected void ataqueMordisco() {
        System.out.println("mordisco bulbasaur");
    }

    @Override
    public void ataqueDrenaje() {
        System.out.println("drenaje bulbasaur");
    }

    @Override
    public void ataqueParalizar() {
        System.out.println("paralizar bulbasaur");
    }
    
    
}
