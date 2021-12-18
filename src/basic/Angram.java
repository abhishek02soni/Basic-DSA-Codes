package basic;

public class Angram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int freqcounter[] = new int[26];
		String s1 = "abhi";
	String s2 = "abih";
	for(int i=0;i<s1.length();i++) {
		char ch = s1.charAt(i);
		freqcounter[ch-'a']++;
	}
	for(int i=0;i<s2.length();i++) {
		char ch = s2.charAt(i);
		freqcounter[ch-'a']--;
	}
	boolean isAngram=true;
	for(int i=0;i<26;i++) {
		if(freqcounter[i]!=0) {
			 isAngram=false;
			 break;
		}
	}
	
	if(isAngram) {
	System.out.println("yes");	
	}
	else {
	System.out.println("No");
	}
	}

}
