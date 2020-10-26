package main;

import java.util.ArrayList;
import java.util.List;
import model.Pato;
import model.PatoAJato;
import model.PatoBorracha;
import model.PatoCabecaVermelha;
import model.PatoMallard;
import model.PatoPelucia;

public class Main {
    
    public static void main(String[] args){
        System.out.println("Iniciando Simulador de Lagoa de Patos...");
        System.out.println("Carregando Patos...");
        List<Pato> patos = new ArrayList();
        patos.add(new PatoAJato());
        patos.add(new PatoBorracha());
        patos.add(new PatoCabecaVermelha());
        patos.add(new PatoMallard());
        patos.add(new PatoPelucia());
        System.out.println("Mostrando os patos na lagoa...");
        for(Pato p : patos){
            System.out.println("-----------------------");
            p.display();
            p.nadar();
            p.quack();
            p.voar();
        }
        System.out.println("-----------------------");
        System.out.println("Finalizando o Simulador de Lagoa de Patos...");
    }
    
}