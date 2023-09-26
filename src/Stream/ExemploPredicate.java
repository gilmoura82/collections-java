package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ExemploPredicate {

	public static void main(String[] args) {

		// Predicate

		List<String> palavras = Arrays.asList("java", "kotlin", "javascript", "c#", "python");

		Predicate<String> maisDoQueCincoPalavras = palavra -> palavra.length() < 5;

		palavras.stream().filter(maisDoQueCincoPalavras).forEach(System.out::println);

	}

}
