package p1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("India");
		list.add("Canada");
		list.add("NewZeland");
		list.add("America");
		list.add("France");
		
		
		for (String country : list) {
			country = country.toLowerCase();
			System.out.println(" "+country);
		}
		// -------------------------------------------
		Stream<String> stream = list.stream();
		/*
		stream.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
			}

			@Override
			public Consumer<String> andThen(Consumer<? super String> after) {
				// TODO Auto-generated method stub
				return Consumer.super.andThen(after);
			}
			
		});*/
		//--------------------------------------
		/*
		
		stream.forEach((String element)->{
			System.out.println(element);
		});
		 */
		
		
	Stream<String> lowercaseStream = stream.map((String element)->
	{
		return element.toLowerCase();
	});
		
	lowercaseStream.forEach((String element)->{
		System.out.println(element);
	});
		
	}
}
