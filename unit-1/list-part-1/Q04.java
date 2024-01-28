import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        System.out.println("Insira uma temperatura em graus centígrados:");
        Scanner scanner = new Scanner(System.in);
        float grauCentigrado = scanner.nextFloat();
        float grauFahrenheit = (grauCentigrado * 2) + 30;
        System.out.println(grauCentigrado + "°C são " + grauFahrenheit + "°F.");
        scanner.close();
    }
}
