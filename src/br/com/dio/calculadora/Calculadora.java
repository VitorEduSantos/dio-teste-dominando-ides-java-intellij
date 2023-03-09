package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        int a,b;
        System.out.println("Digite o primeiro valor: ");
        a = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        b = scan.nextInt();

        int somar = somar(a, b);
        int subtrair = subtracao(a, b);
        int multiplicar = multiplicacao(a, b);
        double dividir = divisao(a, b);

        System.out.println("soma " + somar);
        System.out.println("subtração " + subtrair);
        System.out.println("multiplicação " + multiplicar);
        System.out.println("divisão " + dividir);

    }
    public  static  int somar(int a, int b){
        return a+b;
    }
    public  static  int subtracao(int a, int b){
        return a-b;
    }
    public  static  int multiplicacao(int a, int b){
        return a*b;
    }
    public  static  double divisao(double a, double b){
        return a/b;
    }
}
