package p1;

import java.util.stream.Stream;

class MathOperations
{
	public static void doPrint(String x)
	{
		System.out.println(x);
	}
	
	public static void doAdd(int a,int b)
	{
		System.out.println(a+b);
	}
}

public class ReferenceOperatorDemo {

	public static void main(String[] args) {
	
		Stream.of("a","b").forEach(MathOperations::doPrint);
		//Stream.of(10,20).forEach(MathOperations::doAdd);
		
		
		
	}
}
