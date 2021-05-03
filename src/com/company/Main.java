package com.company;

public class Main {

    public static void main(String[] args) {

        Cliente leticia = new Cliente("Letícia Ferreira Lima", 0677L , 3592044L);
        Conta contaDaLeticia = new Conta(leticia,65987L, 569748L);
        System.out.println(contaDaLeticia.titular.rg);
        System.out.println(contaDaLeticia.titular.nome);
        System.out.println(contaDaLeticia.titular.cpf);

        System.out.println(contaDaLeticia.agencia);
        System.out.println(contaDaLeticia.saldo);

        contaDaLeticia.depositar(200.0);
        System.out.println(contaDaLeticia.saldo);
        contaDaLeticia.sacar(100.0);
        System.out.println(contaDaLeticia.saldo);

    }
}
