package model;

public class PatoPelucia extends Pato{
    
    public PatoPelucia(){
        super.quack = new QuackMudo();
        super.voo = new VoarNaoAplicavel();
    }

    @Override
    public void display() {
        System.out.println("Este é um pato de pelúcia!");
    }
}