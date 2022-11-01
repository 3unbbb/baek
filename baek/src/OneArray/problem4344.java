package OneArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class problem4344 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String[] arr = new String[n];
			
			for(int i=0;i<n;i++){
				
				arr[i] = br.readLine();
				
			}
			
			for(int j=0;j<arr.length;j++){
				String[] x = arr[j].split(" ");
				
				int sn = Integer.parseInt(x[0]);
				int sum = 0;
				int cnt = 0;
				for(int i=1;i<=sn;i++){
					sum += Integer.parseInt(x[i]);
				}
				
				int avg = sum/sn;
				
				for(int i=1;i<=sn;i++){
					if(Integer.parseInt(x[i])>avg){
						cnt++;
					}
				}
				
				float rs = ((float)cnt/(float)sn)*100;
				String resultF = String.format("%.3f", rs);
				System.out.println(resultF+"%");
				
			}
		
	}

}
