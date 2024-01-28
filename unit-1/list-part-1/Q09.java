import java.util.Scanner;

public class Q09 {
    public static void main(String[] args){
        int valor = 0, naipe = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número de um a treze:");
        valor = scanner.nextInt();
        if(valor > 13){
            System.out.println("Número inválido.");
        }
        System.out.println("Digite um número de um a quatro:");
        naipe = scanner.nextInt();
        if(naipe > 4){
            System.out.println("Número inválido.");
        }
        switch (valor) {
            case 1:
                switch (naipe) {
                    case 1:
                        System.out.println("Ás de ouros");
                        break;
                    case 2:
                        System.out.println("Ás de paus");
                        break;
                    case 3:
                        System.out.println("Ás de copas");
                        break;
                    case 4:
                        System.out.println("Ás de espadas");
                        break;
                    default:
                        break;
                }
                break;
            case 2:
            switch (naipe) {
                case 1:
                    System.out.println("Dois de ouros");
                    break;
                case 2:
                    System.out.println("Dois de paus");
                    break;
                case 3:
                    System.out.println("Dois de copas");
                    break;
                case 4:
                    System.out.println("Dois de espadas");
                    break;
                default:
                    break;
            }
            break;
            case 3:
            switch (naipe) {
                case 1:
                    System.out.println("Três de ouros");
                    break;
                case 2:
                    System.out.println("Três de paus");
                    break;
                case 3:
                    System.out.println("Três de copas");
                    break;
                case 4:
                    System.out.println("Três de espadas");
                    break;
                default:
                    break;
            }
            break;     
            case 4:
            switch (naipe) {
                case 1:
                    System.out.println("Quatro de ouros");
                    break;
                case 2:
                    System.out.println("Quatro de paus");
                    break;
                case 3:
                    System.out.println("Quatro de copas");
                    break;
                case 4:
                    System.out.println("Quatro de espadas");
                    break;
                default:
                    break;
            }
            break;   
            case 5:
            switch (naipe) {
                case 1:
                    System.out.println("Cinco de ouros");
                    break;
                case 2:
                    System.out.println("Cinco de paus");
                    break;
                case 3:
                    System.out.println("Cinco de copas");
                    break;
                case 4:
                    System.out.println("Cinco de espadas");
                    break;
                default:
                    break;
            }
            break; 
            case 6:
            switch (naipe) {
                case 1:
                    System.out.println("Seis de ouros");
                    break;
                case 2:
                    System.out.println("Seis de paus");
                    break;
                case 3:
                    System.out.println("Seis de copas");
                    break;
                case 4:
                    System.out.println("Seis de espadas");
                    break;
                default:
                    break;
            }
            break;   
            case 7:
            switch (naipe) {
                case 1:
                    System.out.println("Sete de ouros");
                    break;
                case 2:
                    System.out.println("Sete de paus");
                    break;
                case 3:
                    System.out.println("Sete de copas");
                    break;
                case 4:
                    System.out.println("Sete de espadas");
                    break;
                default:
                    break;
            }
            break; 
            case 8:
            switch (naipe) {
                case 1:
                    System.out.println("Oito de ouros");
                    break;
                case 2:
                    System.out.println("Oito de paus");
                    break;
                case 3:
                    System.out.println("Oito de copas");
                    break;
                case 4:
                    System.out.println("Oito de espadas");
                    break;
                default:
                    break;
            }
            break;
            case 9:
            switch (naipe) {
                case 1:
                    System.out.println("Nove de ouros");
                    break;
                case 2:
                    System.out.println("Nove de paus");
                    break;
                case 3:
                    System.out.println("Nove de copas");
                    break;
                case 4:
                    System.out.println("Nove de espadas");
                    break;
                default:
                    break;
            }
            break;  
            case 10:
            switch (naipe) {
                case 1:
                    System.out.println("Dez de ouros");
                    break;
                case 2:
                    System.out.println("Dez de paus");
                    break;
                case 3:
                    System.out.println("Dez de copas");
                    break;
                case 4:
                    System.out.println("Dez de espadas");
                    break;
                default:
                    break;
            }
            break;
            case 11:
            switch (naipe) {
                case 1:
                    System.out.println("Valete de ouros");
                    break;
                case 2:
                    System.out.println("Valete de paus");
                    break;
                case 3:
                    System.out.println("Valete de copas");
                    break;
                case 4:
                    System.out.println("Valete de espadas");
                    break;
                default:
                    break;
            }
            break;
            case 12:
            switch (naipe) {
                case 1:
                    System.out.println("Dama de ouros");
                    break;
                case 2:
                    System.out.println("Dama de paus");
                    break;
                case 3:
                    System.out.println("Dama de copas");
                    break;
                case 4:
                    System.out.println("Dama de espadas");
                    break;
                default:
                    break;
            }
            break;
            case 13:
            switch (naipe) {
                case 1:
                    System.out.println("Rei de ouros");
                    break;
                case 2:
                    System.out.println("Rei de paus");
                    break;
                case 3:
                    System.out.println("Rei de copas");
                    break;
                case 4:
                    System.out.println("Rei de espadas");
                    break;
                default:
                    break;
            }
            break;
            default:
                break;
        }
        scanner.close();
    }
}
