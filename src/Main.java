import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String nome = "Cristiano Ronaldo";
        double saldo = 1548.90;

        System.out.println("***********************");
        System.out.println("Bem vindo " + nome + "\n Seu saldo é " + saldo);
        System.out.println("***********************");

       String menu=("""
                    _________________________________
                    Digite sua opção:
                    1 - Consultar Saldo
                    2 - Transferir valor
                    3 - Receber valor
                    4 - Sair
                    _________________________________
                """);

        Scanner leitura= new Scanner(System.in);
        int opcao=0;

        while ( opcao != 4) {
             System.out.println(menu);
             opcao=leitura.nextInt();

             if (opcao == 1 ){
                 System.out.println("Seu saldo é de "+ saldo);
             }else if(opcao==2){
                 System.out.println("Qual o valor que você deseja transferir?");
                 double valor = leitura.nextDouble();
                 if (valor>saldo){
                     System.out.println("Saldo insuficiente!");
                 }else{
                     saldo -= valor;
                     System.out.println("Valor Transferido!");
                 }
            } else if (opcao==3) {
                 System.out.println("Qual o valor que você deseja receber?");
                 double valor = leitura.nextDouble();
                 saldo+=valor;
             }


        }
    }
}