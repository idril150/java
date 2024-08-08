package coleccion;

import java.util.ArrayList;
import java.util.List;

public class Coleccion {

    public static void main(String[] args) {
        List<Videojuego> juegos = new ArrayList<Videojuego>();
         
        Videojuego juego1 = new Videojuego(1,32,"halo","accion","XBOX");
        Videojuego juego2 = new Videojuego(2,327,"Gears","accion","XBOX");
        Videojuego juego3 = new Videojuego(3,356,"Persona","Role","Play Station");
        Videojuego juego4 = new Videojuego(4,34,"Mario 64","Plataformas","Nintendo 64");
        Videojuego juego5 = new Videojuego(5,65,"Golden eye","shooter","Nintendo 64");
        
        juegos.add(juego1);
        juegos.add(juego2);
        juegos.add(juego3);
        juegos.add(juego4);
        juegos.add(juego5);
         
        for(Videojuego juego : juegos){
            System.out.println("el juego "+juego.getTitulo()+" de "+juego.getConsola()+" tiene "+juego.getCanJug()+" jugadores");
        }
        
        System.out.println("\n------------- cambio de nombre y cantidad de jugadores -------------");
         
        juego1.setTitulo("halo 2");
        juego2.setTitulo("gears 2");
        juego3.setTitulo("persona Royale");
        juego4.setTitulo("Mario 64");
        juego5.setTitulo("Donkey kong 64");
        
        juego1.setCanJug(877);
        juego2.setCanJug(87);
        juego3.setCanJug(372);
        juego4.setCanJug(547);
        juego5.setCanJug(865);
        
        for(Videojuego juego : juegos){
            System.out.println("el juego "+juego.getTitulo()+" de "+juego.getConsola()+" tiene "+juego.getCanJug()+" jugadores");
        }
        
        System.out.println("\n---------- juegos de N64 ------------");
        
        for(Videojuego juego : juegos){
            if(juego.getConsola().equals("Nintendo 64")){ 
                System.out.println(juego.toString());
            }
        }
        
    }
}
