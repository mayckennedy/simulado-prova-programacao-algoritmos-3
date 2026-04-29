import java.util.Scanner;

public class PadariaSrPaiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("Digite a opção para iniciar o atendimento:");
            System.out.println("Opção ( 0): sair;");
            System.out.println("Opção ( 1): iniciar compra;");
            System.out.println("Opção ( 2): Consultar valor do produto:");
            opcao = sc.nextInt();
            if ( opcao == 0){
                System.out.println("Obrigado pela visita. Volte sempre");
                System.out.println("-----------------");
            }      
            else{

            


            System.out.println("Digite seu nome:");
            String nome = sc.nextLine();
            sc.nextLine();

            System.out.print(" O caixa aceia apenas notas de R$50, R$20, R$10, R$05, R$02:");

            System.out.println("Qual o valor do produto");
            double compra = sc.nextDouble();

            System.out.println("Qual o valor pago:");
            double pagamento = sc.nextDouble();

            double troco = pagamento - compra;

            if (pagamento < compra){
                System.out.println("Valor isuficiente para realizar a compra.");
            } else {

            System.out.println("Troco: R$" + troco);
             double n50 = troco / 50;
             troco = troco % 50;

             double n20 = troco / 20;
             troco = troco % 20;

             double n10 = troco / 10;
             troco = troco % 10;

             double n05 = troco / 05;
             troco = troco % 05;

             double n02 = troco / 02;
             troco = troco % 02;
             
             

             System.out.println("notas de R$50:" + n50);
             System.out.println("notas de R$20:" + n20);
             System.out.println("notas de R$10:" + n10);
             System.out.println("notas de R$05:" + n05);
             System.out.println("notas de R$02:" + n02);

             System.out.println("Dados para NF" + nome + pagamento + troco);
            

        
        }
    }
} while (opcao == 0);
        System.out.println("Obrigado pela visita");
        System.out.println("volte sempre!");


        

        sc.close();

                   
    }
}
