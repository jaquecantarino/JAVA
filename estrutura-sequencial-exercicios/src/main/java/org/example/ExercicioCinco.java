package org.example;

import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {

        //Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
        //código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

        Scanner read = new Scanner(System.in);

        int codPecaUm, codPecaDois, numPecaUm, numPecaDois;
        double valorPecaUm, valorPecaDois;
        double total;

        System.out.println("Código da peça: ");
        codPecaUm = read.nextInt();
        System.out.println("Quantidade: ");
        numPecaUm = read.nextInt();
        System.out.println("Valor unitário: ");
        valorPecaUm = read.nextDouble();
        System.out.println("Código da peça: ");
        codPecaDois = read.nextInt();
        System.out.println("Quantidade: ");
        numPecaDois = read.nextInt();
        System.out.println("Valor unitário: ");
        valorPecaDois = read.nextDouble();

        total = (valorPecaUm*numPecaUm)+(valorPecaDois*numPecaDois);

        System.out.printf("Total: %.2f\n" , total);

    }
}