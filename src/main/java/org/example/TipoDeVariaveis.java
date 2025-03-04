package org.example;

public class TipoDeVariaveis {

    public static void main(String[] args) {
        long cpf = 684320592577777L;

        System.out.println(cpf);
        System.out.println("long: " + cpf);

        Long cpf1 = cpf;
        System.out.println("Long: " + cpf1);

        long cpflong = cpf1;
        int cpfInt = (int) cpf;

        System.out.println("int: " + cpfInt);
    }
}
