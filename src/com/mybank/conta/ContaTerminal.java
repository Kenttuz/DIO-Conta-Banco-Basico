package com.mybank.conta;

public class ContaTerminal {

    
    public static void main(String[] args) throws Exception {

        CriarConta conta = new CriarConta();
        conta.informarAgencia();
        conta.informarNumeroConta();
        conta.informarNome();
        conta.depositarSaldo();
        conta.exibirMensagemSucesso();
    }
}