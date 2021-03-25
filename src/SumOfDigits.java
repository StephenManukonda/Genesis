
public class SumOfDigits {

	
	public static void main(String[] args) {
		int num=1234;
		sumAdd(num);
	}

	private static void sumAdd(int num) {
		
		int sum=0;
		while(num!=0) {
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println(sum);
		
	}
}
