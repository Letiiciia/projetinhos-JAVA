package com.company;

public class Conta {
    public String nome;
    public String cpf;
    public int agencia;
    public int numeroConta;
    public static Double saldo;

    public Conta(){
        nome="Nome Completo";
        cpf="00000000000";
        agencia=00000;
        numeroConta=000000;
        saldo= 0.0;
    }

    public Conta(String nome, String cpf, int agencia, int numeroConta, Double saldo){
        this.nome = nome;
        this.cpf = cpf;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        Conta.saldo = saldo;
    }

    public double saldo(){
        return Conta.saldo;
    }
    public double deposito(double valor){
        double acrescimo =  valor + Conta.saldo;
        return acrescimo;
    }
    public double saque( double valor){
        double decrescimo = valor - Conta.saldo;
        return decrescimo;
    }
}
