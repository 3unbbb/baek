package baekStep3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class step2439 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=1;i<=n;i++){
			for(int k=n;k>i;k--){
			bw.write(" ");
			}
			for(int j=1;j<=i;j++){
				bw.write("*");
			}
			bw.newLine();
		}
		
		
		br.close();
		bw.flush();
		bw.close();
		

	}

}
