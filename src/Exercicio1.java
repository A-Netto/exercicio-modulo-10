import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int n = scanner.nextInt();
        int[] numeros = new int[n];

        // Preenchendo o vetor
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Bubble Sort
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int auxiliar = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = auxiliar;
                }
            }
        }

        System.out.println("\nVetor ordenado:");

        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        scanner.nextLine();

        // Recebendo o nome
        System.out.print("\n\nDigite um nome para a exibição da quantidade de vogais: ");
        String nome = scanner.nextLine().toLowerCase();

        int vogais = 0;

        // Contando as vogais
        for (int i = 0; i < nome.length(); i++) {
            char letra = nome.charAt(i);

            if (letra == 'a' ||
                    letra == 'e' ||
                    letra == 'i' ||
                    letra == 'o' ||
                    letra == 'u') {

                vogais++;
            }
        }
        //mostrando o resultrado
        System.out.println("Quantidade de vogais: " + vogais);

        scanner.close();
    }
}

