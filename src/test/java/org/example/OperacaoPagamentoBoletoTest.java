package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperacaoPagamentoBoletoTest {

    @Test
    void deveExecutarPagamentoBoleto() {
        IOperacao operacao = OperacaoFactory.obterOperacao("PagamentoBoleto");
        assertEquals("Pagameto de boleto realizado com sucesso.", operacao.executar());
    }

    @Test
    void deveCancelarPagamentoBoleto() {
        IOperacao operacao = OperacaoFactory.obterOperacao("PagamentoBoleto");
        assertEquals("Pagamento de boleto cancelado.", operacao.cancelar());
    }
}