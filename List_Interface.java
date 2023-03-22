package final_interview;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class List_Interface {
	public static void main(String[] args) {
		List<String> city=new ArrayList<>();
		city.add("Chennai");
		city.add("Coimbatore");
		city.add("Erode");
		ListIterator<String>listIterator=city.listIterator();
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
	}

}
