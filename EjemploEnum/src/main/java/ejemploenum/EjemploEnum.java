package ejemploenum;

import ejemploenum.enums.Color;

public class EjemploEnum {

    public static void main(String[] args) {
        for (Color color : Color.values()){
            System.out.println("color: "+color);
        }
        
        Color col = Color.NEGRO;
        
        System.out.println(col.name());
        System.out.println(col.ordinal());
        try{
            System.out.println(Color.valueOf("PURPURA"));
        }
        catch(Exception e){
            System.out.println("El color no es valido");
        }
        
    }
}
