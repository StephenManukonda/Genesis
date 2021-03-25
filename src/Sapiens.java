
public class Sapiens {
	public static void main(String[] args) {
		compute(new Integer(10));
		compute(10);
		Integer i=null;
		computeAgain(i);
	}
	private static void computeAgain(int i) {
		System.out.println(i);
	}
	private static void compute(Number  i) {
		System.out.println(i.toString());
	}

}
