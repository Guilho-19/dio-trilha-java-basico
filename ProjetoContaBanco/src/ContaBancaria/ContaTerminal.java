package ContaBancaria;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in).useLocale(Locale.US);
		
		System.out.println("Bem Vindo a abertura de conta do Banco");
		System.out.println("Informe seus dados para prosseguir");
		
		System.out.println("Digite seu nome");
		String nomeCliente = scanner.nextLine();
		
		System.out.println("Digite o número da sua conta");
		int numeroConta = scanner.nextInt();
		
		scanner.nextLine(); // Limpeza do buffer
		
		System.out.println("Digite o número da sua Agência");
		String numeroAgencia = scanner.nextLine();
		
		System.out.println("Qual é o seu valor de depósito?");
		double saldoDeposito = scanner.nextDouble();
		
		System.out.println(
			"\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso Banco.\n"
			+ "Sua agência é " + numeroAgencia + ", Conta " + numeroConta 
			+" e seu Saldo " + String.format("%.2f", saldoDeposito) 
			+ " já está disponível para saque");
		
		scanner.close();
	}
}
