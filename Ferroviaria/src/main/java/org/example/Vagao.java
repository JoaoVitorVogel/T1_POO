package org.example;

public class Vagao {
    private int idVagao;
    private double capacidadeMax;
    private int idComposicao;

    public Vagao(int idVagao, double capacidadeMax, int idComposicao) {
        this.idVagao = idVagao;
        this.capacidadeMax = capacidadeMax;
        this.idComposicao = idComposicao;
    }
    
    public int getIdVagao() {
        return idVagao;
    }
    public void setIdVagao(int idVagao) {
        this.idVagao = idVagao;
    }
    public double getCapacidadeMax() {
        return capacidadeMax;
    }
    public void setCapacidadeMax(double capacidadeMax) {
        this.capacidadeMax = capacidadeMax;
    }
    public int getIdComposicao() {
        return idComposicao;
    }
    public void setIdComposicao(int idComposicao) {
        this.idComposicao = idComposicao;
    }

    @Override
    public String toString() {
        return "Vagao [idVagao=" + idVagao + ", capacidadeMax=" + capacidadeMax + ", idComposicao=" + idComposicao
                + "]";
    }   
}
