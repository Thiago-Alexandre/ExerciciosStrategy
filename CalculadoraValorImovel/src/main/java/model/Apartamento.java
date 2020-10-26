package model;

public class Apartamento extends Imovel{
    
    public Apartamento(int comodos, float espaco, char localizacao) {
        super(comodos, espaco, localizacao);
        super.valor = new DefinirValorComEdificacao();
    }
    
    public float getValor(){
        return valor.definirValor(this);
    }

    @Override
    public String toString() {
        return "Este Apartamento apresenta " + espaco + " metros quadrados, " + comodos + " comodos e está localizado na região " + localizacao + "." +
                "\n" + "Assim, seu valor venal é equivalente a " + this.getValor() + " reais!";
        
    }
    
}