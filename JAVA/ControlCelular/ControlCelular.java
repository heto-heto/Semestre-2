package ControlCelular;
public class ControlCelular {
    // Propiedades
    String marca, owner;
    double precio;
    boolean estado;
    //Clase
    public ControlCelular(String marca, String owner, double precio){
        this.marca = marca;
        this.owner= owner;
        this.precio= precio;
        this.estado= false; //inicializamos en false

    }
    //Imprimir la información del celular
    @Override
    public String toString() {
        return "ControlCelular\nMarca= " + marca + ".\nOwner= " + owner + ". \nPrecio=" + precio + "\nEstado=" + estado;
    }
    //Aquí los set que dan los valores a los objetos que se crea, sus atributos pues
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    //Para marcar el estado en true, es decir, ponerlo en habilitado
    public void Habilitado(){
        estado=true;
    }
    public boolean VerEstado(){
        return estado;
    }
   
    //get retorna el valor del atributo, en todos los casos
    public String getMarca() {
        return marca;
    }
    public String getOwner() {
        return owner;
    }
    public double getPrecio() {
        return precio;
    }


}
