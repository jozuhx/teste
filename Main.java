
import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
 	System.out.println("Deseja criar uma conta? [Sim/Não]");
 	String escolha = sc.nextLine();
if (escolha.equalsIgnoreCase("Sim")) {
System.out.println("Crie um nome de usuário:");
String nome = sc.nextLine();

System.out.println("Idade:");
int idade = sc.nextInt();
	int idadeMinima = 13;
	
	if (idade < idadeMinima) {
		System.out.println("Idade abaixo do requerido");
		System.exit(0);
	}

System.out.println("Conta criada com sucesso!");
System.out.println("Informações da conta:");
System.out.println("Nome:" + nome);
System.out.println("Idade:" + idade);
} else if(escolha.equalsIgnoreCase("Não")) {
System.out.println("Obrigado pelo seu tempo!");
 	System.exit(0);
} else {
System.out.println("Opção inválida");
	//fazer um looping para a escolha de sim ou não
}
 		sc.close();
 	}
 }