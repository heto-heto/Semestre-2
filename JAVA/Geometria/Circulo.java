package Geometria;

public class Circulo extends FiguraGeo {
    float radio;

    public Circulo(int ptoX, int ptoY, int tamBorde, String colorBorde, String colorRelleno, float radio) {
        //Se construye primero la base y leugo el circulo
        super(ptoX, ptoY, tamBorde, colorBorde, colorRelleno); 
        this.radio = radio;
    }
    

    @Override
    public String toString() {
        return super.toString()+ "Circulo [radio=" + radio + "]";
    }


    public void Dibujas(){
        //nomas simula
        System.out.println("Dibujando circulo");

    }
    double CalcularArea(){
        double area;
        area = 3.1416*(radio*radio);
        return area;
    }
    double CalcularPerimetro(){
        double perimetro;
        perimetro = 3.1416*radio*2;
        return perimetro;
    }
}   

