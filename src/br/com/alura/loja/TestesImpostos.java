package br.com.alura.loja;

import br.com.alura.loja.desconto.CalculadoraDeDescontos;
import br.com.alura.loja.imposto.CalculadoraDeImpostos;
import br.com.alura.loja.imposto.ICMS;
import br.com.alura.loja.imposto.ISS;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {

    public static void main(String[] args) {
        Orcamento orcamentoImposto = new Orcamento(new BigDecimal("100"), 1);
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();

        System.out.println(calculadoraDeImpostos.calcular(orcamentoImposto, new ICMS()));
        System.out.println(calculadoraDeImpostos.calcular(orcamentoImposto, new ISS()));

        Orcamento orcamentoDesconto = new Orcamento(new BigDecimal("200"), 6);
        Orcamento orcamentoDesconto2 = new Orcamento(new BigDecimal("1000"), 1);
        CalculadoraDeDescontos calculadoraDeDescontos = new CalculadoraDeDescontos();
        System.out.println(calculadoraDeDescontos.calcular(orcamentoDesconto));
        System.out.println(calculadoraDeDescontos.calcular(orcamentoDesconto2));
    }
}
