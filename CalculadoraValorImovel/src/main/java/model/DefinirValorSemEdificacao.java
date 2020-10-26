package model;

public class DefinirValorSemEdificacao implements ComportamentoDefinirValor{

    @Override
    public float definirValor(Imovel imovel) {
        float valor = 0f;
        switch (imovel.localizacao){
            case('A'):
                valor = 1500 * imovel.espaco;
                break;
            case('B'):
                valor = 750 * imovel.espaco;
                break;
            case('C'):
                valor = 200 * imovel.espaco;
                break;
            default:
                return valor;
        }
        return valor;
    }
    
}