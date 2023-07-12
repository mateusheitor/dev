package lp2.revisaoEntradaESaida;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		String nome;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Olá eu sou o N°1, como é seu nome?");
		nome = sc.next();
		
		System.out.println("Bem-vindo ao clube " + nome + " !!!");
		
		sc.close();
	}

}
