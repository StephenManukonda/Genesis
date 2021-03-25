
public class NumberReserve {

	public static void main(String[] args) {
		int a=2345;
		int reverse=numberReverse(a);
		String revnum=stringBuffRev(a);
		System.out.println(reverse);
		System.out.println(revnum);
		
	}

	private static String stringBuffRev(int num) {
		
		StringBuilder builder=new StringBuilder(String.valueOf(num));
		return builder.reverse().toString();
	}

	private static int numberReverse(int num) {
		int rev =0;
		while(num!=0) {
			rev=rev*10 +num%10;
			num=num/10;
		}
		return rev;
	}
}
