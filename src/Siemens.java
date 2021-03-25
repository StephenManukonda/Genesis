
public class Siemens {

	static void java() {
		try {
			System.out.println("inside java");
			throw new RuntimeException("demo");
		}finally {
			System.out.println("java finally");
		}
	}
	static void phthon() {
		try {
			System.out.println("inside phthon");
			return;
		}finally {
			System.out.println("phthong finally");
		}
	}
	public static void main(String[] args) {
		try{
			java();
		}catch (Exception e) {
			// TODO: handle exception
			System.err.println("exception caught");
		}
		phthon();
	}
}
