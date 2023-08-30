package org.java.escola.mano;

public class Alunos implements Comparable<Alunos> {
    private String nome;
    private double[] notas;
    private int matricula;

    
    public Alunos(String nome, double[] notas, int matricula) {
        this.nome = nome;
        this.notas = notas;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Aluno: " + getNome() + ", Notas: " + java.util.Arrays.toString(getNotas()) + ", Matrícula: " + getMatricula();
    }

    @Override
    public int compareTo(Alunos outroAluno) {
        return Integer.compare(this.matricula, outroAluno.matricula);
    }
}