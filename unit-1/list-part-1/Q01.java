import java.util.Scanner;

public class Q01 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do lado do quadrado:");
        float l = scanner.nextFloat();
        float area = l*l;
        System.out.println("A área do quadrado de lado " + l + " é " + area + ".");
        scanner.close();
    }   
}
