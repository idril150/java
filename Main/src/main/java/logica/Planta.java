package logica;

public abstract class Planta {
    
    private String nombre,climaIdeal;
    private double altura;
    private boolean hojas;

    protected Planta() {
    }

    protected Planta(String nombre, String climaIdeal, double altura, boolean hojas) {
        this.nombre = nombre;
        this.climaIdeal = climaIdeal;
        this.altura = altura;
        this.hojas = hojas;
    }

    protected String getNombre() {
        return nombre;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected String getClimaIdeal() {
        return climaIdeal;
    }

    protected void setClimaIdeal(String climaIdeal) {
        this.climaIdeal = climaIdeal;
    }

    protected double getAltura() {
        return altura;
    }

    protected void setAltura(double altura) {
        this.altura = altura;
    }

    protected boolean isHojas() {
        return hojas;
    }

    protected void setHojas(boolean hojas) {
        this.hojas = hojas;
    }
    
    protected abstract void saludar();
    
    
}
