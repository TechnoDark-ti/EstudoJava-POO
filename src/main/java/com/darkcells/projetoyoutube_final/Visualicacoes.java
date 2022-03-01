package com.darkcells.projetoyoutube_final;
public class Visualicacoes {
    private Aluno espectador;
    private Video filme;

    public Visualicacoes(Aluno espectador, Video filme){
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setInAssistido(this.espectador.getInAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
        
    }
    public void avaliar(){
        this.filme.setAvaliacao(5);
    }
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }
    public void avaliar (float porc){
        int total = 0;
        if(porc <= 20){
            total = 3;
        }else if(porc <= 50){
            total = 5;
        }else if(porc <= 90){
            total = 10;
        }
    }
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
