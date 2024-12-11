package org.example;

import javax.swing.*;
import java.util.Scanner;

public class Ex1 {
    public static void calculate(String op, double x, double y){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite dois números:");
        x=sc.nextDouble();
        y=sc.nextDouble();
        sc.nextLine();
        System.out.print("Informe a operação desejada:");
        op=sc.nextLine();
        double calc=0;
        switch (op){
            case "+":
                calc= x+y;
                break;
            case "-":
                calc=x-y;
                break;
            case "*":
                calc=x*y;
                break;
            case "/":
                calc=x/y;
                break;
            default:
                System.out.println("Operação inválida!");
        }
        System.out.print("A resposta é:"+calc);
    }
}
