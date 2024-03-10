package org.example;

import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {

        //Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
        //de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

        Scanner read = new Scanner(System.in);

        int A, B, C, D;
        int diferenca;

        A = read.nextInt();
        B = read.nextInt();
        C = read.nextInt();
        D = read.nextInt();

        diferenca = (A*B)-(C*D);

        System.out.println("DIFERENCA= "+diferenca);

    }
}