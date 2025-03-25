package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        boolean stop = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Separando pessoas pelo sexo");

        List<String> men = new ArrayList<>();
        List<String> women = new ArrayList<>();
        Map<String, String> peopleMap = new HashMap<>();

        while (!stop) {
            System.out.println("Insira um nome:");
            String name = scanner.nextLine();

            System.out.println("Insira o sexo da pessoa (M/F):");
            String gender = scanner.nextLine().trim().toUpperCase();

            peopleMap.put(name, gender);

            if (gender.equals("M")) {
                men.add(name);
            } else if (gender.equals("F")) {
                women.add(name);
            } else {
                System.out.println("Sexo inválido! Use 'M' ou 'F'.");
            }

            System.out.println("Deseja continuar inserindo nomes?");
            System.out.println("0 - Não");
            System.out.println("1 - Sim");

            boolean option = scanner.nextLine().equals("0");

            if (option) {
                stop = true;
            }
        }

        System.out.println("\nLista de Homens:");
        for (String name : men) {
            System.out.println(name);
        }

        System.out.println("\nLista de Mulheres:");
        for (String name : women) {
            System.out.println(name);
        }



        scanner.close();
    }
}
