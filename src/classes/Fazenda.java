package classes;

import classes.Coordenada;
import java.util.ArrayList;

public class Fazenda {
    String nome;
    Coordenada cSuperior, cInferior;
    private static ArrayList<Meteoro> lstMeteoros = new ArrayList<>();

    public Fazenda() {
    }

    public Fazenda(String nome, Coordenada cSuperior, Coordenada cInferior) {
        this.nome = nome;
        this.cSuperior = cSuperior;
        this.cInferior = cInferior;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Coordenada getcSuperior() {
        return cSuperior;
    }

    public void setcSuperior(Coordenada cSuperior) {
        this.cSuperior = cSuperior;
    }

    public Coordenada getcInferior() {
        return cInferior;
    }

    public void setcInferior(Coordenada cInferior) {
        this.cInferior = cInferior;
    }

    public ArrayList<Meteoro> getLstMeteoros() {
        return lstMeteoros;
    }

    public int calcularMeteorosCaiuDentro() {
        int qtdMeteoros = 0;
        for (Meteoro m : lstMeteoros) {
            int meteoroX = m.getCoordenada().getEixoX();
            int meteoroY = m.getCoordenada().getEixoY();
            if (meteoroX >= this.cSuperior.getEixoX() && meteoroX <= this.cInferior.getEixoX()) {
                if (meteoroY >= this.cInferior.getEixoY() && meteoroY <= this.cSuperior.getEixoY()) {
                    qtdMeteoros++;
                }
            }
        }

        return qtdMeteoros;
    }

    private String strListaMeteoros() {
        String saida = "";

        int i = 0;
        for (Meteoro m : lstMeteoros) {
            saida += "\n==== Meteoro " + (++i) + " ====\n";
            saida += m.imprimir();
        }

        return saida;
    }

    public String imprimir() {
        String saida = "";
        saida += "\nNome: " + this.nome
                + "\nCoordenada superior esquerda: " + this.cSuperior.getEixoX() + " " + this.cSuperior.getEixoY()
                + "\nCoordenada inferior direita: " + this.cInferior.getEixoX() + " " + this.cInferior.getEixoY()
                + "\nLista de Meteoros: " + this.strListaMeteoros();
        return saida;
    }
}
