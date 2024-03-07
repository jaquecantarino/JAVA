package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in); //instancio o scanner

        System.out.println("PARTE 1");

        //Exemplo 1:
        //Atribui o valor digitado no console a uma string
        String x; //cria string
        x = read.next(); //atribui o valor do console a string
        System.out.println("A palavra digitada foi: " + x); //para teste, devolve o valor digitado no console

        //Exemplo 2:
        //Atribuir o valor digitado a um inteiro
        int y;
        y = read.nextInt();
        System.out.println("O número digitado foi: " + y);

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
        System.out.println("O caracter digitado foi: " + a);

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
        System.out.println("Para String: " + b);
        System.out.println("Para int: " + c);
        System.out.println("Para dpuble: " + d);
        System.out.println("Para char: " + e);
        //Nota-se que os valores são separados por espaço, então, cada vez que uso espaço na injeção de dados ele atribui a próxima variavel definida

        System.out.println("PARTE 2");

        //Ler a entrada até a quebra de linha

        String aa, bb, cc;
        read.nextLine(); //antecipando o linha pendente explicado mais abaixo
        aa = read.nextLine(); //o nextLine é quem diz ao nosso programa que ele deve armazenar até o 'enter'
        bb = read.nextLine();
        cc = read.nextLine();

        System.out.println("Os dados digitados são: ");
        System.out.println(aa);
        System.out.println(bb);
        System.out.println(cc);

        //Entrada pendente
        //Ocorre quando, como no exemplo abaixo, um 'enter' é consumido quando não usamos o nextLine na declaração.

        String dd, ee, ff;
        int gg;

        //Da forma que o código abaixo está descrito, ele deixa um 'enter' pendente depois da variavel inteira
        //ocasionando uma string vazia no d
//        gg= read.nextInt();
//        dd = read.nextLine();
//        ee = read.nextLine();
//        ff = read.nextLine();
        //para corrigir isso, usamos um novo nextLine, assim:
        gg = read.nextInt();
        read.nextLine();
        dd = read.nextLine();
        ee = read.nextLine();
        ff = read.nextLine();


        System.out.println("Os dados digitados são: ");
        System.out.println(gg);
        System.out.println(dd);
        System.out.println(ee);
        System.out.println(ff);


        read.close(); //quando não preciso mais da entrada de dados

    }
}
