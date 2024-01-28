import java.util.Scanner;

public class Q02 {
    public static void main(String[] args){
        System.out.println("Digite três números reais:");
        Scanner scanner = new Scanner(System.in);
        float f1, f2, f3;
        f1 = scanner.nextFloat();
        f2 = scanner.nextFloat();
        f3 = scanner.nextFloat();
        float soma = f1 + f2 + f3;
        float media = (f1 + f2 + f3)/3;
        System.out.println("A soma dos números digitados é " + soma + " e a média é " + media + ".");
        scanner.close();
    }
}
