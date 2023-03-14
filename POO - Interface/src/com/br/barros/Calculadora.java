package com.br.barros;

public class Calculadora implements OperacaoMatematica {
    @Override
    public void soma(double valor1, double valor2) {
        OperacaoMatematica.super.soma(valor1, valor2);
    }

    @Override
    public void subtracao(double valor1, double valor2) {
        OperacaoMatematica.super.subtracao(valor1, valor2);
    }

    @Override
    public void multiplicacao(double valor1, double valor2) {
        OperacaoMatematica.super.multiplicacao(valor1, valor2);
    }

    @Override
    public void divisao(double valor1, double valor2) {
        OperacaoMatematica.super.divisao(valor1, valor2);
    }
}
