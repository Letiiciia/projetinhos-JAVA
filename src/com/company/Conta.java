package com.company;

public class Conta {
    Cliente titular;
    long agencia;
    long numeroConta;
    double saldo;

    public Conta(Cliente titular, long agencia, long numeroConta){
        this.titular = titular;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

    public void sacar(double valor){
        if(valor <= this.saldo){
            this.saldo -= valor;
        }else{
            System.out.println("Limite indisponível para saque");
        }
    }

    public void depositar(double valor){
        this.saldo += valor;
    }
}
