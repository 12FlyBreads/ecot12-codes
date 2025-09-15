package br.edu.unifei.ecot12.advinho;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Oraculo {
    private Calendar fimMundo = new GregorianCalendar(2012, 12, 12);
    private boolean hojeChove = false;
    // 1 - private constructor
    private Oraculo(){}
    // 2 - static reflexive attribute
    private static Oraculo instancia = new Oraculo();
    // 3 - static metod for the instance
    public static Oraculo getInstancia(){
        return instancia;
    }
    public Calendar getFimMundo() {
        return fimMundo;
    }
    public void setFimMundo(Calendar fimMundo) {
        this.fimMundo = fimMundo;
    }
    public boolean isHojeChove() {
        return hojeChove;
    }
    public void setHojeChove(boolean hojeChove) {
        this.hojeChove = hojeChove;
    }
    public static void setInstancia(Oraculo instancia) {
        Oraculo.instancia = instancia;
    }
}
