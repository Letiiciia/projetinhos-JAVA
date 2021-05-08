## Conta Bancaria - JAVA(POO)

<p align="center"> 
<img src="https://github.com/Letiiciia/projeto-contaBancaria-JAVA/blob/master/img/download.png" height="25%" width ="25%">
</p>

O projetinho consiste na criação de uma conta bancária (conta sálario, conta poupança, entre outras) e o chamado dos métodos possíveis das Classes Contas (sacar, depositar, transferir, entre outros).
Na classe <b>Main</b> é possível a criação do titular da conta e da conta em sí. Podemos brincar de transferir valores entre as contas, com  o método pix, sacar e depositar valores.
<br>
```json
  #Criação da conta e print dos dados da conta.

    Cliente titularLeticia = new Cliente("Letícia Ferreira Lima", 1111111111L , 3592044L);
        
    Conta contaDaLeticia = new Conta(titularLeticia,65987L, 569748L);
        
    System.out.println(contaDaLeticia.getTitular().getNome());
    System.out.println(contaDaLeticia.getTitular().getCpf());
    System.out.println(contaDaLeticia.getTitular().getRg());
    System.out.println(contaDaLeticia.getAgencia());
    System.out.println(contaDaLeticia.getSaldo());
```

```json
  #chamado dos metodos de interação da conta.
        
    contaDaLeticia.depositar(200.0);
    System.out.println(contaDaLeticia.getSaldo());
        
    contaDaLeticia.sacar(100.0);
    System.out.println("Saldo da Le: " + contaDaLeticia.getSaldo());
            
    contaDaLeticia.pix(50, contaDoRafael);
    System.out.println("Saldo do Rafa: " + contaDoRafael.getSaldo());
```

### Pré-requisitos

Antes de utilizar a aplicação, você vai precisar ter instalado em sua máquina as seguintes ferramentas:<br>
[Git](https://git-scm.com), [JAVA](https://www.java.com/pt-BR/), [JDK](https://www.oracle.com/br/java/technologies/javase-jdk11-downloads.html).
Além disto é bom ter um editor para trabalhar com o código como [Eclipse](https://www.eclipse.org/downloads/) ou [Intellij IDEA](https://www.jetbrains.com/pt-br/idea/download/#section=windows)

### Rodando o Back End (servidor)

```bash
# Clone este repositório
$ git clone <https://github.com/Letiiciia/projeto-contaBancaria-JAVA.git>

# Acesse a pasta do projeto no terminal/cmd
$ cd projeto-contaBancaria-JAVA

# Rode a aplicação
$ Run 'Main'

```
