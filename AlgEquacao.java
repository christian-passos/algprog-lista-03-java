import java.util.Scanner;

public class AlgEquacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if (a == 0 && b == 0 && c != 0) {
            System.out.println("Coeficientes informados incorretamente.");
        } else if (a == 0 && b != 0) {
            System.out.println("Essa é uma equação de primeiro grau");
            double raiz = -c / b;
            System.out.println("Raiz: " + raiz);
        } else {
            double delta = (b * b) - (4 * a * c);
            if (delta < 0) {
                System.out.println("Esta equação não possui raízes reais");
            } else if (delta == 0) {
                System.out.println("Esta equação possui duas raízes reais iguais.");
                double raiz = -b / (2 * a);
                System.out.println("Raízes: " + raiz);
            } else {
                System.out.println("Esta equação possui duas raízes reais diferentes.");
                double r1 = (-b + Math.sqrt(delta)) / (2 * a);
                double r2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Raiz 1: " + r1);
                System.out.println("Raiz 2: " + r2);
            }
        }
        scanner.close();
    }
}