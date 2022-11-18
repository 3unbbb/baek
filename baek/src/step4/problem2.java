package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class problem2 {

	public static void main(String[] args) throws IOException {
		
		int[][] office = new int[][] { {5,-1,4}, {6,3,-1}, {2,-1,1} };
		int r=1;
		int c=0;
		String[] move = new String[] {"go","go","right","go","right","go","left","go"};
		
		        int answer = 0;

		        String[] way = new String[4];
		        way[0] = "북";
		        way[1] = "서";
		        way[2] = "남";
		        way[3] = "동";

		    String now_way = way[0];
		    for(int i=0; i<move.length; i++){
		    	System.out.println("i : " + i);
		    	System.out.println("office[r][c]"+r+","+c);
		    	
		    	if(office[r][c]==-1){
		    		answer = answer;
		    	}else{
		        answer += office[r][c];
		    	}
		        
		        office[r][c] = 0;
		        System.out.println("answer : " + answer);
		    	System.out.println("move[i] : "+move[i]);
		            if(move[i].equals("go")){
		            	System.out.println("go!");
		                if(now_way.equals("북")){
		                	System.out.println("북으로 go");
		                    r--;
		                    if(r < 0 || r>office.length){
		                    	r++;
		                    }
		                }
		                if(now_way.equals("서")){
		                	System.out.println("서로 go");
		                    c--;
		                    if(c < 0 || c>office.length){
		                    	c++;
		                    }
		                }
		                if(now_way.equals("남")){
		                	System.out.println("남으로 go");
		                    r++;
		                    if(r > office[0].length || r<0){
		                    	r--;
		                    }
		                }
		                if(now_way.equals("동")){
		                	System.out.println("동으로 go");
		                    c++;
		                    if(c > office.length || c < 0){
		                    	c++;
		                    }
		                    System.out.println(r);
		                }
		            }else if(move[i].equals("right")){
		            	System.out.println("오른쪽으로 회전");
		                int check = 0;
		                for(int j=0;j<way.length;j++){
		                    if(way[j].equals(now_way)){
		                        check = j;
		                    }
		                }
		                check--;
		                if(check<0){
		                    check = 3;
		                }
		                now_way = way[check];
		            } 
		            
		            if(move[i].equals("left")){
		            	System.out.println("왼쪽으로 회전");
		            	int check = 0;
		                for(int j=0;j<way.length;j++){
		                    if(way[j].equals(now_way)){
		                        check = j;
		                    }
		                }
		                check++;
		                if(check>3){
		                    check = 0;
		                }
		                now_way = way[check];
		                } 
		            }
		    	
		    	System.out.println();
		        
		    

		        System.out.println(answer);
	}
}

		


