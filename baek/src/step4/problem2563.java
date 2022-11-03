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
		int [][] section = new int[n][2];
		int [][] arr = new int[100][100];
		
		for(int i=0;i<n;i++){
			
			st = new StringTokenizer(br.readLine()+" ");
			
			for(int j=0;j<2;j++){
				section[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=0;i<n;i++){
			int x = section[i][0]-1;
			int y = section[i][1]-1;
			int x1 = section[i][0]+9;
			int y1 = section[i][1]+9;
			
			for(int t=x;t<x1;t++){
				
				y=section[i][1]-1;
				for(int j=y;j<y1;j++){
					arr[x][y] = 1;
					y++;
					
					}
				x++;
				}
		}
		int cnt = 0;
		for(int i=0;i<100;i++){
			for(int j=0;j<100;j++){
				if(arr[i][j] == 1){
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);

	}

}
