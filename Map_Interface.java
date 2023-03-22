package final_interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Map_Interface {
	public static void main(String[] args) {
		Map<String, String> map=new HashMap<>();
		map.put("AAA", "AAA");
		map.put("BBB", "BBB");
		map.put("AAA", "AAA");
		for(Entry<String, String> entry:map.entrySet()) {
			System.out.println(entry);
		}
	}

}
