package org.estudos;
import java.util.Scanner;

public class uri_1021 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float cedula = scanner.nextFloat();
        float cedula2 = 0;
        int cem = 0;
        int cinquenta = 0;
        int vinte = 0;
        int dez = 0;
        int cinco = 0;
        int dois = 0;
        int um = 0;
        float cinquenta_cent = 0.00F;
        float vinte_cinco_cent = 0.00F;
        float dez_cent = 0.00F;
        float cinco_cent = 0.00F;
        float um_cent = 0.00F;
        float calculo = 0;
        double auxiliar = 0;

        //Separando os centavos//
        cedula2 = cedula;
        cedula = (int)cedula;
        if(cedula >= 1) {
            calculo = cedula2 / cedula;
            auxiliar = cedula2 % cedula;
        }
        else
        {
            calculo = cedula2;
            auxiliar = cedula2;
        }



        //NOTAS//
        if (cedula > 0) {
            cem = (int) cedula / 100;
            calculo = cedula % 100;
        }
        if (calculo > 0) {
            cinquenta =(int) calculo / 50;
            calculo = calculo % 50;
        }
        if (calculo > 0) {
            vinte = (int)calculo / 20;
            calculo = calculo % 20;
        }
        if (calculo > 0) {
            dez = (int)(calculo / 10);
            calculo = calculo % 10;
        }
        if (calculo > 0) {
            cinco = (int)calculo / 5;
            calculo = calculo % 5;
        }
        if (calculo > 0) {
            dois = (int)calculo / 2;
            calculo = calculo % 2;
        }

        //MOEDAS//

        if(calculo > 0){
            um = (int)calculo;
        }
        if(auxiliar > 0.00){
           cinquenta_cent = (float) auxiliar / 0.50F;
           auxiliar = auxiliar % 0.50F;
        }
        if(auxiliar > 0.00){
            vinte_cinco_cent = (float) auxiliar / 0.25F;
            auxiliar = auxiliar % 0.25F;
        }
        if(auxiliar > 0.00){
            dez_cent = (float) auxiliar / 0.10F;
            auxiliar = auxiliar % 0.10F;
        }
        if(auxiliar > 0.00){
            cinco_cent = (float) auxiliar / 0.05F;
            auxiliar = auxiliar % 0.05F;
        }
        if(auxiliar >= 0.00){
            um_cent= (float) auxiliar / 0.01F;
        }


        System.out.println("NOTAS:");
        System.out.println(cem + " nota(s) de R$ 100.00");
        System.out.println(cinquenta + " nota(s) de R$ 50.00");
        System.out.println(vinte + " nota(s) de R$ 20.00");
        System.out.println( dez + " nota(s) de R$ 10.00");
        System.out.println(cinco + " nota(s) de R$ 5.00");
        System.out.println(dois + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println( (int) um + " moeda(s) de R$ 1.00");
        System.out.println((int)cinquenta_cent + " moeda(s) de R$ 0.50");
        System.out.println((int)vinte_cinco_cent + " moeda(s) de R$ 0.25");
        System.out.println((int)dez_cent + " moeda(s) de R$ 0.10");
        System.out.println((int)cinco_cent + " moeda(s) de R$ 0.05");
        System.out.printf("%.0f moeda(s) de R$ 0.01\n", um_cent);


    }
}
