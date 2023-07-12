package lp2.revisaoEntradaESaida;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        int numero1 = sc.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int numero2 = sc.nextInt();
        
        System.out.print("Digite o terceiro número: ");
        int numero3 = sc.nextInt();
        
        System.out.print("Os números digitados na ordem inversa são: ");
        System.out.print(numero3 + " " + numero2 + " " + numero1);
        
        sc.close();
    }
}

