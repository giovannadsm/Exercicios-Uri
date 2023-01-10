package org.estudos;
import java.util.Scanner;

public class uri_1017 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tempo = sc.nextInt();
        int velocidade = sc.nextInt();
        double resultado = (tempo * velocidade) / 12.0;

        System.out.printf("%.3f\n",resultado);
    }
}
