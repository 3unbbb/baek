package baekStep4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class step2562 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[9];
		
		for(int i=0;i<9;i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int max = 0;
		int index = 0;
		
		for(int i=0; i<9; i++){
			if(arr[i]>max){
				max = arr[i];
				index = i+1;
			}
		}
		
		System.out.println(max);
		System.out.println(index);
		br.close();
	}

}
