package Logica;

public class Ejercicio {

    public static void main(String[] args) {
        
        Squirtle squrirtle = new Squirtle();
        Charmander charmander = new Charmander();
        Bulbasaur bulb = new Bulbasaur();
        Pikachu pika = new Pikachu();
        
        squrirtle.ataqueAranazo();
        squrirtle.ataqueHidrobomba();
        charmander.ataqueMordisco();
        charmander.ataqueLanzallamas();
        pika.ataqueAranazo();
        pika.ataqueImpacTrueno();
        bulb.ataquePlacaje();
        bulb.ataqueParalizar();
        
    }
}
