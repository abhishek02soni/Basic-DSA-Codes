package basic;

public class RepeatingCharFirstMost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int freqcounter[] = new int[26];
   String s ="snvd";
   for(int i=0;i<s.length();i++) {
	   freqcounter[s.charAt(i)-'a']++;
   }
	
	boolean flag = true;
	for(int i=0;i<s.length();i++) {
		if(freqcounter[s.charAt(i)-'a']>1) {
			System.out.println(s.charAt(i));
	       flag = false;
	       break;
		}
	}
	if(flag) {
		System.out.println(-1);
	}
	}

}
