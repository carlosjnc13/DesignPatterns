package Imposto;

import orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraImpostos {

    public BigDecimal calcular(Orcamento orcamento, TipoImposto tipoImposto){

        return tipoImposto.calcular(orcamento);
    }

}
