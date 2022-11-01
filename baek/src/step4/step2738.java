package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class step2738 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine()+" ");
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		
		int[][] arr1 = new int[x][y];
		int[][] arr2 = new int[x][y];
		int[][] result = new int[x][y];
		
		for(int i=0;i<x;i++){
			st = new StringTokenizer(br.readLine()+" ");
			for(int j=0;j<y;j++){
				arr1[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=0;i<x;i++){
			st = new StringTokenizer(br.readLine()+" ");
			for(int j=0;j<y;j++){
				arr2[i][j] = Integer.parseInt(st.nextToken());
			}
		}
	
		for(int i=0;i<x;i++){
			for(int j=0;j<y;j++){
				result[i][j] = arr1[i][j] +arr2[i][j];
			}
		}
		
		for(int i=0;i<x;i++){
			for(int j=0;j<y;j++){
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
	
	
	}

}
