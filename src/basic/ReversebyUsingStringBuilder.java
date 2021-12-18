package basic;
import java.util.Scanner;
public class ReversebyUsingStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);
  StringBuilder s = new StringBuilder(sc.next());
	if(s.length()==1) {
		System.out.println(s);
	}
	for(int left = 0,right=s.length()-1;left<right;right--,left++) {
		char temp =(char)(s.charAt(left));
		s.setCharAt(left,(char)s.charAt(right));
		s.setCharAt(right, temp);
	}
	System.out.println(s);
	}

}
