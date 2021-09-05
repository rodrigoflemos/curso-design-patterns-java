package br.com.alura.loja;

import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.GeraPedidoHandler;
import br.com.alura.loja.pedido.acoes.EnviarEmailPedido;
import br.com.alura.loja.pedido.acoes.LogDePedido;
import br.com.alura.loja.pedido.acoes.SalvarPedidoNoBancoDeDados;

import java.math.BigDecimal;
import java.util.Arrays;

public class TestesPedido {

    public static void main(String[] args) {
       String cliente = "Rodrigo";
       BigDecimal valorOrcamento = new BigDecimal("300");
       int quantidadeItens = Integer.parseInt("2");

        GeraPedido gerador = new GeraPedido(cliente,valorOrcamento,quantidadeItens);

        GeraPedidoHandler handler = new GeraPedidoHandler(
                Arrays.asList(new SalvarPedidoNoBancoDeDados(), new EnviarEmailPedido(), new LogDePedido())
        );
        handler.execute(gerador);
    }
}