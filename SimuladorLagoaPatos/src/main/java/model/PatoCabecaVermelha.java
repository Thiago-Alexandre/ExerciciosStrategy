package model;

public class PatoCabecaVermelha extends Pato{

    public PatoCabecaVermelha(){
        super.quack = new QuackNormal();
        super.voo = new VoarComAsas();
    }
    
    @Override
    public void display() {
        System.out.println("Este é um pato da espécie Cabeça Vermelha!");
    }
    
}