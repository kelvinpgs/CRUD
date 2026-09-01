package com.example.CRUD.domain.classes;

import com.example.CRUD.domain.exceptions.NotFound;

public class Carro {

    private String roda;
    private String vidro;
    private String pneu;
    private String farol;


    @Override
    public String toString() {
        return "Carro{" +
                "farol='" + this.getFarol() + '\'' +
                ", roda='" + this.getRoda() + '\'' +
                ", vidro='" + this.getVidro() + '\'' +
                ", pneu='" + this.getPneu() + '\'' +
                '}';
    }

    public Carro(String vidro, String roda, String pneu, String farol) {
        this.setVidro(vidro);
        this.setRoda(roda);
        this.setPneu(pneu);
        this.setFarol(farol);
    }

    public Carro() {
    }

    public String getFarol() {
        return this.farol;
    }

    public void setFarol(String farol) {
        this.farol = farol;
    }

    public String getPneu() {
        return this.pneu;
    }

    public void setPneu(String pneu) {
        this.pneu = pneu;
    }

    public String getRoda() {
        if (this.roda == null) {
            return "sem roda";
        } else {
            return this.roda;
        }
    }

    public void setRoda(String roda) {
        String rodaum = "Liga leve 17";
        String rodadois = "Aço";
        if (roda.equals(rodaum) || roda.equals(rodadois)){
            this.roda = roda;
        }
        throw new NotFound("Você não pode passar esse " + roda + " como parâmetro! Somente " + rodaum + " ou " + rodadois);
    }

    public String getVidro() {
        return this.vidro;
    }

    public void setVidro(String vidro) {
        this.vidro = vidro;
    }
}
