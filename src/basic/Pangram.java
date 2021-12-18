package basic;

import java.util.Arrays;

public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   boolean[] alphabets = new boolean[26];
		String s1 = "abcdef";
         int count =0;
		for(int i=0;i<s1.length();i++) {
	  if(alphabets[s1.charAt(i)-'a']==false) {
		  count++;
		  alphabets[s1.charAt(i)-'a']=true;
	  }
  }
    if(count==0) {
    	System.out.println("1");
    }
    else {
    	System.out.println("0");
    }
	Arrays.fill(alphabets, false);
	}

}
