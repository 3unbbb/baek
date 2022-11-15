package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class problem2751 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> array = new ArrayList<>();
		
		for(int i =0; i<n;i++){
			array.add(Integer.parseInt(br.readLine()));
		}
	
		Collections.sort(array);
		
		for(int value : array){
			sb.append(value).append("\n");
		}
		
		System.out.println(sb);

	}

}
