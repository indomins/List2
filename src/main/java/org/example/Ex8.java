package org.example;

import java.util.Scanner;

public class Ex8 {
    public static void tabuada(int x){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um número inteiro: ");
        x=sc.nextInt();
        int resp=1;
        for(int i=1;i<=10;i++){
            resp=x*i;
            System.out.println(+x+"x"+i+"="+resp);
        }
    }
}
