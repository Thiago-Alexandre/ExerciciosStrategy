package model;

public class BarcoBateira extends Barco{
    
    public BarcoBateira(){
        super.navegacao = new NavegarComMotor();
    }
    
    @Override
    public String toString() {
        return "Este é um barco do tipo Bateira!";
    }
}