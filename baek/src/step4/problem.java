package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class problem {

	public static void main(String[] args) throws IOException {
		

		int n = 4;
		int[] arr = new int[n];
		arr[0]=4;
		arr[1]=1;
		arr[2]=3;
		arr[3]=2;
		
		        boolean answer = true;

		        n = arr.length;

		        ArrayList arr1 = new ArrayList<>();
		        ArrayList arr2 = new ArrayList<>();
		        
		        for(int i =1; i<=arr.length; i++ ){
		           arr1.add(i);
		           arr2.add(arr[i-1]);
		           
		        }
		        
		        Collections.sort(arr2);
		        System.out.println(arr1);
		        System.out.println(arr2);
		        
		        answer = arr1.containsAll(arr2);
		        
		        System.out.println(answer);
		 
		    }

		


}
