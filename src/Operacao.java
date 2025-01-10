import java.util.Scanner;

public class Operacao{
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Digite as horas atual nesse formato Ex: 12.00");
            double horas = scan.nextDouble();

            if (horas > 00 && horas < 12.00) {
                System.out.println("Bom dia");
            }else if (horas > 12.00 && horas < 18.00 ){
                System.out.println("Boa tarde");
            }else if (horas > 18.00 && horas < 23.59) {
                System.out.println("Boa noite");
            }else{
                System.out.println("Você não digitou a hora corretamente");
            }
        }

    }
} 
