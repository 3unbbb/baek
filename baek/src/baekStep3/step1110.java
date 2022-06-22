package baekStep3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class step1110 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int a = Integer.parseInt(br.readLine());
		int x = a;
		int cnt = 0;
		do{
			
			a = ((a%10)*10) + (((a%10) + (a/10))%10);
			
			cnt++;
			
			
			
		}while(x != a);
		
		System.out.println(cnt);
	br.close();
		
	}

}
