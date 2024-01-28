import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        System.out.println("Digite um número de 3 dígitos no formato CDU:");
        Scanner scanner = new Scanner(System.in);
        int CDU = scanner.nextInt();
        int U = 100 * (CDU % 10);
        CDU = CDU/10;
        int D = CDU % 10;
        CDU = CDU/10;
        int C = 10 * (CDU % 10);
        System.out.println(U + C + D);
        scanner.close();
    }
}
