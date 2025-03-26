package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva nome de pessoas separado por vicutla (Ana, Maria, Lucas)");
        String allNames = scanner.nextLine();
        List<String> names = new ArrayList<>(Arrays.asList(allNames.split(", ")));
        Collections.sort(names);

        System.out.println("Lista ordenada: " + names);


        scanner.close();


    }
}
