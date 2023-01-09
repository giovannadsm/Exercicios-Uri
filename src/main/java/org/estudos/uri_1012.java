package org.estudos;
import java.util.Scanner;

public class uri_1012 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        float A = scanner.nextFloat();
        float B = scanner.nextFloat();
        float C = scanner.nextFloat();
        float triangulo = (A * C) / 2;
        double circulo = (C * C) * 3.14159;
        float trapezio = (A + B) * C / 2;
        float quadrado = B * B;
        float retangulo = A * B;


        System.out.printf("TRIANGULO: %.3f\n",triangulo);
        System.out.printf("CIRCULO: %.3f\n",circulo);
        System.out.printf("TRAPEZIO: %.3f\n",trapezio);
        System.out.printf("QUADRADO: %.3f\n",quadrado);
        System.out.printf("RETANGULO: %.3f\n",retangulo);
    }
}
