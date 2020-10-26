package main;

import java.util.ArrayList;
import java.util.List;
import model.Apartamento;
import model.Casa;
import model.Imovel;
import model.Terreno;

public class Main {
    
    public static void main(String[] args){
        System.out.println("Iniciando a Calculadora de Valor Venal de Imóveis...");
        System.out.println("Carregando Imóveis...");
        List<Imovel> imoveis = new ArrayList();
        imoveis.add(new Apartamento(5,60f,'A'));
        imoveis.add(new Apartamento(5,60f,'B'));
        imoveis.add(new Apartamento(5,60f,'C'));
        imoveis.add(new Casa(6,200f,'A'));
        imoveis.add(new Casa(6,200f,'B'));
        imoveis.add(new Casa(6,200f,'C'));
        imoveis.add(new Terreno(0,1000f,'A'));
        imoveis.add(new Terreno(0,1000f,'B'));
        imoveis.add(new Terreno(0,1000f,'C'));
        System.out.println("Mostrando os imóveis e seu valor venal...");
        for(Imovel i : imoveis){
            System.out.println("-----------------------");
            System.out.println(i);
        }
        System.out.println("-----------------------");
        System.out.println("Finalizando a Calculadora de Valor Venal de Imóveis...");
    }
}