package baekStep2;

import java.util.Scanner;

public class step14681 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x>0 && y>0){
			System.out.println(1);
		}else if(x>0 && y<0){
			System.out.println(4);
		}else if(x<0 && y>0){
			System.out.println(2);
		}else if(x<0 && y<0){
			System.out.println(3);
		}

	}

}