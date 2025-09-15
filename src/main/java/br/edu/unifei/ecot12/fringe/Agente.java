package br.edu.unifei.ecot12.fringe;

public class Agente extends Pessoa {
    private String capacidade;
    public Agente(Universo universo) {
        super(universo);
    }
    public String getCapacidade() {
        return capacidade;
    }
    public void setCapacidade(String capacidade) {
        this.capacidade = capacidade;
    }
}
