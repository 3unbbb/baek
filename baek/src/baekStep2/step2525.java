package baekStep2;

import java.util.Scanner;

public class step2525 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if ((b+c)/60>=1){
			if(a+(b+c)/60>=24){
				System.out.println((a+(b+c)/60)-24+" "+((b+c)%60));
			}else{
				System.out.println((a+(b+c)/60)+" "+((b+c)%60));
			}
		}else if((b+c)/60<1){
			System.out.println(a+" "+(b+c));
		}
		
		
		
	}

}
