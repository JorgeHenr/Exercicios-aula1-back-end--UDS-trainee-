import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um número:");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Número Par");
        } else {
            System.out.println("Número Ímpar:");
        }
    }
}
