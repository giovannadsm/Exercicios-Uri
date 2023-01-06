package org.estudos;
import java.util.Scanner;

public class uri_1005 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double MEDIA = A * 0.35 + B * 0.75;
        MEDIA = (MEDIA / 11) * 10;

        System.out.printf("MEDIA = %.5f\n",MEDIA);
    }
}
