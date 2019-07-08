package classes;

public class Coordenada {
    int eixoX;
    int eixoY;

    public Coordenada() {
    }

    public Coordenada(int eixoX, int eixoY) {
        this.eixoX = eixoX;
        this.eixoY = eixoY;
    }

    public int getEixoX() {
        return eixoX;
    }

    public void setEixoX(int eixoX) {
        this.eixoX = eixoX;
    }

    public int getEixoY() {
        return eixoY;
    }

    public void setEixoY(int eixoY) {
        this.eixoY = eixoY;
    }
    
    public String imprimir() {
        String saida = "";
        saida = "X: " + this.eixoX + " - Y: " + this.eixoY;
        
        return saida;
    }
}


