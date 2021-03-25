import java.util.HashMap;
import java.util.Map.Entry;

public class StringDuplicate {

	
	public static void main(String[] args) {
		duplicate("Misssippiii");
		
		duplicateChar("beautiful beach");
	}

	private static void duplicateChar(String string) {
		char[] abs=string.toCharArray();
		for(int i=0;i<abs.length;i++) {
			for(int j=i+1;j<abs.length;j++) {
				if(abs[i]==abs[j]) {
					System.out.print(abs[j] +"");
				}
			}
		}
		
	}

	private static void duplicate(String word) {
		char[] a=word.toCharArray();
		
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		for(Character c: a) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
		}
		
		for (Entry<Character, Integer> c : map.entrySet()) {
			if(c.getValue()>1) {
				System.out.println(c.getKey() +": "+ c.getValue()) ;
			}
			
		}
		
	}
}
