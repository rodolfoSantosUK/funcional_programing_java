package programming;

import java.util.List;

public class FP01Functional { 
	
	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		printAllNumbersInListFunctional(numbers);
		printSquaresOfEvenNumbersInListFunctional(numbers);
	}

	 private static void print(int number) {
	 System.out.println(number);
	 }

	 private static boolean isEven(int number) {
	 return number%2 == 0;
	 }

	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream().forEach(FP01Functional::print);
	}

	private static void printEvenNumbersInListFunctional(List<Integer> numbers) {

		numbers.stream() // Convert to Stream
				.filter(FP01Functional::isEven) // Lamdba Expression
				.forEach(System.out::println)// Method Reference
	            .filter(FP01Functional::isEven)//Filter - Only Allow Even Numbers
	}
	
	private static void printSquaresOfEvenNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream() // Convert to Stream
				.filter(number -> number % 2 == 0) // Lamdba Expression
				.map(number -> number * number)
				.forEach(System.out::println);// Method Reference
	}

}
