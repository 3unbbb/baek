package 기본수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class problem2869 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		double a = Integer.parseInt(st.nextToken());
		double b = Integer.parseInt(st.nextToken());
		double v = Integer.parseInt(st.nextToken());
		
		double n = 0.0;
		int n1 = 0;
		
		if(a>b){
		n = v/(a-b);
			if(n%1 == 0){
				n = n-1;
				System.out.println((int)n);
			}else{
				n1 = (int) Math.ceil(n);
				System.out.println(n1);
			}
		}
		
	}

}
