import java.util.Scanner;

public class DoisNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();
        String calculo = scanner.next();

        switch (calculo) {
            case "+":
                System.out.println(n1 + n2);
                break;
            case "-":
                System.out.println(n1 - n2);
                break;
            case "*":
                System.out.println(n1 * n2);
                break;
            case "/":
                if (n2 != 0) {
                    System.out.println(n1 / n2);
                } else {
                    System.out.println("Erro: Divisão por zero.");
                }
                break;
            case "^":
                System.out.println(Math.pow(n1, n2));
                break;
            default:
                System.out.println("Símbolo inválido.");
        }
        scanner.close();
    }
}