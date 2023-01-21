package org.estudos;

import java.util.Scanner;

public class uri_1067 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();
        if(numero%2 == 0)
            numero = numero - 1;
        for (int o = 1; o <= numero; o+=2){
                System.out.println(o);
        }
    }
}
