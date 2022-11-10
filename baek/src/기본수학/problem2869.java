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
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		
		//낮에 정상까지 오르면 떨어지는 값은 필요없으니까 v-b
		int day = (v-b)/(a-b);

		
		if((v-b)%(a-b)!= 0){
			day++;
			
		}
		
		System.out.println(day);
			

		
	}

}
