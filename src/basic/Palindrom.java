package basic;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String s1 = "nitin";
   int i=0;int j=s1.length()-1;int c=0;
   while(i<=j) {
	if(s1.charAt(i)!=s1.charAt(j)) {
		c++;
	}
   i++;
   j--;
   }
   System.out.println(c);
//	if(c==0) {
//		System.out.println("1");
//	}
//	else {
//		System.out.println("0");
//	}
	}

}
