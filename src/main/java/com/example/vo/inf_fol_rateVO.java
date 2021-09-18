package com.example.vo;

public class inf_fol_rateVO{
    private long inf_pk;
    private String rate_sex_f;
    private String rate_sex_m;
    private String rate_susp;
    private String rate_real;
    private String rate_mass;
    private String rate_inf;
    private String real_fol_count;
    private String real_fol_rate;

    public String toString() {
        return "inf_fol_rateVO [inf_pk=" + inf_pk + ", rate_sex_f=" + rate_sex_f + ", rate_sex_m=" + rate_sex_m +
               ", rate_susp=" + rate_susp + ", rate_real=" + rate_real + ", rate_mass=" + rate_mass + ", rate_inf=" + 
               rate_inf + ", real_fol_count= " + real_fol_count + ", real_fol_rate= " + real_fol_rate + "]";
    }
    public long getInfPk(){
        return inf_pk;
    }
    public String getRateSexF(){
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

    public void setInfPk(long inf_pk){
        this.inf_pk = inf_pk;
    }
    public void setRateSexF(String rate_sex_f ){
        this.rate_sex_f = rate_sex_f;
    }
    public void setRateSexM(String rate_sex_m){
        this.rate_sex_m = rate_sex_m;
    }
    public void setRateSusp(String rate_susp){
        this.rate_susp = rate_susp;
    }
    public void setRateReal(String rate_real){
        this.rate_real = rate_real;
    }
    public void setRateMass(String rate_mass){
        this.rate_mass = rate_mass;
    }
    public void setRateInf(String rate_inf){
        this.rate_inf = rate_inf;
    }
    public void setRealFolCount(String real_fol_count){
        this.real_fol_count = real_fol_count;
    }
    public void setRealFolRate(String real_fol_rate){
        this.real_fol_rate = real_fol_rate;
    }

}