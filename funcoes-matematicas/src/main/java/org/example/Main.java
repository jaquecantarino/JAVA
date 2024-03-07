package org.example;

public class Main {
    public static void main(String[] args) {
        //Instanciando as variveis
        double a = 3.0;
        double b = 4.0;
        double c = -5.0;
        double AA, BB, CC;

        //tratando as variaveis
        //raiz quadrada
        AA = Math.sqrt(a);
        BB = Math.sqrt(b);
        CC = Math.sqrt(16);
        System.out.println("A raiz quadrada de " + a + " é: " + AA);
        System.out.println("A raiz quadrada de " + b + " é: " + BB);
        System.out.println("A raiz quadrada de " + c + " é: " + CC);

        //potencia | elevado
        AA = Math.pow(a, b);
        BB = Math.pow(a, 6);
        CC = Math.pow(10, 3);
        System.out.println(a + " elevado a " +b+ " é: " +AA);
        System.out.println(a + " elevado a 6 é: " +BB);
        System.out.println("10 elevado a 3 é: " +CC);

        //valor absoluto (valor sem o negativo, caso exista)
        AA = Math.abs(b);
        BB = Math.abs(c);
        System.out.println("O valor absoluto de "+b+" é: "+AA);
        System.out.println("O valor absoluto de "+c+" é: "+BB);

    }
}