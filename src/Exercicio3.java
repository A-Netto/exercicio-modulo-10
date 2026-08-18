import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um nome para que o programa inverta: ");
        String nome = scanner.nextLine();

        char[] letras = nome.toCharArray();

        // Invertendo o vetor

        for (int i = 0; i < letras.length / 2; i++) {
            int ultimaPosicao = letras.length - 1 - i;

            char auxiliar = letras[i];
            letras[i] = letras[ultimaPosicao];
            letras[ultimaPosicao] = auxiliar;
        }
        // resultado

        System.out.print("Nome invertido: ");

        for (char letra : letras) {
            System.out.print(letra);
        }

        scanner.close();
    }
}