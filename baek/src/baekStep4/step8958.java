package baekStep4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class step8958 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String[] arr = new String[n];
		
		for(int i=0; i<n; i++){
			arr[i]=br.readLine();
		}

		int[] result = new int[n];
		for(int j=0;j<arr.length; j++){
			String[] testcase = new String[arr[j].length()];
			testcase = arr[j].split("");
			
			int sum = 0;
			int cnt=0;
			int score = 0;
			
			Loop1:
			while(cnt<testcase.length){
				
				if(cnt==testcase.length){
					break Loop1;
				}
				
				if(testcase[cnt].equals("O")){
					score = 1;
					sum += score;
					cnt++;
					
					if(cnt==testcase.length){
						break Loop1;
					}
					
					for(;testcase[cnt].equals("O");){
						score += 1;
						cnt++;
						sum += score;
						
						if(cnt==testcase.length){
							break Loop1;
						}
					}
					
					if(cnt==testcase.length){
						break Loop1;
					}
					continue;
				}
				if(testcase[cnt].equals("X")){
						score = 0;
						cnt++;
						continue;
				}
			}
			
			result[j]=sum;
			
		}
		for(int i=0;i<result.length;i++)
		System.out.println(result[i]);
		
	}

}
