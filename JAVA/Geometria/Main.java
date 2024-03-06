package Geometria;
import java.util.Scanner;
//Esta proyecto es para calcular el área, perimetro y dibujar figura(simulado)
//Se crearán Circulos, Cuadros y Triángulo
public class Main {
    //static para que sea usado en todos los métodos
    static Scanner sc = new Scanner(System.in);
   
    public static void main(String[] args) {
        Circulo cir= null;
        Cuadrado cua=null;
        Triangulo tri=null;
        
        int op;
        
        do{
            System.out.println("¿Qué figura desea crear? ");
            System.out.println("1. Circulo.");
            System.out.println("2. Cuadrado.");
            System.out.println("3. Triangulo.");
            System.out.println("4. Salir.");
            System.out.print("Opción: ");
            op=sc.nextInt();//Dato de entrada 
            sc.nextLine();//Limpia el buffer
           
            switch (op) {
                case 1:
                    cir = crearCirculo();
                    System.out.println("");
                    break;
                case 2:
                    cua = crearCuadrado();
                    System.out.println("");
                    break;
                case 3:
                    tri = crearTriangulo();
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("Adios.");               
                    System.out.println("");
                    break;
                default:
                    System.out.println("No es una opción a elegir. Intete de nuevo.");
                    System.out.println("");
                    break;
            }
        }while(op!=4);
        if(cir!=null){
            System.out.println("|---- CIRCULO ----|");
            System.out.println("Area del circulo: "+cir.CalcularArea());
            System.out.println("Perimetro del circulo: "+cir.CalcularPerimetro());
        }
        if(cua!=null){
            System.out.println("|---- CUADRADO ----|");
            System.out.println("Area del cuadrado: "+cua.CalcularArea());
            System.out.println("Perimetro del cuadrado: "+cua.CalcularPerimetro());
        }
        if(tri!=null){
            System.out.println("|---- TRIANGULO ----|");
            System.out.println("Area del triangulo: "+tri.CalcularArea());
            System.out.println("Perimetro del triangulo: "+tri.CalcularPerimetro());
            System.out.println("Datos del triangulo: "+tri.toString());
        }
    
    }
    //Para la creación de un circulo
    public static Circulo crearCirculo(){
        Circulo c;
        int ptoX, ptoY, tamBorde;
        String colorBorde, colorRelleno;
        float radio;
        //Pedimos los valores de cada dato
        System.out.print("Radio: "); radio=sc.nextFloat(); sc.nextLine(); //Limpiamos porque es entrda numerica
        System.out.print("Punto X: "); ptoX=sc.nextInt(); sc.nextLine();
        System.out.print("Punto Y: "); ptoY=sc.nextInt(); sc.nextLine();
        System.out.print("Tamaño borde: "); tamBorde=sc.nextInt(); sc.nextLine();
        System.out.print("Color de borde: "); colorBorde=sc.nextLine();
        System.out.print("Color de relleno: "); colorRelleno=sc.nextLine();
        // Le damos ya todos los valores a nuestro objeto
        c = new Circulo(ptoX, ptoY, tamBorde, colorBorde, colorRelleno, radio);
        //Por último, damos el return de nuestro objeto
        return c;
    }
    //Para la creacion de un circulo
    public static Cuadrado crearCuadrado(){
        Cuadrado cua;
        int ptoX, ptoY, tamBorde; 
        String colorBorde, colorRelleno;
        float lado;
        //Pedimos los datos
        System.out.print("Lado: "); lado=sc.nextFloat(); sc.nextLine();
        System.out.print("Punto X: "); ptoX=sc.nextInt(); sc.nextLine();
        System.out.print("Punto Y: "); ptoY=sc.nextInt(); sc.nextLine();
        System.out.print("Tamaño borde: "); tamBorde=sc.nextInt(); sc.nextLine();
        System.out.print("Color de borde: "); colorBorde=sc.nextLine();
        System.out.print("Color de relleno: "); colorRelleno=sc.nextLine();
        //Creamos nuestro nuevo objeto
        cua = new Cuadrado(ptoX, ptoY, tamBorde, colorBorde, colorRelleno, lado);
        //Retornamos nuestro objeto
        return cua;
    }
    //Para la creacion del un Triángulo
    public static Triangulo crearTriangulo(){
        Triangulo tri;
        int ptoX, ptoY, tamBorde;
        String colorBorde, colorRelleno;
        float base, altura;
        //Pedimos los valores
        System.out.print("Base: "); base=sc.nextFloat();sc.nextLine();
        System.out.print("Altura: "); altura=sc.nextFloat();sc.nextLine();
        System.out.print("Punto X: "); ptoX=sc.nextInt(); sc.nextLine();
        System.out.print("Punto Y: "); ptoY=sc.nextInt(); sc.nextLine();
        System.out.print("Tamaño borde: "); tamBorde=sc.nextInt(); sc.nextLine();
        System.out.print("Color de borde: "); colorBorde=sc.nextLine();
        System.out.print("Color de relleno: "); colorRelleno=sc.nextLine();
        tri = new Triangulo(ptoX, ptoY, tamBorde, colorBorde, colorRelleno, base, altura);
        //Retornamos nuestro nuevo objeto
        return tri;
        
    }
}
