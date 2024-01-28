import java.util.Scanner;

public class Q08 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o código do setor:");
    int setor = 0;
    setor = scanner.nextInt();
    if((setor != 111) && (setor != 222)){
        System.out.println("Setor inválido.");
        scanner.close();
    }
    else if((setor == 111) || (setor == 222)){
        System.out.println("Digite o valor original do produto:");
        float preco = 0;
        preco = scanner.nextFloat();
        scanner.close();
            if((setor == 222) && (preco > 500)){
                System.out.println("Setor: Eletros (Cód. " + setor + ") | Preço com desconto (10%): " + (preco * 0.9));
            }
            else if(setor == 222){
                    System.out.println("Setor: Eletros (Cód. " + setor + " | Preço: " + preco);
            }
            else if((setor == 111) && (preco > 100)){
                System.out.println("Setor: Cama, mesa e banho (Cód. " + setor + ") | Preço com desconto (40%): " + (preco * 0.6));
            }
            else if((setor == 111) && ((preco >= 50) && (preco <= 100))){
                System.out.println("Setor: Cama, mesa e banho (Cód. " + setor + ") | Preço com desconto (20%): " + (preco * 0.8));
            }
            else{
                System.out.println("Setor: Cama, mesa e banho (Cód. " + setor + ") | Preço com desconto (10%): " + (preco * 0.9));
            }
        }
    }
}