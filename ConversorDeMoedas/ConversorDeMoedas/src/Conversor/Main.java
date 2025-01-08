package Conversor;



import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Conversor conversor = new Conversor();
        Scanner sc = new Scanner(System.in);
        int num = 0;
        while(num!=7){
            System.out.println("Seja bem-vindo ao Conversor de Moedas!");
            System.out.println();
            System.out.println("""
                    1) Dolar >> Peso Argentino\s
                    2) Peso argentino >> Dolar\s
                    3) Dolar >> Real Brasileiro\s
                    4) Real Brasileiro >> Dolar\s
                    5) Dolar >> Peso Colombiano\s
                    6) Peso Colombiano >> Dolar\s
                    7) Sair""");
            System.out.println();
            num = sc.nextInt();
            if (num == 1) {
                System.out.println("Digite o valor que deseja converter: ");
                double qtd = sc.nextDouble();
                conversor.DolarParaARS(qtd);
            } else if (num == 2) {
                System.out.println("Digite o valor que deseja converter: ");
                double qtd = sc.nextDouble();
                conversor.ARSParaDolar(qtd);
            } else if (num == 3) {
                System.out.println("Digite o valor que deseja converter: ");
                double qtd = sc.nextDouble();
                conversor.DolarParaBRL(qtd);
            } else if (num == 4) {
                System.out.println("Digite o valor que deseja converter: ");
                double qtd = sc.nextDouble();

                conversor.BrlParaDolar(qtd);
            } else if (num == 5) {
                System.out.println("Digite o valor que deseja converter: ");
                double qtd = sc.nextDouble();
                conversor.DolarParaCop(qtd);
            } else if (num == 6) {
                System.out.println("Digite o valor que deseja converter: ");
                double qtd = sc.nextDouble();
                conversor.CoPParaDolar(qtd);
            } else if (num == 7) {
                System.out.println("Finalizando...");
            } else {
                System.out.println("Opção inválida.");
            }


        }
    }
}