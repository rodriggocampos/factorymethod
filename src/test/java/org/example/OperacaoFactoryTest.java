package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperacaoFactoryTest {
    @Test
    void deveRetornarExcecaoParaOperacaoInexistente() {
        try {
            IOperacao operacao = OperacaoFactory.obterOperacao("Evasao");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Operação inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaOperacaoInvalido() {
        try {
            IOperacao operacao = OperacaoFactory.obterOperacao("Deposito");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Operação inválida", e.getMessage());
        }
    }
}