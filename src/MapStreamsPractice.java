import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MapStreamsPractice {
	
	public static void main(String[] args) {
		
		Map<Integer, String> m= new HashMap<Integer, String>();
		m.put(1, "rahul");
		m.put(1, "rahul");
		m.put(2, "rajeev");
		m.put(3, "ramesh");
	m.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
	.forEach(System.out::println);
	}

}
