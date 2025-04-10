package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Pj pj = new Pj();
        pj.setName("JR WEB");
        pj.setCNPJ("00.000.000/0001-00");
        pj.imprimir();
        System.out.println("________________________");
        Pf pf = new Pf();
        pf.setName("Jailson Da Silva Roth");
        pf.setCPF("000.000.000-23");
        pf.imprimir();

    }

}