package br.edu.unifei.ecot12.naruto;

import java.util.ArrayList;
import java.util.List;

public class Ser {
    private String nome;
    private String apelido;
    private int chackra;
    private EntidadePolitica governa;
    private List<Jutsu> jutsus =
        new ArrayList<Jutsu>();
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getApelido() {
        return apelido;
    }
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
    public int getChackra() {
        return chackra;
    }
    public void setChackra(int chackra) {
        this.chackra = chackra;
    }
    public EntidadePolitica getGoverna() {
        return governa;
    }
    public void setGoverna(EntidadePolitica governa) {
        this.governa = governa;
    }
    public List<Jutsu> getJutsus() {
        return jutsus;
    }
    public void setJutsus(List<Jutsu> jutsus) {
        this.jutsus = jutsus;
    }
}
