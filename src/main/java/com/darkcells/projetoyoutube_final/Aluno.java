package com.darkcells.projetoyoutube_final;
public class Aluno extends Pessoa{
    private String login;
    private int inAssistido;

    public Aluno(String nome, int idade, String sexo, float experiência, String Login, int inAssistido) {
        super(nome, idade, sexo, experiência);
        this.login = login;
        this.inAssistido = inAssistido;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getInAssistido() {
        return inAssistido;
    }

    public void setInAssistido(int inAssistido) {
        this.inAssistido = inAssistido;
    }

    @Override
    public String toString() {
        return "Aluno{" + "login=" + login + super.toString() + ", inAssistido=" + inAssistido + '}';
    }
}
