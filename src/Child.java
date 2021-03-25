import java.util.Optional;

public class Child extends Parent {
	
	@Override
	public void m1() {
		System.out.println("Hello child m1");
	}
	
	public static void main(String[] args) {
		Parent p =new Child();
		Child c=(Child) p;
			
		
		c.m1();
	}

}
