package RedSocialBasica;
import java.util.Date;
import java.util.ArrayList;

public class Publicacion {
    //Atributos
    String autor, contenido;
    Date fecha;
    int likes;
    ArrayList<Comentario>comentarios;
    //Clase
    public Publicacion(String autor, String contenido){
        this.fecha = new Date();
        this.autor = autor;
        this.contenido = contenido;
        this.likes = 0;
        this.comentarios=new ArrayList<>();
    }
    //Metodos
    @Override
    public String toString() {//Se ve así para que tenga diseño la impresión en pantalla
        return 
            " --------------------------------------------|\n"+
            "|  "+autor+": \n"+
            "|  "+contenido+"\n"+
            "|                                    Likes: "+likes+"\n"+
            "| Fecha: "+fecha+"\n"+
            " --------------------------------------------|";
    }
   
    //Agregar un comentario
    public void agregarComentario(Comentario comentario){
        comentarios.add(comentario);
    }  
    //Mostrar los comentarios
    public void mostrarComentarios(){
        for (int i = 0; i < comentarios.size(); i++) { 
            Comentario comentario = comentarios.get(i); 
            System.out.print("  ");
            System.out.print((i + 1)+". "+ comentario.getNombreUsuario()+": " ); 
            System.out.println(comentario.getTextoComentario() ); 
            System.out.println("    Fecha:" + comentario.getFechadelComentario() ); 
        }
        
    }
    
    //Autor
    public void setAutor(String autor){
        this.autor =autor;
    }
    public String getAutor(){
        return autor;
    }
    //Contenido
    public void setContenido(String contenido){
        this.contenido=contenido;
    }
    public String getContenido(){
        return contenido;
    }
    //Fecha
    public Date getFecha(){
        return fecha;
    }
    //Likes
    void Incremento_Like(){ //Aumento el contador, para que tengas los likes
        likes+=1;
    }
    public int getLikes(){
        return likes;
    }
    public ArrayList<Comentario> getComentarios() {
        return comentarios;
    }
}

