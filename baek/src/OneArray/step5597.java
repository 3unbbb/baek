package OneArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class step5597 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	int arr[] = new int[28];
	
	for(int i=0;i<28;i++){
		arr[i]= Integer.parseInt(br.readLine());
	}
	
	int arr2[] = new int[30];
	for(int i=0;i<30;i++){
		arr2[i]=i+1;
				
	}
	
	for(int i=0;i<30;i++){
		for(int j=0;j<28;j++){
			if(arr2[i] == arr[j]){
				arr2[i] = 0;
			}
		}
	}
	
	Arrays.sort(arr2);
	System.out.println(arr2[28]);
	System.out.println(arr2[29]);
	
	}

}
