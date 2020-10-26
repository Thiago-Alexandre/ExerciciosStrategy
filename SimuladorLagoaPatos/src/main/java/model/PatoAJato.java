package model;

public class PatoAJato extends Pato{
    
    public PatoAJato(){
     super.quack = new QuackNormal();
     super.voo = new VoarComMochilaJato();
    }

    @Override
    public void display() {
        System.out.println("Este é um pato normal, mas com uma mochila a jato!");
    }
}