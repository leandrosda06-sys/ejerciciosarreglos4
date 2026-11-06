
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int MAX = 5;
        Producto productos[] = new Producto[MAX];

        int cantidad = 0;
        int opcion;

        do {
            System.out.println("\n--- MENU PRODUCTOS ---");
            System.out.println("1. Crear producto");
            System.out.println("2. Mostrar productos");
            System.out.println("3. Total de objetos creados");
            System.out.println("4. Modificar producto");
            System.out.println("5. Salir");
            System.out.print("Seleccione: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    if (cantidad < productos.length) {
                        System.out.print("Nombre: ");
                        String nombre = sc.nextLine();

                        System.out.print("Precio: ");
                        double precio =
                                Double.parseDouble(sc.nextLine());

                        System.out.print("Categoria: ");
                        String categoria = sc.nextLine();

                        productos[cantidad] =
                                new Producto(nombre, precio, categoria);

                        cantidad++;
                        System.out.println("Producto creado");
                    } else {
                        System.out.println("Arreglo lleno");
                    }
                    break;

                case 2:
                    for (int i = 0; i < productos.length; i++) {
                        if (productos[i] != null) {
                            System.out.println("\nProducto " + (i + 1));
                            productos[i].mostrarDatos();
                        }
                    }
                    break;

                case 3:
                    System.out.println("Total creados: " +
                            Producto.getTotalCreados());
                    break;

                case 4:
                    System.out.print("Ingrese indice del producto: ");
                    int indice = Integer.parseInt(sc.nextLine());

                    if (indice >= 0 && indice < cantidad) {
                        System.out.print("Nuevo nombre: ");
                        productos[indice].setNombre(sc.nextLine());

                        System.out.print("Nuevo precio: ");
                        double nuevoPrecio =
                                Double.parseDouble(sc.nextLine());
                        productos[indice].setPrecio(nuevoPrecio);

                        System.out.print("Nueva categoria: ");
                        productos[indice].setCategoria(sc.nextLine());

                        System.out.println("Producto actualizado");
                    } else {
                        System.out.println("Indice no valido");
                    }
                    break;

                case 5:
                    System.out.println("Programa finalizado");
                    break;

                default:
                    System.out.println("Opcion incorrecta");
            }
        } while (opcion != 5);

        sc.close();
    }
}
