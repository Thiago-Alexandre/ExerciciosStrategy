package model;

public class DefinirValorComEdificacao implements ComportamentoDefinirValor{

    @Override
    public float definirValor(Imovel imovel) {
        float valor = 0f;
        switch (imovel.localizacao){
            case('A'):
                valor = 3000 * imovel.espaco;
                break;
            case('B'):
                valor = 1000 * imovel.espaco;
                break;
            case('C'):
                valor = 500 * imovel.espaco;
                break;
            default:
                return valor;
        }
        valor += 1000 * imovel.comodos;
        return valor;
    }
    
}