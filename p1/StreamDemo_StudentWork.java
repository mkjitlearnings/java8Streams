package p1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamDemo_StudentWork {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("India");
		list.add("Canada");
		list.add("NewZeland");
		list.add("America");
		list.add("France");

		
		Stream<String> stream = list.stream();
		
		Stream<String> lowercaseStream = stream.map((String element) -> {
			return element.toLowerCase();
		});

		// here if we are using lowercase again , will leads to exception
		Stream<String> uppercasestream = lowercaseStream.map((String element) -> {
			return element.toUpperCase();
		});
		
		uppercasestream.forEach((String element) -> {
			System.out.println(element);
		});
		
		System.out.println(" ------ END --------");
		// -------------  Stop Here -----------
		
		
		list.stream().
		 	map((elements)->elements.substring(1, 3)).
		 	map((String elements)->elements.toUpperCase()).
		 	forEach((elements)->System.out.println(elements));
		// this technique is called method channing and Stream API is designed t
		// to work with method channing very well.
		
		//---------------------
		System.out.println(" ---- 2nd :: apprach ");
		list.stream().
	 	map((elements)->elements.substring(1, 3)).
	 	map(String::toUpperCase).
	 	forEach(System.out::println);
	

	}//end main
}//end class



// Note : each stream can call single non-terminal operation at a time
