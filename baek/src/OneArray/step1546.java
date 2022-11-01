package OneArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class step1546 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		double[] arr = new double[Integer.parseInt(br.readLine())];
		st = new StringTokenizer(br.readLine()+" ");
		
		for(int i=0;i<arr.length;i++){
			arr[i]=Double.parseDouble(st.nextToken());
		}
		
		Arrays.sort(arr);
		double max = arr[arr.length-1];
		double avg = 0;
		
		for(int i=0;i<arr.length;i++){
			arr[i] = arr[i]/max*100;
			avg += arr[i];
		}
		
		avg /= arr.length;
		
		System.out.println(avg);
		
	}

}
