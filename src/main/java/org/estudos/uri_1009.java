package org.estudos;
import java.util.Scanner;
public class uri_1009 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char Nome = scanner.next().charAt(0);
        double salario = scanner.nextDouble();
        double vendas = scanner.nextDouble();
        double comissao = (vendas * 0.15) + salario;

        System.out.printf("TOTAL = R$ %.2f\n",comissao);

    }
}
