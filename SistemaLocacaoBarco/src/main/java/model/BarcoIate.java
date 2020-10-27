package model;

public class BarcoIate extends Barco{
    
    public BarcoIate(){
        super.navegacao = new NavegarComMotor();
    }
    
    @Override
    public String toString() {
        return "Este é um barco do tipo Iate!";
    }
}