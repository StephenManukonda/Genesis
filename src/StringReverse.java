
public class StringReverse {

	public static void main(String[] args) {
		String words="Sandy IS GOOD ";
		String ab=reverseRecursion(words);
		String sbReverse=sbReverse(words);
		String itreverse=itReverse(words);
		
		System.out.println(sbReverse);
		System.out.println(ab);
		System.out.println(itreverse);
	}


	private static String itReverse(String words) {
		char [] ch=words.toCharArray();
		String abc="";
		for(int i=ch.length-1;i>=0;i--) {
			abc=abc+ch[i];
		}
		return abc;
	}

	private static String sbReverse(String words) {
		StringBuilder a=new StringBuilder(words).reverse();
		return a.toString();
	}

	private static String reverseRecursion(String word) {
		
		if(word==null|| word.length()<=1) {
			return word;
		}
		
		return reverseRecursion(word.substring(1))+word.charAt(0);
		
	}
}
