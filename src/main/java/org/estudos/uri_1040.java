package org.estudos;

import java.util.Scanner;

public class uri_1040 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float n1 = sc.nextFloat();
        float n2 = sc.nextFloat();
        float n3 = sc.nextFloat();
        float n4 = sc.nextFloat();
        float media = 0;
        boolean recuperacao = false;

        media = ((n1 * 2)+(n2 * 3)+(n3 * 4)+(n4 * 1)) / 10;

        System.out.printf("Media: %.1f%n" , media);

        if( media >= 5.0 && media <= 6.9){
            recuperacao = true;
            System.out.println("Aluno em exame.");
            float nota_exame = sc.nextFloat();
            System.out.printf("Nota do exame: %.1f%n" , nota_exame);
            media = (media + nota_exame) / 2;
        }

        if(media < 5.0){
            System.out.println("Aluno reprovado.");
        }else{
            System.out.println("Aluno aprovado.");
        }

        if(recuperacao){
            System.out.printf("Media final: %.1f%n" , media);
        }
    }
}
