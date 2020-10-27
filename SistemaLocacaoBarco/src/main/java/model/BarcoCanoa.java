package model;

public class BarcoCanoa extends Barco{
    
    public BarcoCanoa(){
        super.navegacao = new NavegarComRemo();
    }
    
    @Override
    public String toString() {
        return "Este é um barco do tipo Canoa!";
    }
}