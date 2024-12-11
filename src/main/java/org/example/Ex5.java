package org.example;

import java.util.Scanner;

public class Ex5 {
    public  Boolean verificarPrimo(int x){
        for(int i=2;i<x;i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
    }
}
