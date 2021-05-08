package com.company;

public class Conta {
    private Cliente titular;
    private long agencia;
    private long numeroConta;
    private double saldo;

    public Cliente getTitular() {
        return titular;
    }

    public long getAgencia() {
        return agencia;
    }

    public long getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

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

    public void pix(double valor, Conta contaDeDestino){
        if(valor <= this.saldo){
            this.saldo = this.saldo - valor;
            contaDeDestino.depositar(valor);
        }else{
            System.out.println("Limite indiponível de transferência");
        }
    }
}
