package org.example;

import java.util.Scanner;

public class Ex9 {
    public static void validarCpf(String cpf){
        Scanner sc = new Scanner(System.in);
        String c = "XXX.XXX.XXX-XX";
        String correto = "a";
        while(!correto.equals(c)) {
            System.out.println("Insira o CPF no formato correto: XXX.XXX.XXX-XX");
            cpf = sc.nextLine();
            if (!c.equals(cpf)) System.out.println("O cpf está com o formato incorreto!");
            else {
                System.out.println("O CPF está de acordo com o formato informado.");
                correto = "XXX.XXX.XXX-XX";
            }
        }
    }
}
