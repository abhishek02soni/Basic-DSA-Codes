package basic;

public class StringSum {

	public static int Sum(String s) {
	
	int Sum =0;
	for(int i=0;i<s.length();i++) {
		int temp = (int)s.charAt(i)-'0';
		Sum+=temp;
	}
	return Sum;
	}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
   String s = "abcd";
   System.out.println(Sum(s));
	}

}
