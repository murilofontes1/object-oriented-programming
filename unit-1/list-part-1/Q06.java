import java.util.Scanner;

public class Q06 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int n1 = 0, n2 = 0, n3 = 0, menor = 0;
        n1 = scanner.nextInt();
        System.out.println("Digite o segundo número:");
        n2 = scanner.nextInt();
        System.out.println("Digite o terceiro número:");
        n3 = scanner.nextInt();
        scanner.close();
        if (n1 > menor){
            menor = n1;
        }
        if (n2 > menor){
            menor = n2;
        }
        if (n3 > menor){
            menor = n3;
        }
        System.out.println("O maior número digitado foi " + menor + ".");
    }
}
