package model;

public class PatoBorracha extends Pato{

    public PatoBorracha(){
        super.quack = new QuackComAssobio();
        super.voo = new VoarNaoAplicavel();
    }
    
    @Override
    public void display() {
        System.out.println("Este é um pato de borracha!");
    }
    
}