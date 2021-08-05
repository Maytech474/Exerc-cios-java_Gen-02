package Exjava02;
import java.util.Scanner;
public class Exjava01 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("Digite três números: ");
		n1 = ler.nextInt();
		n2 = ler.nextInt();
		n3 = ler.nextInt();
		
		if(n1 > n2 && n1 > n3) {
			System.out.println("O maior número é: " +n1);
		}
		else if(n2 > n1 && n2 > n3) {
			System.out.println("O maior número é: " +n2);
		}
		else if(n3 > n1 && n3 > n2) {
			System.out.println("O maior número é: " +n3);
		}
	ler.close();
	}

}


	