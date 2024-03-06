package Geometria;

public class Cuadrado extends FiguraGeo {
    float lado;

    public Cuadrado(int ptoX, int ptoY, int tamBorde, String colorBorde, String colorRelleno, float lado) {
        super(ptoX, ptoY, tamBorde, colorBorde, colorRelleno);
        this.lado = lado;
    }

    @Override
    public String toString() {
        return super.toString()+ "Cuadrado [Lado=" + lado + "]";
    }
    public void Dibujas(){
        //nomas simula
        System.out.println("Dibujando cuadrado");

    }
    double CalcularArea(){
        return lado*lado;   
    }
    double CalcularPerimetro(){
        return 4*lado;
    }
    
}
