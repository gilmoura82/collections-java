package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class ExemploBinaryOperator {
	
	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 5);
		
		BinaryOperator<Integer> somar = Integer::sum;
		
		// Usando o binaryOperator para somar todos os números no Stream
		int resultado = numeros.stream()
				.reduce(0, Integer::sum);
		
		// Imprimir o resultado
		System.out.println("A soma dos números é: " + resultado);
		
	}
	
	
	
	

}
