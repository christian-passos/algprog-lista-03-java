import java.util.Scanner;

public class LeitorMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();
        double n3 = scanner.nextDouble();

        double maior = Math.max(n1, Math.max(n2, n3));
        double menor = Math.min(n1, Math.min(n2, n3));
        double media = (n1 + n2 + n3) / 3;

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Média: " + media);
        scanner.close();
    }
}