package org.example;

import java.util.Arrays;

public class Composicao {
    private int idComposicao;
    private Locomotiva[] listaLocomotivas;
    private Vagao[] listaVagoes;

    public Composicao(int idComposicao, Locomotiva[] listaLocomotivas, Vagao[] listaVagoes) {
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
    public Locomotiva[] getListaLocomotivas() {
        return listaLocomotivas;
    }
    public void setListaLocomotivas(Locomotiva[] listaLocomotivas) {
        this.listaLocomotivas = listaLocomotivas;
    }
    public Vagao[] getListaVagoes() {
        return listaVagoes;
    }
    public void setListaVagoes(Vagao[] listaVagoes) {
        this.listaVagoes = listaVagoes;
    }

    @Override
    public String toString() {
        return "Composicao [idComposicao=" + idComposicao + ", listaLocomotivas=" + Arrays.toString(listaLocomotivas)
                + ", listaVagoes=" + Arrays.toString(listaVagoes) + "]";
    }

}
