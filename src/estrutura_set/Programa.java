package estrutura_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Programa {

	public static void main(String[] args) {
		
//		Set<String> set = new HashSet<>();
//		Set<String> set = new TreeSet<>();
		Set<String> set = new LinkedHashSet<>();
		
		set.add("Tv");
		set.add("Notebook");
		set.add("Tablet");
		
		System.out.println(set.contains("Notebook")); // retorna true ou false.
		
		for (String p : set) {
			System.out.println(p);
		}

//		set.remove("Tablet");
//		set.removeIf(x -> x.length() >= 3);
		set.removeIf(x -> x.charAt(0) == 'T');
		
		System.out.println();
		for (String p : set) {
			System.out.println(p);
		}
		
	}

}
