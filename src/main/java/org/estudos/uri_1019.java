package org.estudos;
import java.util.Scanner;

public class uri_1019 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tempo = sc.nextInt();
        int horas = 0;
        int minutos = 0;
        int segundos = 0;
        int calculo = 0;

        if(tempo > 0){
            horas = tempo / 3600;
            calculo = tempo % 3600;
        }
        if(calculo > 0){
            minutos = calculo / 60;
            calculo = calculo % 60;
        }

        if(calculo > 0){
            segundos = calculo;
        }

        System.out.println(horas+":"+minutos+":"+segundos);


    }
}
