package com.letscode.utils;

public class Time {
    String mandante = "";
    String visitante = "";
    String golsMandante = "";
    String golsVisitante = "";
    String data = "";
    int vitorias = 0;
    int empates = 0;
    int derrotas = 0;
    int pontos = 0;

    public Time(String mandante, String visitante, String golsMandante, String golsVisitante, String data) {
        this.mandante = mandante;
        this.visitante = visitante;
        this.golsMandante = golsMandante;
        this.golsVisitante = golsVisitante;
        this.data = data;
    }

    public String getMandante() {
        return mandante;
    }

    public void setMandante(String mandante) {
        this.mandante = mandante;
    }

    public String getVisitante() {
        return visitante;
    }

    public void setVisitante(String visitante) {
        this.visitante = visitante;
    }

    public String getGolsMandante() {
        return golsMandante;
    }

    public void setGolsMandante(String golsMandante) {
        this.golsMandante = golsMandante;
    }

    public String getGolsVisitante() {
        return golsVisitante;
    }

    public void setGolsVisitante(String golsVisitante) {
        this.golsVisitante = golsVisitante;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }


}
