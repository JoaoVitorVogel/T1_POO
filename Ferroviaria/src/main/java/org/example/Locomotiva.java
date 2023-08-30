package org.example;

public class Locomotiva {
    int id;
    double pesoMax;
    int maxVagoes;
    int idComposicao;
    
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
}
