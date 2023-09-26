package Stream;

import java.util.Arrays;
import java.util.List;

public class ExemploConsumer {

	public static void main(String[] args) {

		// Exemplos de Consumer
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

		numeros.forEach(t -> {
			if (t % 2 == 0) {
				System.out.println(t);
			}
		});
	}

}
