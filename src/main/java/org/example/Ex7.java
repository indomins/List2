package org.example;

import java.util.Scanner;

public class Ex7 {
    public static void usuario(String login, String senha){
        Scanner sc = new Scanner(System.in);
        String l="batata";
        String s="doce12";
        String c="a";
        while(!c.equals("correto")) {
            System.out.println("Insira seu login: ");
            login = sc.nextLine();
            System.out.println("Digite a senha: ");
            senha = sc.nextLine();
            if (!login.equals(l)) {
                System.out.println("Usuário não encontrado!");
            } else if (!senha.equals(s)) {
                System.out.println("Senha incorreta!");
            } else {
                System.out.println("Conectado com sucesso!");
                c = "correto";
            }
        }
    }
}
