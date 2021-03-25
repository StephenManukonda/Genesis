
public class Factorial {

	
	public static void main(String[] args) {
		int num=5;
		int fact=factorial(num);
		int factorial=fact(num);
		System.out.println("Factorial by recursion " + fact);
		System.out.println("Factorial by iteration " + factorial);
	}


	private static int fact(int num) {
		int result=1;
		while (num!=0) {
			result=result*num;
			num--;
			
		}
		return result;
	}


	private static int factorial(int num) {
		if(num==0) {
			return 1;
		}
		else {
			num=num*factorial(num-1);
		}
		return num;
	}
}
