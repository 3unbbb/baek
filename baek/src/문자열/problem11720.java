package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem11720 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String str = br.readLine();
		
		String[] arr = str.split("");
		
		int sum = 0;
		for(int i=0;i<n;i++){
			sum += Integer.parseInt(arr[i]);
			
		}
		
		System.out.println(sum);
		
		
	}

}
