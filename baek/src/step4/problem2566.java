package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class problem2566 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int [][] arr = new int[9][9];
		
		
		for(int i=0;i<9;i++){
			
			st = new StringTokenizer(br.readLine()+" ");
			
			for(int j=0;j<9;j++){
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int max = 0;
		int x = 0;
		int y = 0;
		
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				if(arr[i][j] > max){
					max = arr[i][j];
					x = i;
					y=j;
				}
			}
		}
		
		System.out.println(max);
		System.out.println((x+1)+" "+(y+1));
		
	}

}
