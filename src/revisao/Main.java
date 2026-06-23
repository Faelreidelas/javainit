package revisao;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
      Scanner leia = new Scanner(System.in);
      System.out.print("digite seu nome ");
      String nome = leia.nextLine();
      System.out.print("digite seu peso");
      double peso = leia.nextDouble();
      System.out.printf("O peso e  "+peso+" " );
      System.out.print("tst");
    }
}