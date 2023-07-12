package lp2.revisaoEntradaESaida;

public class Exercicio2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int aux;

        // Troca dos valores
        aux = a;
        a = c;
        c = b;
        b = aux;
        

        // Imprime os valores atualizados
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
