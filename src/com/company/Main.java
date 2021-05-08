package com.company;

public class Main {

    public static void main(String[] args) {

        Cliente titularLeticia = new Cliente("Letícia Ferreira Lima", 1111111111L , 3592044L);
        Conta contaDaLeticia = new Conta(titularLeticia,65987L, 569748L);
        System.out.println(contaDaLeticia.getTitular().getNome());
        System.out.println(contaDaLeticia.getTitular().getCpf());
        System.out.println(contaDaLeticia.getTitular().getRg());
        System.out.println(contaDaLeticia.getAgencia());
        System.out.println(contaDaLeticia.getSaldo());

        Cliente titularRafael = new Cliente("Rafael Ferreira Lima",1111111111L , 3592044L);
        Conta contaDoRafael = new Conta(titularRafael,65987L, 569748L);
        System.out.println(contaDoRafael.getTitular().getNome());
        System.out.println(contaDoRafael.getTitular().getCpf());
        System.out.println(contaDoRafael.getTitular().getRg());
        System.out.println(contaDoRafael.getAgencia());
        System.out.println(contaDoRafael.getSaldo());


        contaDaLeticia.depositar(200.0);
        System.out.println(contaDaLeticia.getSaldo());
        contaDaLeticia.sacar(100.0);
        System.out.println("Saldo da Le: " + contaDaLeticia.getSaldo());


        contaDaLeticia.pix(50, contaDoRafael);
        System.out.println("Saldo do Rafa: " + contaDoRafael.getSaldo());
    }
}
