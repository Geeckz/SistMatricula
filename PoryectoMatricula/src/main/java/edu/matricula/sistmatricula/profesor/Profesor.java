package edu.matricula.sistmatricula.profesor;

public class Profesor {

    int dni_pro;
    String nom_pro;
    String ape_pro;
    String telf_pro;
    String dir_pro;
    String fech_ingr_pro;
    String est_pro;
    String correo_pro;
    int cod_dis;

    public Profesor(int dni_pro, String nom_pro, String ape_pro, String telf_pro, String dir_pro, String fech_ingr_pro, String est_pro, String correo_pro, int cod_dis) {
        this.dni_pro = dni_pro;
        this.nom_pro = nom_pro;
        this.ape_pro = ape_pro;
        this.telf_pro = telf_pro;
        this.dir_pro = dir_pro;
        this.fech_ingr_pro = fech_ingr_pro;
        this.est_pro = est_pro;
        this.correo_pro = correo_pro;
        this.cod_dis = cod_dis;
    }

    public int getDni_pro() {
        return dni_pro;
    }

    //public void setDni_pro(int dni_pro) {
    //    this.dni_pro = dni_pro;
    //}

    public String getNom_pro() {
        return nom_pro;
    }

    public void setNom_pro(String nom_pro) {
        this.nom_pro = nom_pro;
    }

    public String getApe_pro() {
        return ape_pro;
    }

    public void setApe_pro(String ape_pro) {
        this.ape_pro = ape_pro;
    }

    public String getTelf_pro() {
        return telf_pro;
    }

    public void setTelf_pro(String telf_pro) {
        this.telf_pro = telf_pro;
    }

    public String getDir_pro() {
        return dir_pro;
    }

    public void setDir_pro(String dir_pro) {
        this.dir_pro = dir_pro;
    }

    public String getFech_ingr_pro() {
        return fech_ingr_pro;
    }

    public void setFech_ingr_pro(String fech_ingr_pro) {
        this.fech_ingr_pro = fech_ingr_pro;
    }

    public String getEst_pro() {
        return est_pro;
    }

    public void setEst_pro(String est_pro) {
        this.est_pro = est_pro;
    }

    public String getCorreo_pro() {
        return correo_pro;
    }

    public void setCorreo_pro(String correo_pro) {
        this.correo_pro = correo_pro;
    }

    public int getCod_dis() {
        return cod_dis;
    }

    public void setCod_dis(int cod_dis) {
        this.cod_dis = cod_dis;
    }
}
