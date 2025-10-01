package org.example;

public class OperacaoFactory {
    public static IOperacao obterOperacao(String operacao) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("org.example.Operacao" + operacao);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Operação inexistente");
        }
        if (!(objeto instanceof IOperacao)) {
            throw new IllegalArgumentException("Operação inválida");
        }
        return (IOperacao) objeto;
    }
}
