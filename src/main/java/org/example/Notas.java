package org.example;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        boolean calcularMedia = true;
        Scanner teclado = new Scanner(System.in);

        while (calcularMedia) {
            System.out.println("Primeira nota:");
            float nota1 = teclado.nextFloat();
            System.out.println("Segunda nota:");
            float nota2 = teclado.nextFloat();
            System.out.println("Terceira nota:");
            float nota3 = teclado.nextFloat();
            System.out.println("Quarta nota:");
            float nota4 = teclado.nextFloat();

            float media = (nota1 + nota2 + nota3 + nota4) / 4;

            if (media >= 7) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }

            System.out.println("Deseja sair?");
            System.out.println("1 - sair | 0 - continuar");
            int sair = teclado.nextInt();

            if (sair == 1) {
                calcularMedia = false;
            }
        }

        teclado.close();
    }
}
