import java.util.Scanner;

public class MaquinaVendas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double v_Compra = scanner.nextDouble();
        double v_Pagamento = scanner.nextDouble();

        if (v_Pagamento < v_Compra) {
            System.out.println("Valor insuficiente para realizar a compra.");
        } else {
            int v_Troco = (int) (v_Pagamento - v_Compra);
            System.out.println("Troco: R$ " + v_Troco + ",00");

            int[] notas = {50, 20, 10, 5, 2, 1};
            for (int nota : notas) {
                int n_Notas = v_Troco / nota;
                v_Troco %= nota;
                System.out.println("Notas de R$ " + nota + ",00: " + n_Notas);
            }
        }
        scanner.close();
    }
}