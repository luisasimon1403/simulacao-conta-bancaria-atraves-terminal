
//Conhecer e importar a classe Scanner

//Exibir as mensagens para o nosso usuário

//Obter pela classe Scanner os valores digitados no terminal

//Exibir a mensagem conta criada

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        // Criando o Scanner para ler entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita e lê o número da conta
        System.out.print("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir quebra de linha

        // Solicita e lê o número da agência
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        // Solicita e lê o nome do cliente
        System.out.print("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        // Solicita e lê o saldo
        System.out.print("Por favor, digite o saldo. Se houver centavos, separar com vírgula: ");
        double saldo = scanner.nextDouble();

        // Exibe mensagem final formatada
        System.out.println("Olá " + nomeCliente + 
            ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
            ", conta " + numero + 
            " e seu saldo " + saldo + " já está disponível para saque.");

        // Fechando o Scanner
        scanner.close();
    }
}

