package org.example;

public class OperacaoPagamentoBoleto implements IOperacao {
    public String executar() {
        return "Pagameto de boleto realizado com sucesso.";
    }

    public String cancelar() {
        return "Pagamento de boleto cancelado.";
    }
}
