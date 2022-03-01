package com.darkcells.projetoyoutube_final;
public class Visualicacoes {
    private Aluno espectador;
    private Video filme;

    public Aluno getEspectador() {
        return espectador;
    }

    public void setEspectador(Aluno espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualicacoes{" + "espectador=" + espectador + ", filme=" + filme + '}';
    }    
}
