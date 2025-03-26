package org.example;

import java.util.*;

public class NameAndSex {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> mans = new ArrayList<>() ;
        List<String> womans = new ArrayList<>() ;
        System.out.println("Insira o nome e o sexo (Jailson-M, Ana-F)");
        String nameAndSex = scanner.nextLine();
        List<String> allNames = new ArrayList<>(Arrays.asList(nameAndSex.split(", ")));
        System.out.println(allNames);
        for (String entry : allNames) {
            String[] parts = entry.split("-");

                String name = parts[0].trim();
                String gender = parts[1].trim().toUpperCase();

                if (gender.equals("M")) {
                    mans.add(name);
                } else if (gender.equals("F")) {
                    womans.add(name);
                }
        }

        System.out.println("\nNomes das pessoas do sexo masculino:");
        for (String man : mans) {
            System.out.println(man);
        }

        System.out.println("\nNomes das pessoas do sexo feminino:");
        for (String woman : womans) {
            System.out.println(woman);
        }

            scanner.close();
    }
}
