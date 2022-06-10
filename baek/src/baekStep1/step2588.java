package baekStep1;

import java.util.Scanner;

public class step2588 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		
		System.out.println((b%10)*a);
		System.out.println(((b/10)%10)*a);
		System.out.println(b/100*a);		
		
		System.out.println(((b%10)*a)+(((b/10)%10)*a)*10+(b/100*a)*100);
	}

}
