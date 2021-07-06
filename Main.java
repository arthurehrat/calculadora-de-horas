import java.util.Locale;
import java.util.Scanner;

/**
 * @author ARTHUR EHRAT
 *
 */
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner jj = new Scanner(System.in);
		
		String g, y,z,x;
		
		System.out.println("Digite ?");
		
		x = jj.nextLine();
	    System.out.println("Digite outra ");  
		y = jj.nextLine();		
		System.out.println("ponha gaga"); 
		z = jj.nextLine();
		
	System.out.println("Você digitou : " );
System.out.println(x);
System.out.println(y);
System.out.println(z);


	
jj.close();		
	}

}
