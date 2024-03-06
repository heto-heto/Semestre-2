package Geometria;
import java.lang.Math;
public class Triangulo extends FiguraGeo{
    float base, altura;

    public Triangulo(int ptoX, int ptoY, int tamBorde, String colorBorde, String colorRelleno, float base,
            float altura) {
        super(ptoX, ptoY, tamBorde, colorBorde, colorRelleno);
        this.base = base;
        this.altura = altura;
    }
    
    
    @Override
    public String toString() {
        return super.toString()+"Triangulo [Base=" + base + ", ltura=" + altura + "]";
    }


    double CalcularArea(){
        return (base*altura)/2;
    }
    double CalcularPerimetro(){
        double base_2=base/2;
        double perimetro  = base+(2*Math.sqrt(Math.pow(base_2, 2)+Math.pow(altura, 2)));
        return perimetro;
    }

}
