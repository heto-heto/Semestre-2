package ControlCelular;
import java.util.Scanner;

public class Main {
    @SuppressWarnings("resource") //Recomendación que me arrojó el IDE para Scanner
    public static void main(String[] args) {
        // Variables a usar
        Scanner sc = new Scanner(System.in);
        String marca, owner;
        int acc;
        double precio;
        ControlCelular celu = null; // null para que se encuentra vacio mas no inexistente

        do {// Pantalla de opciones
            System.out.println("=== CONTROL DE CELULAR ===");
            System.out.println("1. Construir un celular .");
            System.out.println("2. Habilitar celular. ");
            System.out.println("3. Mostrar datos del celuar. ");
            System.out.println("4. Salir.");
            System.out.print("Elija una opcion: ");
            acc = sc.nextInt();
            switch (acc) {
                case 1:
                    // Pedimos la inoformación
                    System.out.print("Marca: ");
                    marca = sc.nextLine();
                    marca=sc.nextLine();
                    System.out.print("Owner: ");
                    owner = sc.nextLine();
                    System.out.print("Precio: ");
                    precio = sc.nextDouble();
                    // Creamos nuestro objeto
                    celu = new ControlCelular(marca, owner, precio);
                    System.out.println("");
                    break;
                case 2:
                    if(celu!=null){ //Habilitamos el celular(cambia de false a true)
                        System.out.println("El celular ha sido habilitado.");
                        celu.Habilitado();
                        System.out.println("");
                    }else{//Aún no hay datos ingresados en el objeti
                        System.out.println("No se ha creado ningun celuar.");
                    }
                    break;
                case 3:
                    if(celu!=null){//Mostramos la información del celular(objeto)
                        System.out.println(celu.toString());
                        System.out.println("");
                    }else{//Aún no hay información en el objeto
                        System.err.println("No se ha creado ningun celular.");
                        System.out.println("");
;                    }
                    break;
                case 4:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("No es una opcion a elegir.");
                    System.out.println("");
                    break;
            }
        } while (acc!=4);
    }
}
