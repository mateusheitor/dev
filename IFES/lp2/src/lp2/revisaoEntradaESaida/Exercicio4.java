package lp2.revisaoEntradaESaida;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String nome;
		int idade;
		int diasVividos;

		System.out.println("Qual o seu nome? ");
		nome = sc.next();

		System.out.println("Qual a sua idade? ");
		idade = sc.nextInt();

		diasVividos = idade * 365;
		System.out.println(nome + " tem aproximadamente " + diasVividos + " dias vividos.");

		sc.close();
	}
}
