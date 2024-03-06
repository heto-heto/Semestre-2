package P1_Banco;
import java.util.Scanner;

public class Banco{
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        //Agregar las mismas variadas de la misma clase

        //De aqui
        int numCuenta=0, cvv=0, accion;
        String nameCliente;
        char op_1, op_2;
        float saldo=0, cantidad_retirar, cantidad_depo;
        CuentaBancaria cuentaB;
        //Datos de cuenta
        System.out.print("Ingrese el numero de cuenta: ");
        numCuenta = sc.nextInt();
        sc.nextLine();
        System.out.print("Ingrese el nombre del cliente: ");
        nameCliente= sc.nextLine();
        System.out.print("Saldo incial: ");
        saldo=sc.nextFloat();
        System.out.print("Ingrese el cvv: ");
        cvv=sc.nextInt();
        cuentaB = new CuentaBancaria(numCuenta, nameCliente, cvv, saldo);
        //Aca
        
        do{ //Lista de las acciones
            System.out.println("1. Mostrar saldo actual.");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero.");
            System.out.print("Elija el numero de acciones a realizar: ");
            accion = sc.nextInt();
            switch (accion) { //switcj para un mejor manejo
                case 1:
                    System.out.println("Saldo actual: "+cuentaB.Mostrar_Saldo());
                    break;
                case 2:
                    do{//En caso de querer repetir operacion, usamos el do while
                        System.out.print("Cantiadad a depositar: ");
                        cantidad_depo=sc.nextFloat();
                        cuentaB.Depoositar(cantidad_depo);
                        System.out.println("Saldo actual: "+cuentaB.Mostrar_Saldo());
                        System.out.print("Repetir operacion (y/n): ");
                        op_1 = sc.next().charAt(0);
                    }while(op_1!='n'&&op_1!='N');
                    break;
                case 3:
                    do{
                        System.out.print("Dinero a retirar: ");
                        cantidad_retirar=sc.nextFloat();
                        cuentaB.Retirar(cantidad_retirar);
                        System.out.println("Saldo actual: "+cuentaB.Mostrar_Saldo());
                        System.out.print("Repetir operacion (y/n): ");
                        op_1 = sc.next().charAt(0);
                        break;
                    }while(op_1!='n'&&op_1!='N');
                default: //No elgió una opcion de las que había, mostrar
                    System.out.println("No es una opcion a elegir");
                    break;
            }//Por si quirer hacer otra operacion o sino, finaliza el programa
            System.out.print("Hacer otra operacion diferente (y/n): ");
            op_2=sc.next().charAt(0);
        }while(op_2!='n'&& op_2!='N');

    
    }
}     

//     do{
    //         System.out.println("1. Mostrar saldo actual.");
    //         System.out.println("2. Depositar dinero");
    //         System.out.println("3. Retirar dinero.");
    //         System.out.print("Elija el numero de acciones a realizar: ");
    //         accion = sc.nextInt();
    //         switch (accion) {
    //             case 1:
    //                 banca1.getMostrar_Saldo();
    //                 break;
    //             case 2:
    //                 do{
    //                     banca1.Depositar();
    //                     System.out.print("Repetir operacion (y/n): ");
    //                     op_1 = sc.next().charAt(0);
    //                 }while(op_1!='n'&&op_1!='N');
    //                 break;
    //             case 3:
    //                 do{
    //                     banca1.Retirar();
    //                     System.out.print("Repetir operacion (y/n): ");
    //                     op_1 = sc.next().charAt(0);
    //                 }while(op_1!='n'&&op_1!='N');
    //                 break;
    //             default:
    //                 System.out.println("No es una opcion a elegir");
    //                 break;
    //         }
    //         System.out.print("Hacer otra operacion diferente (y/n): ");
    //         op_2=sc.next().charAt(0);
    //     }while(op_2!='n'&& op_2!='N');
    // }
        