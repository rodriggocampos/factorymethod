package org.example;

public class OperacaoSaque implements IOperacao{
    public String executar() {
        return "Saque realizado com sucesso.";
    }

    public String cancelar() {
        return "Saque cancelado.";
    }
}
