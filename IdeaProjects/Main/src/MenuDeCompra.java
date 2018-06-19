import java.util.Scanner;

public class MenuDeCompra {
    public static void main(String[] args) {
        Boolean sair = false;
        Integer saldo = 1500;
        Scanner scanner = new Scanner(System.in);

        while(sair != true) {
            System.out.println("Seu saldo: " + saldo);
            System.out.println("MENU");
            System.out.println("[1] Pistolas");
            System.out.println("[2] Pesadas");
            System.out.println("[3] Submetralhadoras");
            System.out.println("[4] Rifles");
            System.out.println("[5] Diversos");
            System.out.println("[0] Sair");
            int menu = scanner.nextInt();
            int produto = 0;

            switch (menu) {
                case 1:
                    System.out.println("Pistolas");
                    System.out.println("[1] USP R$ 210");
                    System.out.println("[2] Glock R$ 200");
                    System.out.println("[3] Desert Eagle R$ 700");
                    System.out.println("[4] P250 R$ 300 ");
                    System.out.println("[5] CZ - 75 R$ 400");
                    System.out.println("[0] Voltar");
                    produto = scanner.nextInt();

                break;

                case 2:
                    System.out.println("Pesadas");
                    System.out.println("[1] Shotgun R$ 500");
                    System.out.println("[2] Shotgun Auto R$ 700");
                    System.out.println("[3] M-249 R$ 1200");
                    System.out.println("[4] M-2449 R$ 1250");
                    System.out.println("[5] Negev R$ 900");
                    System.out.println("[0] Voltar");
                    int produto2 = scanner.nextInt();
                    break;

                    switch (produto) {
                        case 1:
                            saldo -= 210;
                            System.out.println("Comprou uma USP por R$ 210");
                            break;
                        case 2:
                            saldo -= 200;
                            System.out.println("Comprou uma Glock por R$ 200");
                            break;
                        case 3:
                            saldo -= 700;
                            System.out.println("Comprou uma Desert Eagle  por R$ 700");// QUE OTA?
                            break;
                        case 4:
                            saldo -= 300;
                            System.out.println("Comprou uma P250 por R$ 300");
                            break;
                        case 5:
                            saldo -= 400;
                            System.out.println("Comprou uma  CZ - 75 por R$ 400");
                            break;
                        default:
                            produto = 0;
                    }
                switch (produto2) {
                    case 1:
                        saldo -= 210;
                        System.out.println("Shotgun R$ 500");
                        break;
                    case 2:
                        saldo -= 200;
                        System.out.println("Comprou uma Glock por R$ 200");
                        break;
                    case 3:
                        saldo -= 700;
                        System.out.println("Comprou uma Desert Eagle  por R$ 700");// QUE OTA?
                        break;
                    case 4:
                        saldo -= 300;
                        System.out.println("Comprou uma P250 por R$ 300");
                        break;
                    case 5:
                        saldo -= 400;
                        System.out.println("Comprou uma  CZ - 75 por R$ 400");
                        break;
                    default:
                        produto = 0;




                    break;
                default:
                    sair = true;
                    break;
            }
        }

//        System.out.println("MENU");
//        System.out.println("[1] Pistolas");
//        System.out.println("[2] Pesadas");
//        System.out.println("[3] Submetralhadoras");
//        System.out.println("[4] Rifles");
//        System.out.println("[5] Diversos");
//        int menu = scanner.nextInt();
//        switch (menu){
//            case 1 :
//                System.out.println("Pistolas");
//                System.out.println("[1] USP R$ 210");
//                System.out.println("[2] Glock R$ 200");
//                System.out.println("[3] Desert Eagle R$ 700");
//                System.out.println("[4] P250 R$ 300 ");
//                System.out.println("[5] CZ - 75 R$ 400");
//                System.out.println("[0] Voltar");
//                break;
//            case 2 :
//                System.out.println("Pesadas");
//                System.out.println("[1] Shotgun R$ 500");
//                System.out.println("[2] Shotgun Auto R$ 700");
//                System.out.println("[3] M-249 R$ 1200");
//                System.out.println("[0] Voltar");
//                break;
//            case 3 :
//                System.out.println("Submetralhadoras");
//                System.out.println("[1] Micro Uzi R$ 300");
//                System.out.println("[2] UMP 45 R$ 350");
//                System.out.println("[3] P-90 R$ 700");
//                System.out.println("[0] Voltar");
//                break;
//            case 4 :
//                System.out.println("Rifles");
//                System.out.println("[1] M4A4 R$ 950");
//                System.out.println("[2] AK 47 R$ 900");
//                System.out.println("[3] AWP R$ 1300");
//                System.out.println("[4] AUG R$ 800");
//                System.out.println("[5] FAMAS R$ 850");
//                System.out.println("[0] Voltar");
//                break;
//            case 5 :
//                System.out.println("Diversos");
//                System.out.println("[1] Granada de Fragmentação R$ 100");
//                System.out.println("[2] Granada de Fumaça R$ 100");
//                System.out.println("[3] Colete + Capacete R$ 200");
//                System.out.println("[3] TEASER R$ 250");
//                System.out.println("[3] MOLOTOV R$ 400");
//                System.out.println("[0] Voltar");
//                break;
//        }
    }
}