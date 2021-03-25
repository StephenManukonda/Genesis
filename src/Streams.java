import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

	
	public static void main(String[] args) {
		
		List<Integer> num=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		streamsEvenNumber(num);
		System.out.println(num.stream().filter(r->r%2==0).filter(f-> f>4).collect(Collectors.toList()));
		num.sort(Collections.reverseOrder());
		System.out.println(num);
		
	}

	private static void streamsEvenNumber(List<Integer> num) {
		System.out.println(num.stream().filter(i -> i % 2 == 0)
				.collect(Collectors.toList()));
	}
}
