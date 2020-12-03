package programming;

import java.util.Arrays;
import java.util.List;

public class FP02Structured {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(12, 9, 13, 4, 6, 2, 4, 12, 15);
		int sum = addListStructured(numbers);
		System.out.println(sum);
	}

	private static int soma(int agregado , int proximoNumero) {
		return agregado + proximoNumero ;
	}

	private static int addListStructured(List<Integer> numbers) {
 	  return numbers.stream()
			  .map(x -> x*x) // o map faz um transformation nos dados
			  .reduce(0, Integer::sum);
	}

}
