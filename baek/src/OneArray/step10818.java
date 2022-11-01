package OneArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class step10818 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		
		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine()+" ");
		
		int[] arr = new int[n];
		
		
		
		for(int i = 0; i <arr.length; i++){
			
			arr[i] = Integer.parseInt(st.nextToken());
			
			
		}
		Arrays.sort(arr);
		System.out.println(arr[0]+" "+arr[n-1]);
		br.close();
		
	}
	
	

}
