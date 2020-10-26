package model;

public abstract class Imovel {
    
    int comodos;
    float espaco;
    char localizacao;
    ComportamentoDefinirValor valor;
    
    public Imovel(int comodos, float espaco, char localizacao){
        this.comodos = comodos;
        this.espaco = espaco;
        this.localizacao = localizacao;
    }
    
}