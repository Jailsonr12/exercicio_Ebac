package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Xicara xicara = new Xicara(10, 40);
        xicara.encherXicara("Café");
        xicara.xicaraVazia();
        xicara.beber();
        xicara.beber();
        xicara.xicaraVazia();
        xicara.beber();
        xicara.xicaraVazia();
        xicara.oqueEstouBebendo();
        xicara.beber();
        xicara.xicaraVazia();
    }
}