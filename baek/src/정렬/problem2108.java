package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class problem2108 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> arr = new ArrayList<>();
		
		
		for(int i =0; i<n;i++){
			arr.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(arr);
		System.out.println(arr);
	
		double sum = 0.0;
		for(int i=0;i<arr.size();i++){
			sum += arr.get(i);
		}
		
		System.out.println(Math.round(sum/(arr.size()*1.0)));
		
		int mid = (int)Math.round(arr.size()/2.0);
		System.out.println(arr.get(mid-1));
		
		for(int i=0;i<arr.size();i++){
			arr.get(i) ;
		}
		
		
		int max = Collections.max(arr);
		int min = Collections.min(arr);
		
		System.out.println(max-min);
		
	}

}
