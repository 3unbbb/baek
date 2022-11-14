package 기본수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem2839 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int x=0;
		int y=0;
		int y1 = 0;
		int x1 = 0;
		int result = 0;
		int cnt = 0;
		
		y=n/5;
		y1=n%5;
		
		System.out.println("y : "+y);
		System.out.println("y1 : "+y1);
		
		if(y==0){
			if(y1%3!=0){
				result = -1;
				System.out.println(result);
			}
			if(y1%3==0){
				x=y1/3;
				result = x+y;
				System.out.println(result);
			}
		}
		
		if(y !=0){
			for(int i=0;i<y+1;i++){
				x=y1/3;
				x1=y1%3;
				System.out.println("x : "+x);
				System.out.println("x1 : "+x1);

				if(x1 != 0){
					cnt++;
					y1+=5;
					System.out.println("y,y1 : "+y+","+y1);
				}
				

			}
			y-=cnt;
			result = x+y;
			
			if(y1 > n){
				result = -1;
			}
			
			System.out.println(result);
		}
		
		
	}

}
