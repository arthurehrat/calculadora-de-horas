import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double x,y , result;
		String z;
		System.out.println("Calculadora de Horas Trabalhadas");
		System.out.println("Nome:");
		z = sc.nextLine();
		System.out.println("Qual valor por hora trabalhada?");
		x = sc.nextInt();
		System.out.println("Quantas horas foram trabalhadas?");
		y = sc.nextInt();
		
		result = y*x;
		
		System.out.printf(z+" tem Saldo de:\n R$"+result);
		
		
		
	sc.close();
	}

}
