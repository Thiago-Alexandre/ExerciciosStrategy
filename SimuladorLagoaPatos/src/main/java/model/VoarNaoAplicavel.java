package model;

public class VoarNaoAplicavel implements ComportamentoVoar{

    @Override
    public void voar() {
        System.out.println("Este pato não pode voar!");
    }
    
}