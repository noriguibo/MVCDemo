package br.fatecrl.MVCDemo.models;

public class Aluno {
    private String matricula, nome;
    private float p1, p2, media;

    public Aluno(String matricula, String nome, float p1, float p2) {
        this.matricula = matricula;
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
        this.media = (p1+p2)/2;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getP1() {
        return p1;
    }

    public void setP1(float p1) {
        this.p1 = p1;
    }

    public float getP2() {
        return p2;
    }

    public void setP2(float p2) {
        this.p2 = p2;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }
}
