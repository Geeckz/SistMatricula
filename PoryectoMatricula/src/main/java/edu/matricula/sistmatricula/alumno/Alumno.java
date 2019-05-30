package edu.matricula.sistmatricula.alumno;

public class Alumno {

    int cod_alu;
    String nom_alu;
    String ape_alu;
    String dir_alu;
    String telf_alu;
    String fec_nac_alum;
    String est_alu;
    String correo_alu;
    String cod_ds;
    String fech_matri_alu;

    public Alumno(int cod_alu, String nom_alu, String ape_alu, String dir_alu, String telf_alu, String fec_nac_alum, String est_alu, String correo_alu, String cod_ds, String fech_matri_alu) {
        this.cod_alu = cod_alu;
        this.nom_alu = nom_alu;
        this.ape_alu = ape_alu;
        this.dir_alu = dir_alu;
        this.telf_alu = telf_alu;
        this.fec_nac_alum = fec_nac_alum;
        this.est_alu = est_alu;
        this.correo_alu = correo_alu;
        this.cod_ds = cod_ds;
        this.fech_matri_alu = fech_matri_alu;
    }

    public int getCod_alu() {
        return cod_alu;
    }

    //public void setCod_alu(int cod_alu) {
    //    this.cod_alu = cod_alu;
    //}

    public String getNom_alu() {
        return nom_alu;
    }

    public void setNom_alu(String nom_alu) {
        this.nom_alu = nom_alu;
    }

    public String getApe_alu() {
        return ape_alu;
    }

    public void setApe_alu(String ape_alu) {
        this.ape_alu = ape_alu;
    }

    public String getDir_alu() {
        return dir_alu;
    }

    public void setDir_alu(String dir_alu) {
        this.dir_alu = dir_alu;
    }

    public String getTelf_alu() {
        return telf_alu;
    }

    public void setTelf_alu(String telf_alu) {
        this.telf_alu = telf_alu;
    }

    public String getFec_nac_alum() {
        return fec_nac_alum;
    }

    public void setFec_nac_alum(String fec_nac_alum) {
        this.fec_nac_alum = fec_nac_alum;
    }

    public String getEst_alu() {
        return est_alu;
    }

    public void setEst_alu(String est_alu) {
        this.est_alu = est_alu;
    }

    public String getCorreo_alu() {
        return correo_alu;
    }

    public void setCorreo_alu(String correo_alu) {
        this.correo_alu = correo_alu;
    }

    public String getCod_ds() {
        return cod_ds;
    }

    public void setCod_ds(String cod_ds) {
        this.cod_ds = cod_ds;
    }

    public String getFech_matri_alu() {
        return fech_matri_alu;
    }

    public void setFech_matri_alu(String fech_matri_alu) {
        this.fech_matri_alu = fech_matri_alu;
    }
}

