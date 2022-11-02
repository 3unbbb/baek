package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class problem2563 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		
		int [][] arr = new int[n][2];
		
		
		for(int i=0;i<n;i++){
			
			st = new StringTokenizer(br.readLine()+" ");
			
			for(int j=0;j<2;j++){
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int totalSize = n*10*10;
		
//		arr[0][0]-arr[1][0]		arr[0][1]-arr[1][1]
//		arr[1][0]-arr[2][0]		arr[1][1]-arr[2][1]
//		arr[2][0]-arr[0][0]		arr[2][1]-arr[0][1]
				
		for(int i=0;i<n;i++){
			int j = i+1;
			
			if(i==n-1){
				j=0;
			}
			
			int x = 10-Math.abs(arr[i][0]-arr[j][0]);
			int y = 10-Math.abs(arr[i][1]-arr[j][1]);
			
			if(x>0 && y>0){
			int section = x*y;
			System.out.println("section : "+section);
			
			totalSize -= section;
			System.out.println("totalSize : "+totalSize);
			}
		}
		
		System.out.println(totalSize);
	}

}
