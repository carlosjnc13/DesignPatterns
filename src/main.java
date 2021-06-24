import Imposto.CalculadoraImpostos;
import Imposto.Icms;
import Imposto.Iss;
import orcamento.Orcamento;

import java.math.BigDecimal;

public class main {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        CalculadoraImpostos calculadoraImpostos = new CalculadoraImpostos();
        System.out.println(calculadoraImpostos.calcular(orcamento, new Icms()));

    }
}
