package programming;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FP03FunctionalInterfaces {

	public static void main(String[] args) {
		
	List<Integer> numbers = Arrays.asList(12, 9, 13, 4, 6, 2, 4, 12, 15);

	numbers.stream()
			.filter(x -> x%2 ==0)
			.map(x -> x * x)
			.forEach(System.out::println);


}
