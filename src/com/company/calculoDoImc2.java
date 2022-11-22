package com.company;

import java.util.Scanner;

public class calculoDoImc2 {
    public static void calculoImc(float peso, float altura) {
        double[] pesoImc = {18.5, 24.9, 29.9, 39, 9, 90000};
        String[] classificacoesImc = {"Magreza", "Normal", "Sobrepeso", "Obesidade", "Obesidade Grave"};

        float imc = peso / (altura * altura);
        System.out.println("O imc é: " + imc);

        String classificacao = "";
        int i = 0;
        while (imc > pesoImc[i]) {
            i++;
        }
        System.out.println("A classificação é: " + classificacoesImc[i]);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String resposta = "s";

        while (resposta.equals("s")) {
            System.out.println("Calcular novo IMC? (s/n)");
            resposta = entrada.nextLine();

            if (resposta.equals("s")) {
                System.out.println("Entre com o peso em Kg: ");
                float peso = entrada.nextFloat();
                entrada.nextLine();
                System.out.println("Entre com a altura em metros: ");
                float altura = entrada.nextFloat();
                entrada.nextLine();
                calculoImc(peso, altura);
            }
        }
    }
}
