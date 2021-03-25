import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Anagram {
	
	public static void main(String[] args) {
		
		String s="ADHAS";
		String s1="SAHAS";
		
		char[] s3=s.toCharArray();
		char[] s4=s1.toCharArray();
		
		if(s3.length!=s4.length) {
			System.out.println("Not anagram");
		}
 		
		else {
			Arrays.sort(s3);
			//Integer[] squares = { 4, 25, 9, 36, 49 };

			Arrays.sort(s4);
			//Arrays.sort(squares,Collections.reverseOrder());
			//boolean v=Arrays.equals(s3, s4);
			for(int i=0;i<s3.length;i++) {
				if(s3[i]==s4[i]) {
					System.out.println("anagram ");
				}else {
					System.out.println("not aga");
				}
			}
//			if(v) {
//				System.out.println("anagram");
//			}else {
//				System.out.println("not anagram");
//			}
		}
	}

}
