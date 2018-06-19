import java.util.Scanner;

public class Inteiro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        Double numero = scanner.nextDouble();

        if (numero % 1 == 0) {
            System.out.println("Número inteiro");
        } else {
            System.out.println("Número não é inteiro");
        }
    }
}

