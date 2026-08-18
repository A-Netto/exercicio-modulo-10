import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int n = scanner.nextInt();
        int[] numeros = new int[n];

        // Preenche o vetor com os números digitados pelo usuário
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Percorre o vetor e altera seus valores
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                // Se for par, multiplica por 2
                numeros[i] = numeros[i] * 2;
            } else {
                // Se for ímpar, eleva ao quadrado
                numeros[i] = (int) Math.pow(numeros[i], 2);
            }
        }

        // Exibe o novo vetor
        System.out.print("Resultado: -[");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if (i < numeros.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]-");

        scanner.close();
    }
}