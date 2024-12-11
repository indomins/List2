package org.example;

import java.util.Scanner;

public class Ex3 {
    public static void calcular(int n){
        Scanner sc=new Scanner(System.in);
        System.out.println("Informe um número inteiro positivo: ");
        n=sc.nextInt();
        if(n<0) System.out.println("O número deve ser inteiro e positivo!");
        else{
            int calc=1;
            for(int i=2;i<=n;i++){
                //System.out.println(i);
                calc=calc*i;
                //5!=5*4*3*2*1
            }
            System.out.println("O fatorial do número "+n+" é: " +calc);
        }
    }
}
