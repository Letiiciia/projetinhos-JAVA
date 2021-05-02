package com.company;

import java.math.BigDecimal;

public class Conta {
    long agencia;
    long numeroConta;
    BigDecimal saldo;

    public Conta(long agencia, long numeroConta){
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = new BigDecimal(0.0);
    }

}
