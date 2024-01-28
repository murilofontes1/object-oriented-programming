import java.util.Scanner;

public class Q06{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um intervalo em minutos:");
        int intervalo = 0;
        intervalo = scanner.nextInt();
        if(intervalo <= 60){
            System.out.println(intervalo + " minutos = 0 dias, 0 horas e " + intervalo + " minutos");
        }
        else if((intervalo > 60) && (intervalo < 1440)){
            int horas = 0, minutos = 0;
            horas = intervalo/60;
            minutos = intervalo%60;
            System.out.println(intervalo + " minutos = 0 dias, " + horas + " horas e " + minutos + " minutos");

        }
        else if(intervalo >= 1440){
            int dias = 0, horas = 0, minutos = 0;
            dias = intervalo/1440;
            horas = (intervalo%1440)/60;
            minutos = (intervalo%1440)%60;
            System.out.println(intervalo + " minutos = " + dias + " dias, " + horas + " horas e " + minutos + " minutos");
        }
        scanner.close();
    }
}