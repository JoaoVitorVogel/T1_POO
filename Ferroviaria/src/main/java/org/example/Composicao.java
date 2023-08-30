package org.example;

public class Composicao {
    private int idComposicao;
    private int listaLocomotivas;
    private int listaVagoes;

    public Composicao(int idComposicao, int listaLocomotivas, int listaVagoes) {
        this.idComposicao = idComposicao;
        this.listaLocomotivas = listaLocomotivas;
        this.listaVagoes = listaVagoes;
    }
    
    public int getIdComposicao() {
        return idComposicao;
    }
    public void setIdComposicao(int idComposicao) {
        this.idComposicao = idComposicao;
    }
    public int getListaLocomotivas() {
        return listaLocomotivas;
    }
    public void setListaLocomotivas(int listaLocomotivas) {
        this.listaLocomotivas = listaLocomotivas;
    }
    public int getListaVagoes() {
        return listaVagoes;
    }
    public void setListaVagoes(int listaVagoes) {
        this.listaVagoes = listaVagoes;
    }

    @Override
    public String toString() {
        return "Composicao [idComposicao=" + idComposicao + ", listaLocomotivas=" + listaLocomotivas + ", listaVagoes="
                + listaVagoes + "]";
    }
}
