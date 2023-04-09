import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Programa que peça 2 números inteiros e um número real
        int ni1;
        int ni2;
        double nr1;
        double exa;
        double exb;
        double exc;
        Scanner input = new Scanner(System.in);
        System.out.println("Primeiro número inteiro:");
        ni1 = input.nextInt();
        System.out.println("Segundo número inteiro:");
        ni2 = input.nextInt();
        System.out.println("Um número real:");
        nr1 = input.nextInt();
        // Calcule e mostre
        // o produto do dobro do primeiro com metade do segundo
        exa = ((ni1 * 2) + (ni2 / 2));
        System.out.println("O produto do dobro do primeiro com metade do segundo, é: " + exa);
        exb = ((ni1 * 3) + nr1);
        System.out.println("O resultado da soma do triplo do primeiro com o terceiro, é: " + exb);
        exc = Math.pow(nr1, 3);
        System.out.println("O terceiro elevado ao cubo, é: " + exc);

    }
}
