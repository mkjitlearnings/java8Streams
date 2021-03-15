package p1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo1 {

	public static void main(String[] args) {
		StreamDemo1 obj = new StreamDemo1();
		//obj.basicStream();
		// obj.intermidiateOperations();
		//obj.doFilter();
		obj.doMap();
	}
	public void basicStream()
	{
		Stream<Integer> stream = Stream.of(40,58,78);
		System.out.println(stream);
		stream.forEach((i)->System.out.println(i));
		
		stream = Stream.of(40,58,78);
		long x = stream.count();
		System.out.println(x);
		
		System.out.println("\n=========== Collect operation ==========\n");
		// https://www.journaldev.com/32457/java-stream-collect-method-examples
		// Streams Collect() is used to groupby or count operation 
		
		// performing count operation
		stream = Stream.of(40,58,78);
		long count = stream.collect(Collectors.counting());
		System.out.println(count);
		
		
		stream = Stream.of(40,58,78);
		List<Integer> list = stream.collect(Collectors.toList());
		System.out.println(list);
		// similarly we have toSet,toMap
		
		
		
		
		
	}

	public void intermidiateOperations()
	{
		List<Integer> list = Arrays.asList(15,48,75,2,95,4484,36,75);
		
		/*
		 * min or max
		 * in order to get min or max , we have to compare the values , so min or max operations
		 * take comparator class object 
		 * */
		
		int min = list.stream().max(Integer::compareTo).get();
		int max = list.stream().min(Integer::compareTo).get();
		
		System.out.println(min+" "+max);
		
		String x = Stream.of("asd","bdfv","c").min(String::compareTo).get();
		System.out.println("x "+x);
		
		
		Employee e1 = new Employee("A", 101, 200);
		Employee e2 = new Employee("B", 102, 1200);
		Employee e3 = new Employee("C", 103, 800);
		
		Comparator<Employee> comp = (emp1,emp2)->(emp1.getSalary()- emp2.getSalary());
		
		Employee e = Stream.of(e1,e2,e3).min(comp).get();
		System.out.println(e);
		
	}

	
	public void doFilter()
	{
		List<Integer> list = Stream.of(45,78,95,15,23).filter(x->x>50).collect(Collectors.toList());
		System.out.println(list);
		
		Employee e1 = new Employee("A", 101, 200);
		Employee e2 = new Employee("B", 102, 1200);
		Employee e3 = new Employee("C", 103, 800);
		
			
		List<Employee> liste = Stream.of(e1,e2,e3).filter(e->e.getSalary()>500).collect(Collectors.toList());
		System.out.println(liste.size());
		
		long count = Stream.of(e1,e2,e3).filter(e->e.getSalary()>500).count();
		System.out.println(count);
		
		
	}

	public void doMap()
	{
		/*
		 map is the conversion() of Stream API , where
		 1) number of input element and output element are same.
		 2) the operation applies on all elements of the Stream.
		 3) map(...)  map method must return the value
		      for example
		       x.toUpperCase() return String
		       
		       and in below code emp.setName(null) does not return any value , then we manually return
		       the updated employee
		  */
		
		List<String> list = Stream.of("addc","sdvs","dfgvdf").map(x->x.toUpperCase()).collect(Collectors.toList());
		System.out.println(list);
		
		
		/*
		  Now in the practical use case , we have a Stream of employees and this list
		  we have to transfer to other department ,but we don't want to disclose the names
		  in order to do that we have to set each employee name as null and put in new list
		  
		   Note: emp.setName(xyz) does not return employee
		 */
		
		Employee e1 = new Employee("A", 101, 200);
		Employee e2 = new Employee("B", 102, 1200);
		Employee e3 = new Employee("C", 103, 800);
		
		List<Employee> empList = Stream.of(e1,e2,e3).map(emp->{
			emp.setName(null);
			return emp;
			}).collect(Collectors.toList());
		
		System.out.println(empList);
	
	
		
		
	}//end doMap


}
