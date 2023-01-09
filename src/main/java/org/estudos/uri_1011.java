package org.estudos;
import java.util.Scanner;

public class uri_1011 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double entrada = scanner.nextDouble();
        double resultado = (4.0/3)* 3.14159 * (entrada * entrada * entrada);

        System.out.printf("VOLUME = %.3f\n", resultado);

    }
}
