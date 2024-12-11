package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escolha o exercício:");
        int e =sc.nextInt();
        switch (e){
            case 1:
                Ex1.calculate("a",0,0);
                break;
            case 2:
                Ex2.gerarSequencia(0);
                break;
            case 3:
                Ex3.calcular(0);
                break;
            case 4:
                Ex4.week(0);
            default:
                System.out.println("A lista só possui 10 exercícios!");
        }
    }
}