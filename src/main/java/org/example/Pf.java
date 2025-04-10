package org.example;

public class Pf extends Pessoa {
    private String CPF;

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void  imprimir(){
        super.imprimir();
        System.out.println("CPF: " + getCPF());
    };
}
