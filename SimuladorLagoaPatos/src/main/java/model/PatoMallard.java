package model;

public class PatoMallard extends Pato{

    public PatoMallard(){
        super.quack = new QuackNormal();
        super.voo = new VoarComAsas();
    }
    
    @Override
    public void display() {
        System.out.println("Este é um pato da espécie Mallard!");
    }
    
}