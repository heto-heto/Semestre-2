package RedSocialBasica;
import java.util.Scanner;
import java.util.ArrayList;
public class Main{
    @SuppressWarnings("resource") //Esto me recomienda agregarlo, así que lo puse para Scanner
    public static void main(String[] args) {
        //Creamos las variables
        Scanner sc = new Scanner(System.in);
        String autor, contenido;
        int acc,numPublicacion;
        ArrayList<Publicacion>listaPublicacion=new ArrayList<>();//Array donde guardaremos las publicaciones
        Publicacion publicacion=null; //null para que solo se encuentre vacio el objeto
        
    
        do{//Panel de acciones
            System.out.println("=== GESTOR DE PUBLICACIONES ===");
            System.out.println("1. Crear publiación. ");
            System.out.println("2. Dar like a publicacion. ");
            System.out.println("3. Mostrar publicacion.");
            System.out.println("4. Agregar comentario a una publicacion.");
            System.out.println("5. Salir.");
            System.out.print("Elija una opcion: ");
            acc = sc.nextInt();
           
            switch (acc) {
                case 1://Llenar nuestro objeto
                    System.out.print("Autor de la publicacion: ");
                    autor= sc.nextLine(); //Lo puse dos veces porque no se por que me saltaba este paso
                    autor=sc.nextLine();
                    System.out.print("Escriba lo que quiera publicar: ");
                    contenido = sc.nextLine();                
                    publicacion = new Publicacion(autor, contenido);
                    listaPublicacion.add(publicacion);//Lo agregamos al array de nuestras publicaciones
                    System.out.println("");
                    break;
                case 2: //Para dar un like o que incremente
                    if(publicacion!=null){
                        System.out.print("Ingresa el número de publicación a darle like: ");
                        numPublicacion=sc.nextInt();
                        if(numPublicacion>=1 && numPublicacion<=listaPublicacion.size()){//El rango que tiene el array de la lista de publicaciones
                            publicacion = listaPublicacion.get(numPublicacion-1);//Un arreglo empieza en cero. Se le resta 1
                            publicacion.Incremento_Like();//Se le da un like
                            System.out.println("Usted ha dado un like a la publicacion.");
                            System.out.println("");
                        }else{
                            System.out.println("Número de publiación inválido.");//No esta en el rango
                            System.out.println("");
                        }
                    }else{//Sino, el objeto aún se encurentra vacío
                        System.out.println("Todavia no existe una publicación.");//No hay ningun objeto de publicacion
                        System.out.println("");
                    }
                    break;
                case 3: //Mostramos contenido
                    if(publicacion!=null){//Muestra la información del objeto
                        for(int i=0; i<listaPublicacion.size();i++){
                            System.out.println(listaPublicacion.get(i));//Mandamos a llamar al obejeto y, con i, se elige será
                            listaPublicacion.get(i).mostrarComentarios();//Mostraremos solo los comentraios de la publicacion que se encuentra
                        }
                        System.out.println("");
                        break;
                    }else{//Sino, el objeto aún se encurentra vacío
                        System.out.println("Todavia no existen publicaciones.");
                        System.out.println("");
                    }
                    break;
                case 4://Para agrear comentarios a una publicacion
                    if(publicacion!=null){//Verificamos si hay por lo menos un objeto creado
                        System.out.print("Ingresa el número de la publicación a la que desea comentar: ");
                        numPublicacion = sc.nextInt();
                        sc.nextLine();
                        //Verificamos si se encuentra en el rango de nuestras publicacoines creadas
                        if(numPublicacion >= 1 && numPublicacion <= listaPublicacion.size()){ 
                            publicacion = listaPublicacion.get(numPublicacion-1);//Un arreglo empieza en cero. Se le resta 1
                            System.out.print("Nombre de autor: ");
                            String autorComentario=sc.nextLine();
                            System.out.print("Comentraio: ");
                            String contenidoComentraio = sc.nextLine();
                            Comentario nuevoComentario = new Comentario(autorComentario, contenidoComentraio);//Damos los valores al objeto
                            publicacion.agregarComentario(nuevoComentario);
                            System.out.println("Comentraio agregado. ");
                            System.out.println("");
                        }else{//No se encuentra en el rango
                            System.out.println("Número inválido.");
                            System.out.println("");
                        }
                    }else{//Aún no hay por lo menos un objeto creado
                        System.out.println("No existen publicaciones por el momento. ");
                        System.out.println("");
                    }
                    break;
                case 5://Damos por terminado el programa
                    System.out.println("Adios.");
                    break;
                default://En caso de no elegir un numero de las opciones, mostrar lo siguiente
                    System.out.print("No es una opcion a elegir: ");
                    System.out.println("");
                    break;
            }
        }while(acc!=5);//Condicion en el que, hasta que arroje 5, terminará el ciclio do while
    }
}
