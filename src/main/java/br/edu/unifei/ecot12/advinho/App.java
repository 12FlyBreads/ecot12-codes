package br.edu.unifei.ecot12.advinho;

public class App {
    public static void main(String args[]){
        Oraculo o1 = Oraculo.getInstancia();
        System.out.println(o1);
        Oraculo o2 = Oraculo.getInstancia();
        System.out.println(o2);
        System.out.println(o1==o2);
    }
}
