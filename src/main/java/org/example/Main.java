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
            case 5:
                System.out.println("Informe um número inteiro: ");
                int x=sc.nextInt();
                Ex5 primo = new Ex5();
                if(primo.verificarPrimo(x)) System.out.println("Número "+x+" é primo!");
                else System.out.println("O número "+x+ " não é primo!");
                break;
            case 6:
                Ex6.game(0);
                break;
            case 7:
                Ex7.usuario("login","senha");
                break;
            case 8:
                Ex8.tabuada(0);
                break;
            case 9:
                Ex9.validarCpf("cpf");
                break;
            case 10:
                Ex10.classificarTriangulo(0,0,0);
                break;
            default:
                System.out.println("A lista só possui 10 exercícios!");
        }
    }
}