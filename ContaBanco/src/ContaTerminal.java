import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    //Scanner para ler as entradas do usuário
    Scanner sc = new Scanner(System.in);
    //Fazer perguntas para o usuário e armazenar os dados
    System.out.println("Por favor, digite seu numero: ");
    int numero = Integer.parseInt(sc.nextLine());
    System.out.print("Por favor, digite sua agencia: ");
    String agencia = sc.nextLine();
    System.out.print("Por favor, digite seu nome: ");
    String nome = sc.nextLine();
    System.out.println("Por favor, digite seu saldo: ");
    double saldo = Double.parseDouble(sc.nextLine()); 
    
    //Mostrar as informações para o usuário
    System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo "+ saldo +" já está disponível para saque");
    sc.close();
    }
}
