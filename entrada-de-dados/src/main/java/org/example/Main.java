package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in); //instancio o scanner

        //Exemplo 1:
        //Atribui o valor digitado no console a uma string
        String x; //cria string
        x = read.next(); //atribui o valor do console a string
        System.out.println("A palavra digitada foi: " +x); //para teste, devolve o valor digitado no console

        //Exemplo 2:
        //Atribuir o valor digitado a um inteiro
        int y;
        y = read.nextInt();
        System.out.println("O número digitado foi: "+y);

        //Exemplo 3:
        //Atribuir o valor digitado a um double
        double z;
        z = read.nextDouble(); //aqui o Double deve ser digitado com , no console devido a configuração da maquina estar em pt-br
        System.out.printf("O número digitado foi: %.2f%n", z); //aqui usamos o %.2f%n para definir que teremos duas casas decimais
                                                                // pós a , também nota-se que usamos o printf no lugar de println e a , no lugar do + para exibir a variavel

        //Exemplo 4:
        //Atribuir o valor digitado ao char
        char a;
        a = read.next().charAt(0); //atribui o valor digitado a variavel a, considerando apenas o primeiro caracter (posição 0)
        System.out.println("O caracter digitado foi: " +a);

        //Exemplo 5:
        //Varias entradas de dados na mesma linha
        //Passo 1: Criar todas as variaveis
        String b;
        int c;
        double d;
        char e;
        //Passo 2: Atribuir a instancia de entrada de dados a cada uma correspondente
        b = read.next();
        c = read.nextInt();
        d = read.nextDouble();
        e = read.next().charAt(0);
        System.out.println("Os dados que foram digitados são: ");
        System.out.println("Para String: " +b);
        System.out.println("Para int: " +c);
        System.out.println("Para dpuble: "+d);
        System.out.println("Para char: "+e);
        //Nota-se que os valores são separados por espaço, então, cada vez que uso espaço na injeção de dados ele atribui a próxima variavel definida

        read.close(); //quando não preciso mais da entrada de dados
    }
}
