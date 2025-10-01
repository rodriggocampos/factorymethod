package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperacaoSaqueTest {

    @Test
    void deveExecutarSaque() {
        IOperacao operacao = OperacaoFactory.obterOperacao("Saque");
        assertEquals("Saque realizado com sucesso.", operacao.executar());
    }

    @Test
    void deveCancelarSaque() {
        IOperacao operacao = OperacaoFactory.obterOperacao("Saque");
        assertEquals("Saque cancelado.", operacao.cancelar());
    }
}