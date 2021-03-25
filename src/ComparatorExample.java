import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.event.ListSelectionEvent;

public class ComparatorExample {

	public static void main(String[] args) {

		List<Developer> listDevs = getDevelopers();

		System.out.println("Before Sort");

		// java 8 lambda
		listDevs.forEach(System.out::println);
		//listDevs.stream().forEach(System.out::println);

		// sort by age
//    Collections.sort(listDevs, new Comparator<Developer>() {
//        @Override
//        public int compare(Developer o1, Developer o2) {
//            return (o1.getAge() - o2.getAge()); // ascending order
//        }
//    });

//		Collections.sort(listDevs, new Comparator<Developer>() {
//
//			@Override
//			public int compare(Developer o1, Developer o2) {
//				return -(o1.getName().compareTo(o2.getName())); // alaphabetically descending order becuase of - sign
//			}
//		});

		// Sort by salary
//		Collections.sort(listDevs, new Comparator<Developer>() {
//
//			@Override
//			public int compare(Developer o1, Developer o2) {
//				return o1.getSalray().compareTo(o2.getSalray());
//			}
//		});
		// java 8 lambda 
		listDevs.sort(( d1,d2) ->{
			return (d1.getAge() - d2.getAge());
		});
		listDevs.sort((a1,a2)->{
			return  - a1.getName().compareTo(a2.getName());
		});

		System.out.println("After Sort");
		for (Developer developer : listDevs) {
			System.out.println(developer);
		}

	}

	private static List<Developer> getDevelopers() {
		List<Developer> result = new ArrayList<Developer>();

		result.add(new Developer(33, new BigDecimal("70000"), "mkyong"));
		result.add(new Developer(20, new BigDecimal("80000"), "alvin"));
		result.add(new Developer(10, new BigDecimal("100000"), "jason"));
		result.add(new Developer(55, new BigDecimal("170000"), "iris"));

		return result;
	}

	// java 8 lambda

}
