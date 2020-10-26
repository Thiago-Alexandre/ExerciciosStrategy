package model;

public class Casa extends Imovel{
    
    public Casa(int comodos, float espaco, char localizacao) {
        super(comodos, espaco, localizacao);
        super.valor = new DefinirValorComEdificacao();
    }
    
    public float getValor(){
        return valor.definirValor(this);
    }

    @Override
    public String toString() {
        return "Esta Casa apresenta " + espaco + " metros quadrados de terreno, " + comodos + " comodos e está localizado na região " + localizacao + "." +
                "\n" + "Assim, seu valor venal é equivalente a " + this.getValor() + " reais!";
        
    }
}