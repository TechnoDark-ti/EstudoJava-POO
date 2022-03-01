package com.darkcells.projetoyoutube_final;
public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;
    protected float experiência;

    public Pessoa(String nome, int idade, String sexo, float experiência) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiência = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getExperiência() {
        return experiência;
    }

    public void setExperiência(float experiência) {
        this.experiência = experiência;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", experi\u00eancia=" + experiência + '}';
    }
}
