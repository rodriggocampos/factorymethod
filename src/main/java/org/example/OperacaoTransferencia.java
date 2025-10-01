package org.example;

public class OperacaoTransferencia implements IOperacao {
    public String executar() {
        return "Transferência realizada com sucesso.";
    }

    public String cancelar() {
        return "Transferência cancelada.";
    }
}
