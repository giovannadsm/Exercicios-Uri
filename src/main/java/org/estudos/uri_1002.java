package org.estudos;

import java.util.Scanner;

public class uri_1002 {

    public static void main(String[] args) {

        
            Scanner scanner = new Scanner(System.in);
            double raio = scanner.nextDouble();

            System.out.println(String.format("A=%.4f", 3.14159 * (raio * raio)));
    }
}
