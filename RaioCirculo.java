import java.util.Scanner;

public class RaioCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operacao = scanner.nextInt();
        double raio = scanner.nextDouble();
        double pi = 3.141592;

        if (operacao == 1) {
            double perimetro = 2 * pi * raio;
            System.out.println("Perímetro do círculo: " + perimetro);
        } else if (operacao == 2) {
            double area = pi * Math.pow(raio, 2);
            System.out.println("Área do círculo: " + area);
        } else if (operacao == 3) {
            double volume = (4.0 / 3.0) * pi * Math.pow(raio, 3);
            System.out.println("Volume da esfera: " + volume);
        } else {
            System.out.println("Código da operação é inválido.");
        }
        scanner.close();
    }
}