package lesson2;

import java.util.*;
public class duplicate {
	
	public static void main(String[] args) {
		int a=0; //int cnt1=0;
	String[] s = new String[]{"horse","dog", "dog", "cat", "horse","dog","elephant","deer"};
	String[] result = new String[s.length];
		
	for(int i=0;i<s.length;i++) {
		int cnt=0;
		for(int j=i+1;j<s.length;j++) {
			if(s[i].equals(s[j])) {
				cnt++;
				
			  }
			}
		if(cnt<1) {
			result[a] = s[i];
			a++;
		}
			
	}
	System.out.print("{");
	for(int k=0;k<result.length;k++) {
			System.out.print(result[k]+","+"\t");
		}
	System.out.print("}"+"\n");	
	String[] arrn = Arrays.copyOf(result, a);
	for (int i = 0; i < arrn.length; i++) 
	   {
	   System.out.print(arrn[i]+"\t");
	   }
	}
}
