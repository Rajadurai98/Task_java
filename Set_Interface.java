package final_interview;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_Interface {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(1);
		set.add(2);
		Iterator<Integer> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
