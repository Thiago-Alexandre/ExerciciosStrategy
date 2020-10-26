package model;

public class Terreno extends Imovel{
    
    public Terreno(int comodos, float espaco, char localizacao) {
        super(comodos, espaco, localizacao);
        super.valor = new DefinirValorSemEdificacao();
    }
    
    public float getValor(){
        return valor.definirValor(this);
    }

    @Override
    public String toString() {
        return "Este Terreno apresenta " + espaco + " metros quadrados e está localizado na região " + localizacao + "." +
                "\n" + "Assim, seu valor venal é equivalente a " + this.getValor() + " reais!";
        
    }
}