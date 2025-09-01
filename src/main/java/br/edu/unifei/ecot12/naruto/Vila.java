package br.edu.unifei.ecot12.naruto;

import java.util.ArrayList;
import java.util.List;

public class Vila extends EntidadePolitica{
    private String localizacao;
    private String bandana;
    private List<Cla> clas =
        new ArrayList<Cla>();
    private List<Ser> seres =
        new ArrayList<Ser>();
    public String getLocalizacao() {
        return localizacao;
    }
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    public String getBandana() {
        return bandana;
    }
    public void setBandana(String bandana) {
        this.bandana = bandana;
    }
    public List<Cla> getClas() {
        return clas;
    }
    public void setClas(List<Cla> clas) {
        this.clas = clas;
    }
    public List<Ser> getSeres() {
        return seres;
    }
    public void setSeres(List<Ser> seres) {
        this.seres = seres;
    }
}
