package application;
import java.util.Scanner;
public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bom dia!");
		System.out.println("Boa tarde!");
		System.out.println("Boa noite!");
		Integer n = 3, m = 3;
		int vect [] [] = new int [n] [m];
		
		for(Integer i = 0; i < n; i ++) {
			for(Integer j = 0; j < m; j ++) {
				vect [i] [j] = sc.nextInt();
			}
		}
		
		
		
	}

}
