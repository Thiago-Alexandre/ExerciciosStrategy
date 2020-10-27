package main;

import java.util.ArrayList;
import java.util.List;
import model.Barco;
import model.BarcoAVela;
import model.BarcoBateira;
import model.BarcoCanoa;
import model.BarcoIate;
import model.BarcoJangada;

public class Main {
    
    public static void main(String[] args){
        System.out.println("Iniciando o Sistema de Locação de Barcos...");
        System.out.println("Carregando Barcos...");
        List<Barco> barcos = new ArrayList();
        barcos.add(new BarcoIate());
        barcos.add(new BarcoCanoa());
        barcos.add(new BarcoAVela());
        barcos.add(new BarcoJangada());
        barcos.add(new BarcoBateira());
        System.out.println("Mostrando os Barcos...");
        for(Barco b : barcos){
            System.out.println("-----------------------");
            System.out.println(b);
            b.navegar();
        }
        System.out.println("-----------------------");
        System.out.println("Finalizando o Sistema de Locação de Barcos...");
    }
    
}