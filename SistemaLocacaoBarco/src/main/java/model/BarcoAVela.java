package model;

public class BarcoAVela extends Barco{
    
    public BarcoAVela(){
        super.navegacao = new NavegarComVela();
    }
    
    @Override
    public String toString() {
        return "Este é um barco do tipo à vela!";
    }
}