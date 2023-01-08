package org.estudos;
import java.util.Scanner;
public class uri_1008 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int Number = scanner.nextInt();
        int Horas = scanner.nextInt();
        float Valor = scanner.nextFloat();
        float Salary = Horas * Valor;

        System.out.println("NUMBER = " + Number);
        System.out.printf("SALARY = U$ %.2f\n",Salary);


    }
}
