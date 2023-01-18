package org.estudos;

import java.util.Scanner;

public class uri_1038 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int produto = scanner.nextInt();
        int quantidade = scanner.nextInt();
        float valor = 0;
        float resultado = 0;

        if(produto == 1){
            valor =  4.00F;
            resultado = valor * quantidade;
            System.out.printf("Total: R$ %.2f%n" , resultado);
        }

        if(produto == 2){
            valor = 4.50F;
            resultado = valor * quantidade;
            System.out.printf("Total: R$ %.2f%n" , resultado);
        }

        if(produto == 3){
            valor = 5.00F;
            resultado = valor * quantidade;
            System.out.printf("Total: R$ %.2f%n" , resultado);
        }

        if(produto == 4){
            valor = 2.00F;
            resultado = valor * quantidade;
            System.out.printf("Total: R$ %.2f%n" , resultado);
        }

        if(produto == 5){
            valor = 1.50F;
            resultado = valor * quantidade;
            System.out.printf("Total: R$ %.2f%n" , resultado);
        }

    }
}
