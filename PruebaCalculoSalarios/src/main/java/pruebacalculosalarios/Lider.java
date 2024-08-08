package pruebacalculosalarios;

public class Lider extends Empleado{
    double Salario,bono;

    public Lider() {
    }

    public Lider(double Salario, double bono) {
        this.Salario = Salario;
        this.bono = bono;
    }

    public Lider(double Salario, double bono, String nombre, String sucursal, int id) {
        super(nombre, sucursal, id);
        this.Salario = Salario;
        this.bono = bono;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }
    
}
