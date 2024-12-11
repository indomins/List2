package org.example;

import java.util.Scanner;

public class Ex10 {
    public static void classificarTriangulo(int a, int b, int c){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe os lados do triângulo para a classificação: ");
        a = sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a ==b && b==c)System.out.println("O triângulo é equilátero.");
        else if( a ==b  || a ==c || b==c) System.out.println("O triângulo é isósceles.");
        else System.out.println("O triângulo é escaleno.");
    }
}
