package edu.matricula.sistmatricula.curso;

public class Curso {

    int cod_curso;
    String nom_cur;
    int horas_cur;

    public Curso(int cod_curso, String nom_cur, int horas_cur) {
        this.cod_curso = cod_curso;
        this.nom_cur = nom_cur;
        this.horas_cur = horas_cur;
    }

    public int getCod_curso() {
        return cod_curso;
    }

    //public void setCod_curso(int cod_curso) {
    //   this.cod_curso = cod_curso;
    //}

    public String getNom_cur() {
        return nom_cur;
    }

    public void setNom_cur(String nom_cur) {
        this.nom_cur = nom_cur;
    }

    public int getHoras_cur() {
        return horas_cur;
    }

    public void setHoras_cur(int horas_cur) {
        this.horas_cur = horas_cur;
    }
}
