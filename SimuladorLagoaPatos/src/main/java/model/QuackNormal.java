package model;

public class QuackNormal implements ComportamentoQuack{

    @Override
    public void quack() {
        System.out.println("Este pato emite um quack normal!");
    }
    
}