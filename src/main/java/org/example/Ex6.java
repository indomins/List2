package org.example;

import java.util.Random;
import java.util.Scanner;

public class Ex6 {
    public static void game(int x){
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int numeroAleatorio = rd.nextInt(100)+1;
        System.out.println("Jogo da Advivinhação! Tente acertar o número da sorte entre 1 e 100! ");
        String w = "a";
        while( !w.equals("acertou")){
            x=sc.nextInt();
            if (x > numeroAleatorio) {
                System.out.println("O número da sorte é menor que " + x);
            }
            else if (x < numeroAleatorio) {
                System.out.println("O número da sorte é maior que " + x);
            }
            else {
                System.out.println("Parabéns, você acertou! O número da sorte era " +x);
                w = "acertou";
            }
        }
    }
}
