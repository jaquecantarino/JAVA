package org.example;

import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {

        //Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma
        // desses números com uma mensagem explicativa, conforme exemplos.

        Scanner read = new Scanner(System.in);

        int a;
        int b;
        int soma;

        System.out.println("Digite um número inteiro:");
        a=read.nextInt();
        System.out.println("Para somar digite outro número inteiro:");
        b=read.nextInt();

        soma=a+b;

        System.out.println("SOMA= "+soma);


    }
}