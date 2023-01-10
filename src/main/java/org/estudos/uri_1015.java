package org.estudos;
import java.util.Scanner;

public class uri_1015 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        float X1 = scanner.nextFloat();
        float Y1 = scanner.nextFloat();
        float X2 = scanner.nextFloat();
        float Y2 = scanner.nextFloat();
        double resposta = Math.sqrt(Math.pow(X2-X1,2) + Math.pow(Y2-Y1,2));

        System.out.printf("%.4f\n",resposta);
    }
}
