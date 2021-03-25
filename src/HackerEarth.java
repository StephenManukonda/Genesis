import java.awt.color.CMMException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class HackerEarth {

	int a = 10;

	public static void main(String[] args) {
		HackerEarth obj = new HackerEarth();
		System.out.println(obj.a);

		List<String> test = Arrays.asList("ca", "b", "a");
		test.sort((s1, s2) -> {
			return -(s1.compareTo(s2));
		});
		ListIterator<String> a=test.listIterator();
		while (a.hasNext()) {
			System.out.println(a.next());
			
		}
		
		List<Integer> test1 = Arrays.asList(1,2,5,0,10,3);
		test1.sort((s1, s2) -> {
			return -(s1-s2);
		});
		
		
		
		Set<Developer> set=new HashSet(); 
		Developer d=new Developer(1, new BigDecimal("70000"), "Sam");
		Developer d1=new Developer(1, new BigDecimal("70000"), "Sam");
		set.add(d);
		set.add(d1);
		System.out.println(set.size());
		
		
		
		
		
		
		//test.sort(Comparator.naturalOrder());
		//test.sort(Comparator.reverseOrder());
		//test1.forEach(System.out::println);
		//test1.forEach(System.out::println);
		
	}
}
