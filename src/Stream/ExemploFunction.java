package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ExemploFunction {
	
	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(5, 6, 7, 8, 9);

		Function<Integer, Integer> dobrar = numero -> numero + 2;

		List<Integer> numerosDobrados = numeros.stream().map(n -> n + 2).collect(Collectors.toList());

		numerosDobrados.forEach(System.out::println);
	}

}
