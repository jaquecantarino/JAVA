package org.example;

import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {

        //Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
        //hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
        //decimais.

        Scanner read = new Scanner(System.in);
        int numFuncionario, hsTrabalhadas;
        double valorHora, salario;

        System.out.println("Número do Funcionário: ");
        numFuncionario =  read.nextInt();
        System.out.println("Quantidade de horas trabalhadas: ");
        hsTrabalhadas =  read.nextInt();
        System.out.println("Valor da hora: ");
        valorHora =  read.nextInt();

        salario = hsTrabalhadas * valorHora;

        System.out.println("O funcionário: " + numFuncionario);
        System.out.printf(" receberá o salario de: %.2f\n" , salario);

    }
}