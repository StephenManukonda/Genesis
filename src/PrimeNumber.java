
public class PrimeNumber {
	
	
public static void main(String[] args) {
	int num=9;
	checkPrime(num);
}

private static void checkPrime(int num) {
	if(num>1) {
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count=count+1;
			}
		}
		if(count==2) {
			System.out.println("prime");
		}else {
			System.out.println("not prime");
		}
		
	}
	else {
		System.out.println("not prime");
	}
}
}
