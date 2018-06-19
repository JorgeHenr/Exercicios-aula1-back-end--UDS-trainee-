import java.util.Scanner;

public class RegiaoProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o código do produto:");
        int Regioes = scanner.nextInt();

        switch (Regioes){
            case 1 :
                System.out.println ("Produto de região Sul");
                break;
            case 2 :
                System.out.println ("Produto de região Norte");
                break;
            case 3 :
                System.out.println ("Produto de região Leste");
                break;
            case 4 :
                System.out.println ("Produto de região Oeste");
                break;
            case 5 :
            case 6 :
                System.out.println ("Produto de região Nordeste");
                break;
            case 7 :
            case 8 :
            case 9 :
                System.out.println ("Produto de região Sudeste");
                break;
            case 10 :
                System.out.println ("Produto de região Centro-Oeste");
                break;
            case 11 :
                System.out.println ("Produto de região Noroeste");
                break;
            default:
                System.out.println ("Produto Importado");
        }
    }
}