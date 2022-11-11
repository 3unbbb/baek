package 기본수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problen2775 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		int k = 0;
		int n = 0;
		
		
		int[][] arr = new int[15][15];
		
		for(int i=0;i<15;i++){
			arr[i][1] = 1;
			arr[0][i] = i;
		}
		
			for(int y=1;y<15;y++){
				for(int x=2;x<15;x++){

					arr[y][x] = arr[y-1][x]+arr[y][x-1];
				}
			}
		
		for(int i=0;i<t;i++){
			
			k = Integer.parseInt(br.readLine());
			n = Integer.parseInt(br.readLine());
			
			sb.append(arr[k][n]).append("\n");
		}

		System.out.println(sb);
	}

}
