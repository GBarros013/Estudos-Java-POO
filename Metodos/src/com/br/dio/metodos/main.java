package com.br.dio.metodos;

public class main {
    public static void main(String[] args) {
        // Calculadora
        System.out.println("Exercício calculadora");
        Calculadora.soma(10, 20);
        Calculadora.subtracao(10, 20);
        Calculadora.multiplicacao(10, 20);
        Calculadora.divisao(10, 20);

        //Mensagem
        System.out.println("Exercício mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        // Empréstimo
        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(10000, 3);

    }
}
