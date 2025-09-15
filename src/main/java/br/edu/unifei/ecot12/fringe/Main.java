package br.edu.unifei.ecot12.fringe;

public class Main {
    public static void main(String[] args) {
        Real r = new Real();
        Agente a = new Agente(r);
        a.setNome("olivia");
        a.setIdade(26);
        Cientista c = new Cientista(new Alternativo());
        c.setNome("peter");
        c.setIdade(26);
        System.out.println(c.incapacita());
    }
}