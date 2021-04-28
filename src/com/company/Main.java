package com.company;

public class Main {

    public static void main(String[] args) {
//      CalculaMedia calculaMedia = new CalculaMedia();
//      calculaMedia.media();

//      ListaEx listaEx = new ListaEx();
//      listaEx.calculoTriangulo();
//      listaEx.calculaQuadrado();

        Conta conta = new Conta();

        Conta contaDaLeticia = new Conta("Letícia Lima", "06775639147", 65987, 569748, 1000.0);


        System.out.println(contaDaLeticia.saldo());
        System.out.println(contaDaLeticia.deposito(50.0));
        System.out.println(contaDaLeticia.saque(100.0));


    }
}
