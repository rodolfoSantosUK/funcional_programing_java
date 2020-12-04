package programming;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FP03FunctionalInterfaces {


	int squared(int x) {
		return x * x;
	}

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(12, 9, 13, 4, 6, 2, 4, 12, 15);

		Predicate<Integer> evenPredicate = x -> x % 2 == 0;
		Predicate<Integer> isEvenPredicate2 = new Predicate<Integer>() {
			@Override
			public boolean test(Integer x) {
				return x%2==0;
			}
		};

		Function<Integer, Integer> function2 = new Function<Integer, Integer>() {
			@Override
			public Integer apply(Integer x) {
				return x * x;
			}
		};

		Consumer<Integer> sysoutConsumer = new Consumer<Integer>() {
			@Override
			public void accept(Integer x) {
				System.out.println(x);
			}
		};

		Function<Integer, Integer> squareFunction = x -> x * x;
		Consumer<Integer> consumer = System.out::println;

		numbers.stream()
			.filter(evenPredicate)
			.map(squareFunction)
			.forEach(consumer);

		BinaryOperator<Integer> integerBinaryOperator = Integer::sum;

		BinaryOperator<Integer> binaryOperator = new BinaryOperator<Integer>(){

			@Override
			public Integer apply(Integer n1, Integer n2) {
				return n1 + n2 ;
			}
		};


		int sum = numbers.stream()
				.reduce(0, integerBinaryOperator);



	}
}
