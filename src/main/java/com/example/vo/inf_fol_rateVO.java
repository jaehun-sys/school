package com.example.vo;

public class inf_fol_rateVO{
    private long inf_pk;
    private float rate_sex_f;
    private float rate_sex_m;
    private float rate_susp;
    private float rate_real;
    private float rate_mass;
    private float rate_inf;
    private float real_fol_count;
    private float real_fol_rate;

    public String toString() {
        return "inf_fol_rateVO [inf_pk=" + inf_pk + ", rate_sex_f=" + rate_sex_f + ", rate_sex_m=" + rate_sex_m +
               ", rate_susp=" + rate_susp + ", rate_real=" + rate_real + ", rate_mass=" + rate_mass + ", rate_inf=" + 
               rate_inf + ", real_fol_count= " + real_fol_count + ", real_fol_rate= " + real_fol_rate + "]";
    }
    public long getInfPk(){
        return inf_pk;
    }
    public float getRateSexF(){
        return rate_sex_f;
    }
    public String getRateSexM(){
        return rate_sex_m;
    }
    public String getRateSusp(){
        return rate_susp;
    }
    public String getRateReal(){
        return rate_real;
    }
    public String getRateMass(){
        return rate_mass;
    }
    public String getRateInf(){
        return rate_inf;
    }
    public String getRealFolCount(){
        return real_fol_count;
    }
    public String getRealFolRate(){
        return real_fol_rate;
    }

    public void getInfPk(long inf_pk){
        this.inf_pk = inf_pk;
    }
    public void getRateSexF(float rate_sex_f ){
        this.rate_sex_f = rate_sex_f;
    }
    public void getRateSexM(float rate_sex_m){
        this.rate_sex_m = rate_sex_m;
    }
    public void getRateSusp(float rate_susp){
        this.rate_susp = rate_susp;
    }
    public void getRateReal(float rorate_realle){
        this.rate_real = rate_real;
    }
    public void getRateMass(float rate_mass){
        this.rate_mass = rate_mass;
    }
    public void getRateInf(float rate_inf){
        this.rate_inf = rate_inf;
    }
    public void getRealFolCount(float real_fol_count){
        this.real_fol_count = real_fol_count;
    }
    public void getRealFolRate(float real_fol_rate){
        this.real_fol_rate = real_fol_rate;
    }

}