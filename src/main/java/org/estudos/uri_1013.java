package org.estudos;
import java.util.Scanner;

public class uri_1013 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int Resposta = (A+B+Math.abs(A-B))/2;
        int Resposta2 = (C+Resposta+Math.abs(C-Resposta))/2;

        System.out.printf("%d eh o maior\n", Resposta2);

    }
}
