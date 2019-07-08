package classes;

public class Meteoro {
    Coordenada coordenada;

    public Meteoro() {
    }

    public Meteoro(Coordenada coordenada) {
        this.coordenada = coordenada;
    }

    public Coordenada getCoordenada() {
        return coordenada;
    }

    public void setCoordenada(Coordenada coordenada) {
        this.coordenada = coordenada;
    }
    
    public String imprimir() {
        String saida = "";
        saida += "Coordenadas: " + coordenada.imprimir();
        return saida;
    }
}
