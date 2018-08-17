package com.company;

public class Persoon {
    private String voornaam;
    private String achternaam;
    public String getVoornaam(){
        return voornaam;
    }
    public void getVoornaam(String voornaam){
        this.voornaam=voornaam;
    }
    public void setVoornaam(String voornaam){
        this.voornaam=voornaam;
    }
    public String getAchternaam(){
        return achternaam;
    }
    public void getAchternaam(String achternaam){
        this.achternaam=achternaam;
    }
    public void setAchternaam(String achternaam){
        this.achternaam=achternaam;
    }
    public String getVolledigeNaam(){
        return String.format("%s %s", this.voornaam, this.achternaam);
    }
}
