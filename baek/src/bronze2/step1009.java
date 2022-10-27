package bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class step1009 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		long[] arr = new long[n];
		for(int i=0;i<n;i++){
			st= new StringTokenizer(br.readLine()+" ");
			int st1 = Integer.parseInt(st.nextToken());
			int st2 = Integer.parseInt(st.nextToken());
				int a=st1%10;
				for(int j=1;j<st2;j++){
					a=(a*st1)%10;
				}
				arr[i]=a;

		}
		for(int i=0;i<n;i++){
			int computer = (int)arr[i]%10;
			if(computer == 0){
				computer = 10;
			}
			System.out.println(computer);
		}

	}

}
