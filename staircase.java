package sample;

import java.util.Scanner;

public class staircase {
	public static int scase(int a){
		int b = 0;
		while(a>=b+1) {
			a -= b+1;
			b++;
		}
		return b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int c = scase(a);
		System.out.println(c);
		

	}

	

}
