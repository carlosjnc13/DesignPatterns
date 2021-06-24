package Imposto;

import orcamento.Orcamento;

import java.math.BigDecimal;

public class Iss implements TipoImposto{

    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.06"));
    }
}
