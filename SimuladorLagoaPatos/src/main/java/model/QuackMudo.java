package model;

public class QuackMudo implements ComportamentoQuack{

    @Override
    public void quack() {
        System.out.println("Este pato não pode emitir som!");
    }
    
}