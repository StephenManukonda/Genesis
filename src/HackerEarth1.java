
public class HackerEarth1 {
	
	final int num=30;

	public static void main(String[] args) {
		HackerEarth1 v=new HackerEarth1();
		v.display();
		
	}

	private void display() {
		
		final int num=10;
		Runnable r =new Runnable() {
			
			final int num=20;
			@Override
			public void run() {
				int num=30;
				System.out.println(this.num);
			}
		};
		r.run();
	}
}
