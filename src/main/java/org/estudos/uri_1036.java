package org.estudos;
import java.util.Scanner;
public class uri_1036 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double resultado = 0;
        double x1 = 0;
        double x2 = 0;

        resultado = (B * B) + (-4 * (A * C));

        if(A != 0 && resultado > 0){

            x1 = ((-B + Math.sqrt(resultado)) / (2 * A));

            x2 = ((-B - Math.sqrt(resultado)) / (2 * A));

            System.out.printf("R1 = " + "%.5f%n",x1);
            System.out.printf("R2 = " + "%.5f%n",x2);

        }else {
            System.out.println("Impossivel calcular");
        }

    }
}
