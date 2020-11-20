package p1;

import java.util.ArrayList;
import java.util.List;

public class StreamFilter {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();

		list.add("India-Asia");
		list.add("Canada-America");
		list.add("NewZeland-Oceana");
		list.add("America-America");
		list.add("France-Europe");
		list.add("UAE-Asia");
		list.add("Sri Lanka-Asia");
		list.add("Ukraine-Europe");
		list.add("Fizi-Oceana");
		list.add("Mexico-America");
		list.add("Malta-Europe");
		
		list.stream().
		 filter((String element)->element.endsWith("Asia")).
		 forEach(System.out::println);
		
	}

}
