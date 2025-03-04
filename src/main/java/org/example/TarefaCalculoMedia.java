package org.example;

public class TarefaCalculoMedia {
    public static void main(String[] args) {

        double[] notas = {10, 8, 7.5, 9};
        double somaTotal = 0;

        for (int i = 0; i < notas.length; i++) {
            somaTotal += notas[i];
        }

        double media = somaTotal / notas.length;

        System.out.println("Soma total das notas é: " + somaTotal);
        System.out.printf("A média das notas é: %.1f%n", media);

    }
}
