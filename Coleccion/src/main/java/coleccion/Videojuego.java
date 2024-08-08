package coleccion;
public class Videojuego {
    
    private int codigo,canJug;
    private String titulo,categoria,consola;

    public Videojuego(int codigo, int canJug, String titulo, String categoria, String consola) {
        this.codigo = codigo;
        this.canJug = canJug;
        this.titulo = titulo;
        this.categoria = categoria;
        this.consola = consola;
    }

    public Videojuego() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCanJug() {
        return canJug;
    }

    public void setCanJug(int canJug) {
        this.canJug = canJug;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getConsola() {
        return consola;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }

    @Override
    public String toString() {
        return "Videojuego{" + "codigo=" + codigo + ", canJug=" + canJug + ", titulo=" + titulo + ", categoria=" + categoria + ", consola=" + consola + '}';
    }
    
    
    
}
