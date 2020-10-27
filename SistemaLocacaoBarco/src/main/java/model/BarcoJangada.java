package model;

public class BarcoJangada extends Barco{
    
    public BarcoJangada(){
        super.navegacao = new NavegarComRemo();
    }
    
    @Override
    public String toString() {
        return "Este é um barco do tipo Jangada!";
    }
}