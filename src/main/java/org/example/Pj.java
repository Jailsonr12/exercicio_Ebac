package org.example;

public class Pj extends Pessoa {
    private String CNPJ;

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public void  imprimir(){
        super.imprimir();
        System.out.println("CNPJ: " + getCNPJ());
    };
}
