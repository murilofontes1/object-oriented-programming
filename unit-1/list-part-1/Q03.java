import java.util.Scanner;
import java.lang.Math;

public class Q03 {
    public static void main(String[] args){
        System.out.println("Insira um ângulo em graus:");
        Scanner scanner = new Scanner(System.in);
        float angulo = scanner.nextFloat();
        System.out.println(angulo + "° são " + Math.toRadians(angulo) + " radianos.");
        scanner.close();
    }
}
