
public class Producto {
    private String nombre;
    private double precio;
    private String categoria;

    private int id;
    private static int contador = 0;

    public Producto(String nombre, double precio, String categoria) {
        this.nombre = nombre;
        setPrecio(precio);
        this.categoria = categoria;

        contador++;
        this.id = contador;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            System.out.println("Precio no valido");
        }
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public static int getTotalCreados() {
        return contador;
    }

    public void mostrarDatos() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Categoria: " + categoria);
    }
}
