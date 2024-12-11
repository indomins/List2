package org.example;

import java.util.Scanner;

public class Ex2 {
    public static void gerarSequencia(int n){
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um número inteiro positivo: ");
        n=sc.nextInt();
        int first=1;
        int second=1;
        if (n < 0) System.out.println("O número deve ser inteiro e positivo!");
        else{
            for(int i=0;i<n;i++){
                System.out.println(first);
                int next=first+second;
                first=second;
                second=next;
            }
        }
    }
}
