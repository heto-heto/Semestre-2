package Geometria;

public class FiguraGeo {
    int ptoX;
    int ptoY;
    int tamBorde;
    String colorBorde;
    String colorRelleno;

    public FiguraGeo(int ptoX, int ptoY, int tamBorde, String colorBorde, String colorRelleno) {
        this.ptoX = ptoX;
        this.ptoY = ptoY;
        this.tamBorde = tamBorde;
        this.colorBorde = colorBorde;
        this.colorRelleno = colorRelleno;
    }

    

    @Override
    public String toString() {
        return "Figura Geometrica [pto X=" + ptoX + ", pto Y=" + ptoY + ", Tamaño Borde=" + tamBorde + ", Color Borde=" + colorBorde
                + ", Color Relleno=" + colorRelleno + "]";
    }



    public int getPtoX() {
        return ptoX;
    }

    public int getPtoY() {
        return ptoY;
    }

    public int getTamBorde() {
        return tamBorde;
    }

    public String getColorBorde() {
        return colorBorde;
    }

    public String getColorRelleno() {
        return colorRelleno;
    }

    public void setPtoX(int ptoX) {
        this.ptoX = ptoX;
    }

    public void setPtoY(int ptoY) {
        this.ptoY = ptoY;
    }

    public void setTamBorde(int tamBorde) {
        this.tamBorde = tamBorde;
    }

    public void setColorBorde(String colorBorde) {
        this.colorBorde = colorBorde;
    }

    public void setColorRelleno(String colorRelleno) {
        this.colorRelleno = colorRelleno;
    }

    
    
    
}
