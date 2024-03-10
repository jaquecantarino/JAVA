package org.example;

import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {

        //Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
        //casas decimais conforme exemplos.
        //Fórmula da área: area = π . raio2
        //Considere o valor de π = 3.14159

        Scanner read = new Scanner(System.in);

        double raio, area;
        double pi = 3.14159;

        System.out.println("Digite o valor do raio do circulo para calcular a area: ");
        raio = read.nextDouble();

        area = pi * (raio*2);

        System.out.printf("A area desse circulo é: %.4f\n" , area);



    }
}