package edu.matricula.sistmatricula.nota;

public class Nota {

    int cod_eval;
    int pract1_not;
    int pract2_not;
    int pract3_not;
    int exam_p_not;
    int exam_f_not;
    int cod_cur;
    int dni_pro;
    int cod_alu;
    int nota_tar_promedio;

    public Nota(int cod_eval, int pract1_not, int pract2_not, int pract3_not, int exam_p_not, int exam_f_not, int cod_cur, int dni_pro, int cod_alu, int nota_tar_promedio) {
        this.cod_eval = cod_eval;
        this.pract1_not = pract1_not;
        this.pract2_not = pract2_not;
        this.pract3_not = pract3_not;
        this.exam_p_not = exam_p_not;
        this.exam_f_not = exam_f_not;
        this.cod_cur = cod_cur;
        this.dni_pro = dni_pro;
        this.cod_alu = cod_alu;
        this.nota_tar_promedio = nota_tar_promedio;
    }

    public int getCod_eval() {
        return cod_eval;
    }

    //public void setCod_eval(int cod_eval) {
    //    this.cod_eval = cod_eval;
    //}

    public int getPract1_not() {
        return pract1_not;
    }

    public void setPract1_not(int pract1_not) {
        this.pract1_not = pract1_not;
    }

    public int getPract2_not() {
        return pract2_not;
    }

    public void setPract2_not(int pract2_not) {
        this.pract2_not = pract2_not;
    }

    public int getPract3_not() {
        return pract3_not;
    }

    public void setPract3_not(int pract3_not) {
        this.pract3_not = pract3_not;
    }

    public int getExam_p_not() {
        return exam_p_not;
    }

    public void setExam_p_not(int exam_p_not) {
        this.exam_p_not = exam_p_not;
    }

    public int getExam_f_not() {
        return exam_f_not;
    }

    public void setExam_f_not(int exam_f_not) {
        this.exam_f_not = exam_f_not;
    }

    public int getCod_cur() {
        return cod_cur;
    }

    public void setCod_cur(int cod_cur) {
        this.cod_cur = cod_cur;
    }

    public int getDni_pro() {
        return dni_pro;
    }

    public void setDni_pro(int dni_pro) {
        this.dni_pro = dni_pro;
    }

    public int getCod_alu() {
        return cod_alu;
    }

    public void setCod_alu(int cod_alu) {
        this.cod_alu = cod_alu;
    }

    public int getNota_tar_promedio() {
        return nota_tar_promedio;
    }

    public void setNota_tar_promedio(int nota_tar_promedio) {
        this.nota_tar_promedio = nota_tar_promedio;
    }
}
