package org.example;

public class Xicara {
    private int tamanho;
    private int diametro;
    private String liquido;
    private int quantidadeDeLiquido;

    public Xicara(int diametro, int tamanho) {
        this.diametro = diametro;
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public String getLiquido() {
        return liquido;
    }

    public void setLiquido(String liquido) {
        this.liquido = liquido;
    }

    public int getQuantidadeDeLiquido() {
        return quantidadeDeLiquido;
    }

    public void setQuantidadeDeLiquido(int quantidadeDeLiquido) {
        this.quantidadeDeLiquido = quantidadeDeLiquido;
    }

    public void encherXicara(String bebida) {
        setLiquido(bebida);
        if (this.liquido == null || this.liquido.isEmpty()) {
            System.out.println("Defina um líquido antes de encher a xícara!");
            return;
        }
        setQuantidadeDeLiquido(100);
        System.out.println("A xícara foi enchida de " + getLiquido());
    }

    public void xicaraVazia() {
        if (quantidadeDeLiquido == 0) {
            System.out.println("O " + (liquido != null ? liquido : "líquido") + " acabou.");
        } else if (quantidadeDeLiquido > 0 && quantidadeDeLiquido < 50) {
            System.out.println("Está quase acabando");
        } else if (quantidadeDeLiquido == 50) {
            System.out.println("Está pela metade");
        } else {
            System.out.println("Está cheio");
        }
    }

    public void oqueEstouBebendo() {
        if (liquido == null || liquido.isEmpty()) {
            System.out.println("A xícara está vazia.");
        } else {
            System.out.println("Na xícara tem " + liquido);
        }
    }

    public void beber() {
        if (this.quantidadeDeLiquido > 0) {
            this.quantidadeDeLiquido = this.quantidadeDeLiquido - 25;
        }
    }
}
