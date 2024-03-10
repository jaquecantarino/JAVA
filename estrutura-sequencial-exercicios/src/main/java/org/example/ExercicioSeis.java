package org.example;

import java.util.Scanner;

public class ExercicioSeis {
    public static void main(String[] args) {

        //Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
        //mostre:
        //a) a área do triângulo retângulo que tem A por base e C por altura.
        //b) a área do círculo de raio C. (pi = 3.14159)
        //c) a área do trapézio que tem A e B por bases e C por altura.
        //d) a área do quadrado que tem lado B.
        //e) a área do retângulo que tem lados A e B.

        Scanner read = new Scanner(System.in);

        double A, B, C;
        double areaTriRe, areaCirculo, trapezio, quadrado, retangulo;
        double pi=3.14159;

        A = read.nextDouble();
        B = read.nextDouble();
        C = read.nextDouble();

        areaTriRe = 0.5*A*C;
        areaCirculo= pi * (C*2);
        trapezio = 0.5*(A+B)*C;
        quadrado = B*B;
        retangulo = A*B;

        System.out.printf("a área do triângulo retângulo %.2f\n" , areaTriRe);
        System.out.printf("a área do círculo %.2f\n" , areaCirculo);
        System.out.printf("a área do trapézio %.2f\n" , trapezio);
        System.out.printf("a área do quadrado %.2f\n" , quadrado);
        System.out.printf("a área do retângulo %.2f\n" , retangulo);


    }
}