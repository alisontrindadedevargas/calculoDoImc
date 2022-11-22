package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com o peso em Kg: ");
        float peso = entrada.nextFloat();
        System.out.println("Entre com a altura em metros: ");
        float altura = entrada.nextFloat();
        float imc = peso / (altura * altura);
        System.out.println("O imc é: " + imc);

        String classificao = "";

        if (imc < 18.5) classificao = "Magreza";
        else if (imc < 24.9) classificao = "Normal";
        else if (imc < 29.9) classificao = "Sobrepeso";
        else if (imc < 39.9) classificao = "Obesidade";
        else classificao = "Obesidade Grave";

        System.out.println(" A classificação é: " + classificao);
    }
}
