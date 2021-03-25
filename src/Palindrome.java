
public class Palindrome {
	

	public static void main(String[] args) {
		int num=123;
		palindrome(num);
	}

	private static void palindrome(int num) {
		int base=num;
		int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		if(base==rev) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
	}
}
