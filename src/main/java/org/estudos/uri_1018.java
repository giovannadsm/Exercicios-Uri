package org.estudos;

import java.util.Scanner;

public class uri_1018 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int cedula = scanner.nextInt();
        int cem = 0;
        int cinquenta = 0;
        int vinte = 0;
        int dez = 0;
        int cinco = 0;
        int dois = 0;
        int um = 0;
        int auxiliar = 0;

        if (cedula > 0) {
            cem = cedula / 100;
            auxiliar = cedula % 100;
        }
        if (auxiliar > 0) {
            cinquenta = auxiliar / 50;
            auxiliar = auxiliar % 50;
        }
        if (auxiliar > 0) {
            vinte = auxiliar / 20;
            auxiliar = auxiliar % 20;
        }
        if (auxiliar > 0) {
            dez = auxiliar / 10;
            auxiliar = auxiliar % 10;
        }
        if (auxiliar > 0) {
            cinco = auxiliar / 5;
            auxiliar = auxiliar % 5;
        }
        if (auxiliar > 0) {
            dois = auxiliar / 2;
            auxiliar = auxiliar % 2;
        }
        if (auxiliar > 0) {
            um = auxiliar / 1;
            auxiliar = auxiliar % 1;
        }

        System.out.println(cedula);
        System.out.println(cem + " nota(s) de R$ 100,00");
        System.out.println(cinquenta + " nota(s) de R$ 50,00");
        System.out.println(vinte + " nota(s) de R$ 20,00");
        System.out.println(dez + " nota(s) de R$ 10,00");
        System.out.println(cinco + " nota(s) de R$ 5,00");
        System.out.println(dois + " nota(s) de R$ 2,00");
        System.out.println(um + " nota(s) de R$ 1,00");


    }
}
