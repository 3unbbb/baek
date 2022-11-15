package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem2587 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[5];
		
		for(int i =0; i<5;i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int temp = 0;		
		
		for(int i=0; i<arr.length;i++){
			for(int j=i;j>0;j--){
				if(arr[j-1]>arr[j]){
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		int sum = 0;
		for(int i=0;i<arr.length;i++){
			sum += arr[i];
		}
		
		System.out.println(sum/5);
		System.out.println(arr[2]);
	}

}
