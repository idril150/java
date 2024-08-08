package logica;

public class EjGenerics {

    public static void main(String[] args) {
        Caja<String> cajaString = new Caja<>();
        cajaString.ponerAlgo("hola dptmtm");
        
        Caja<Integer> cajaInt = new Caja<>();
        cajaInt.ponerAlgo(34);
        
        System.out.println(cajaString.obtenerAlgo());
        System.out.println(cajaInt.obtenerAlgo());
    }
}
