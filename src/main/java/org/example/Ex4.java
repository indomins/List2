package org.example;

import java.util.Scanner;

public class Ex4 {
    public static void week(int x){
        Scanner sc =new Scanner(System.in);
        System.out.println("Digite um número de 1 a 7: ");
        x=sc.nextInt();
        switch (x){
            case 1:
                System.out.println("Domingo");
            case 2:
                System.out.println("Segunda-feira");
            case 3:
                System.out.println("Terça-Feira");
            case 4:
                System.out.println("Quarta-feira");
            case 5:
                System.out.println("Quinta-feira");
            case 6:
                System.out.println("Sexta-Feira");
            case 7:
                System.out.println("Sábado");
            default:
                System.out.println("O número "+x+" não corresponde a um dia da semana!");
        }
    }
}
