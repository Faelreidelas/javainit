package revisao;

import java.util.Scanner;

public class arrays {

    static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        System.out.print("digite o tamanho da lista");
        int tamanho = leia.nextInt();

        int[] lista = new int[tamanho];

        System.out.print("digite o primeiro elemento da lista");
        int primeiroElemento = leia.nextInt();
        lista[0] = primeiroElemento;

        System.out.print("digite o segundo elemento da lista");
        int segundoElemento = leia.nextInt();
        lista[1] = segundoElemento;

        System.out.print("digite o terceiro Elemento da lista");
        int terceiroElemento = leia.nextInt();
        lista[2] = terceiroElemento;

    }
}
