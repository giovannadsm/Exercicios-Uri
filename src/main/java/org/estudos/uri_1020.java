package org.estudos;

import java.util.Scanner;

public class uri_1020 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int idade_dias = sc.nextInt();
        int ano = 0;
        int mes = 0;
        int dias = 0;
        int calculo = 0;

        if(idade_dias > 0){
            ano = idade_dias / 365;
            calculo = idade_dias % 365;
        }

        if(calculo > 0){
            mes = calculo / 30;
            calculo = calculo % 30;
        }

        if(calculo > 0){
            dias = calculo;
        }

        System.out.println( ano +" ano(s)");
        System.out.println( mes +" mes(es)");
        System.out.println( dias + " dia(s)");

    }
}
