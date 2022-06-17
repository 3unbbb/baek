package baekStep3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class step11022 {
	public static void main(String[] args) throws NumberFormatException, IOException {

	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	StringTokenizer st;
	
	int n = Integer.parseInt(br.readLine());
	
	for(int i = 1; i<=n; i++){
			st = new StringTokenizer(br.readLine()," ");
			int st1 = Integer.parseInt(st.nextToken());
			int st2 = Integer.parseInt(st.nextToken());
			
			bw.write("Case #"+i +": "
					+st1
					+" + " + st2
					+" = " + (st1+st2)+"\n");
			
		}
	
	br.close();
	bw.flush();
	bw.close();
	}
	
}
