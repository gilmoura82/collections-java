package Stream;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExemploSupplier {

	public static void main(String[] args) {

		// Supplier
		Supplier<String> saudacao = () -> "Olá";

		List<String> listaSaudacoes = Stream.generate(saudacao).limit(5).collect(Collectors.toList());

		listaSaudacoes.forEach(System.out::println);
	}

}
