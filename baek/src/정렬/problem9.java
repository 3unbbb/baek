package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class problem9 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++){
			
			st = new StringTokenizer(br.readLine());
			
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		int temp = 0;
		
		for(int i=1;i<arr.length;i++){
			for(int j=i;j>0;j--){
				if(arr[j-1]>arr[j]){
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
				
			}
		}
		
		for(int i=0;i<n;i++){
			System.out.println(arr[i]);
		}
	}

}
