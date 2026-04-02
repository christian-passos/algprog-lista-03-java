import java.util.Scanner;
import java.util.Random;

public class SorteioAleatorio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        int menor = Math.min(n1, n2);
        int maior = Math.max(n1, n2);

        Random random = new Random();
        int resultado = random.nextInt((maior - menor) + 1) + menor;

        System.out.println("Número gerado: " + resultado);
        if (resultado % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }
        scanner.close();
    }
}