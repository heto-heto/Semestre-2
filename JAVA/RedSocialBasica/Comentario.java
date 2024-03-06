package RedSocialBasica;
import java.util.Date;
public class Comentario {
    //Atributos
    String nombreUsuario, textoComentario;
    Date fechadelComentario;
    //Constructor
    public Comentario(String nombreUsuario, String textoComentario){
        this.nombreUsuario = nombreUsuario;
        this.textoComentario = textoComentario;
        this.fechadelComentario=new Date();
    }
        //Metodos
    //Los gets: mostrar valor
    public String getNombreUsuario() {
        return nombreUsuario;
    }
    public String getTextoComentario() {
        return textoComentario;
    }
    public Date getFechadelComentario() {
        return fechadelComentario;
    }
    //Los sets: dar valor
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    public void setTextoComentario(String textoComentario) {
        this.textoComentario = textoComentario;
    }
    public void setFechadelComentario(Date fechadelComentario) {
        this.fechadelComentario = fechadelComentario;
    }
}
