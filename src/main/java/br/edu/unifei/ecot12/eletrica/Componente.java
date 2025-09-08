package br.edu.unifei.ecot12.eletrica;

public class Componente extends Elemento{
    private TipoEnum tipo;
    @Override
    public int totalElementos(){
        return 1;
    }
    public TipoEnum getTipo() {
        return tipo;
    }
    public void setTipo(TipoEnum tipo) {
        this.tipo = tipo;
    }
}
