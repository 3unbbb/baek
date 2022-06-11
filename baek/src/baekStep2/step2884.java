package baekStep2;

import java.util.Scanner;

public class step2884 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if(m-45<0 && h-1<0){
			System.out.print(24+h-1+" ");
			System.out.println(m+60-45);
		}else if(m-45<0 &&h-1>0){
			System.out.print(h-1+" ");
			System.out.println(m+60-45);
		}else if(m-45<0 && h-1==0){
			System.out.print(h-1+" ");
			System.out.println(m+60-45);
		}else{
			System.out.print(h+" ");
			System.out.println(m-45);
		}
		
		
	}

}
