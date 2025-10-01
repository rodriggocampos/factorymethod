package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperacaoTransferenciaTest {

    @Test
    void deveExecutarTransferencia() {
        IOperacao operacao = OperacaoFactory.obterOperacao("Transferencia");
        assertEquals("Transferência realizada com sucesso.", operacao.executar());
    }

    @Test
    void deveCancelarTranferencia() {
        IOperacao operacao = OperacaoFactory.obterOperacao("Transferencia");
        assertEquals("Transferência cancelada.", operacao.cancelar());
    }
}