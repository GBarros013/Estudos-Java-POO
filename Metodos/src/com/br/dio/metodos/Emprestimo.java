package com.br.dio.metodos;

public class Emprestimo {
    public static double getTaxaDuasParcelas(){
        return 0.7;
    }
    public static double getTaxaTresParcelas(){
        return 0.4;
    }
    public static void calcular(double valor, int parcelas){
        if (parcelas == 2){
            double valorFinal = valor + (valor * getTaxaDuasParcelas());
            System.out.println("Valor final do empréstimo para 2 parcelas: R$" + valorFinal);
        } else if (parcelas == 3) {
            double valorFinal = valor + (valor * getTaxaTresParcelas());
            System.out.println("Valor final do empréstimo para 3 parcelas: R$" + valorFinal);
        }else {
            System.out.println("Quantidade de parcelas não aceita");
        }
    }
}
