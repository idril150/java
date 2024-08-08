
package Logica;

public abstract class Pokemon {
    
    protected int numPokedex;
    protected String nombre;
    protected double peso;
    protected String sexo;
    protected int temporada;
    
    protected abstract void ataquePlacaje();
    protected abstract void ataqueAranazo();
    protected abstract void ataqueMordisco();
    
}
