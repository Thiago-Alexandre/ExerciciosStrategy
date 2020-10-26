package model;

public abstract class Pato{
    
    ComportamentoQuack quack;
    ComportamentoVoar voo;
    
    public void nadar(){
        System.out.println("Este pato está nadando!");
    }
    
    public void quack(){
        quack.quack();
    }
    
    public void voar(){
        voo.voar();
    }
    
    public abstract void display();
    
}