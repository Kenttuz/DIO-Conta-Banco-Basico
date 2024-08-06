package com.mybank.conta;

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class CriarConta {
    int numero;
    String nome;
    double saldo;
    String agencia;


    Locale localeBR = new Locale("pt", "BR");
    NumberFormat currencyFormatBR = NumberFormat.getCurrencyInstance(localeBR);
    Scanner scanner = new Scanner(System.in, "UTF-8");
    

    public void informarNumeroConta(){
        System.out.println("Por favor, digite o número da conta!");

        while (true) {
            if (scanner.hasNextInt()) {
                this.numero = scanner.nextInt();
                scanner.nextLine(); // Limpa o buffer do scanner
                if (this.numero > 0) {
                    break;
                } else {
                    System.out.println("O número da conta não pode ser zero ou negativo. Por favor, digite novamente.");
                }
            } else {
                System.out.println("Digite um número inteiro válido. Por favor, digite novamente.");
                scanner.nextLine();
            }
        }
    }
    public void informarAgencia(){
        System.out.println("Por favor, digite o número da Agência!");
    
        while (true) {
            String agenciaCliente = scanner.nextLine();
            if (!agenciaCliente.isEmpty()) {
                int length = agenciaCliente.length();
   
                if (length == 4) {
                    String agenciaFormatada = agenciaCliente.substring(0, length - 1) + "-" + agenciaCliente.charAt(length - 1);
                    this.agencia = agenciaFormatada;
                    break;
                } else {
                 System.out.println("O número da Agência não pode estar vazio ou ser menor que 4 digitos. Por favor, digite novamente.");
             }
        }
    }
}
    public void informarNome(){ 
        System.out.println("Por favor, digite o nome do proprietário da conta!");

        while (true) {
            String nomeCliente = scanner.nextLine();
            if (!nomeCliente.isEmpty()) {
                this.nome = nomeCliente;
                break;
            } else {
                System.out.println("O número do proprietário não pode estar vazio. Por favor, digite novamente.");
            }
        }
    }

    public void depositarSaldo(){
        System.out.println("Por favor, digite o saldo inicial da conta!");

        while (true) {
              this.saldo = scanner.nextDouble();
              scanner.nextLine();
              if (this.saldo >= 0) {
                    break;
              } else {
                    System.out.println("O saldo inicial não pode ser negativo. Por favor, digite novamente.");
            }
        }
    }

    public void exibirMensagemSucesso(){
        System.out.println("Olá " + this.nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + this.agencia + ", conta " + this.numero + " e seu saldo " + currencyFormatBR.format(this.saldo) + " já está disponível para saque!");
    }   
}   
