package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Dimenções da xicara
        Xicara xicara = new Xicara(10, 40);
        xicara.encherXicara("Café");
        xicara.xicaraVazia();
        //Ação de toma o liquido
        xicara.beber();
        xicara.beber();

        //Validação se tem liquido ainda
        xicara.xicaraVazia();

        //Toma o ultimo galo
        xicara.beber();

       //chegar na metade do copo
        xicara.xicaraVazia();

        //lembrar oque estava bebendo

        xicara.oqueEstouBebendo();

        //Validar se tem liquido ainda
        xicara.beber();

        //validar se acabou o liquido
        xicara.xicaraVazia();
    }
}