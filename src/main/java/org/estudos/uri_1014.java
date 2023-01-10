package org.estudos;
import java.util.Scanner;

public class uri_1014 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        float Y = scanner.nextFloat();
        float resultado = X / Y;

        System.out.printf("%.3f km/l\n", resultado);
    }
}
