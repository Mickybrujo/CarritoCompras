package carritocompras;

import java.sql.Connection;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion = 0;

        do {
            System.out.println("---------MENU---------");
            System.out.println("----------------------");
            System.out.println("Administracion de productos");
            System.out.println("1. Agregar Producto");
            System.out.println("2. Ver Productos");
            System.out.println("3. Editar productos");
            System.out.println("4. Eliminar productos");
            System.out.println("5. Salir");
            System.out.println("----------------------");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    ProductosService.crearProducto();
                    break;
                case 2:
                    ProductosService.listarProducto();
                    break;
                case 3:
                    ProductosService.editarProducto();
                    break;
                case 4:
                    ProductosService.borrarProducto();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opcion invalida.");
                    break;

            }
        } while (opcion != 5);
    }

}
