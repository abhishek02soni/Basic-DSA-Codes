package basic;

public class NonRepeatingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s1 = "aabbshrsfgg";
    String s2 = "";
    int maxlength=0;
    for(int i=0;i<s1.length();i++) {
    	char ch = s1.charAt(i);
    	if(s2.indexOf(ch)!=-1) {
    		s2=s2.substring(s2.indexOf(ch)+1);
    	}
    s2=ch+s2;
   if(maxlength<s2.length()) {
	   maxlength=s2.length();
   }
    }
	System.out.println(s2);
	}

}
