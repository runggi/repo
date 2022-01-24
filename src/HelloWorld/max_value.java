package HelloWorld;

import java.util.*;
import java.io.*;

public class max_value {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int[] arr = new int[9];
		int i = 0;
		int num=9;
		while(true) {
			st = new StringTokenizer(br.readLine(), "\n");
			arr[i]=Integer.parseInt(st.nextToken());
			num--;
			
			if(num==0) break;
			else i++;
			
		}
		int max=0;
		// max값 구하고 i번째 순서값 구하기
		int a=0;
		int cnt=0;
		for(int val: arr) {
			cnt++;
			if(val>max) {
				max=val;
				a=cnt;
			}
		}
		System.out.println(max);
		System.out.println(a);
	}
}
