package model;

public abstract class Barco {
    
    ComportamentoNavegar navegacao;
    
    public void navegar(){
        navegacao.navegar();
    }
}