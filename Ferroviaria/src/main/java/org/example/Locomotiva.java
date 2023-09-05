package org.example;

public class Locomotiva {
    private int id;
    private double pesoMax;
    private int maxVagoes;
    private int idComposicao;

    public Locomotiva(int id, double pesoMax, int maxVagoes, int idComposicao) {
        this.id = id;
        this.pesoMax = pesoMax;
        this.maxVagoes = maxVagoes;
        this.idComposicao = idComposicao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPesoMax() {
        return pesoMax;
    }

    public void setPesoMax(double pesoMax) {
        this.pesoMax = pesoMax;
    }

    public int getMaxVagoes() {
        return maxVagoes;
    }

    public void setMaxVagoes(int maxVagoes) {
        this.maxVagoes = maxVagoes;
    }

    public int getIdComposicao() {
        return idComposicao;
    }

    public void setIdComposicao(int idComposicao) {
        this.idComposicao = idComposicao;
    }

    @Override
    public String toString() {
        return "Locomotiva | ID = " + id + " | Carga máxima = " + pesoMax + " | Quantidade máxima de vagões = "
                + maxVagoes + ", ID Composição = "
                + idComposicao;
    }

    public String toStringSemComposicao() {
        return "Locomotiva | ID = " + id + " | Carga máxima = " + pesoMax + " | Quantidade máxima de vagões = "
                + maxVagoes;
    }
}
