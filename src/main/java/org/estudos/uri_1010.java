package org.estudos;
import java.util.Scanner;

public class uri_1010 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int codigo1 = scanner.nextInt(); int numero1 = scanner.nextInt(); float valor1 = scanner.nextFloat();
        int codigo2 = scanner.nextInt(); int numero2 = scanner.nextInt(); float valor2 = scanner.nextFloat();
        float resultado = (numero1 * valor1)  + (numero2 * valor2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n",resultado);

    }
}
