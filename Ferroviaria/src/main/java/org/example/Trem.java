package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Trem {

    private int id;
    private int capacidadeDeVagoes;
    private List<Locomotiva> listaLocomotivas = new ArrayList<>();
    private List<Vagao> listaVagoes = new ArrayList<>();

    protected Trem(int id) {
        this.id = id;
    }

    protected void addLocomotiva(Locomotiva locomotiva){
        listaLocomotivas.add(locomotiva);
        capacidadeDeVagoes = getCapacidadeDeVagoes();
    }

    public int getCapacidadeDeVagoes() {
        if (listaLocomotivas.size() == 1){
            return listaLocomotivas.get(0).getLimiteVagoes();
        } else {
            int capacidade = 0;
            for (Locomotiva l : listaLocomotivas){
                capacidade += l.getLimiteVagoes();
            }
            return capacidadeDeVagoes - 10;
        }
    }

    public void setCapacidadeDeVagoes(int capacidadeDeVagoes) {
        this.capacidadeDeVagoes = capacidadeDeVagoes;
    }

    protected void addVagao(Vagao vagao) throws ArrayIndexOutOfBoundsException {
        if (listaVagoes.size() < capacidadeDeVagoes){
            listaVagoes.add(vagao);
        } else {
            throw new ArrayIndexOutOfBoundsException("O limite de vagoes deste trem ja foi atingido");
        }
    }

    protected int getId() {
        return id;
    }

    protected List<Locomotiva> getListaLocomotivas() {
        return listaLocomotivas;
    }

    protected List<Vagao> getListaVagoes() {
        return listaVagoes;
    }

    @Override
    public String toString() {
        return "[ID: T" + id + " Locomotivas: " + listaLocomotivas + " Vagoes:" + listaVagoes + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trem trem = (Trem) o;
        return id == trem.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
