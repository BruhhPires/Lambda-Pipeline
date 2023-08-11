package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7); // CRIA UMA LISTA
		
		Stream<Integer> st1 = list.stream().map(x -> x * 10); // CRIA UMA STREAM COM A LISTA, E O MAP ATUA EM CADA VALOR APLICANDO UMA FUNÇÃO
		System.out.println(Arrays.toString(st1.toArray()));
		
		int sum = list.stream().reduce(0, (x, y) -> x + y ); // CRIA A VARIAVEL SUM, APLICANDO X E Y COMO ARGUMENTOS E A FUNÇÃO QUE ELES SOFRERÃO
		System.out.println("SUM :" + sum);
		
		List<Integer> newList = list.stream() // UMA LISTA NEWLIST RECEBE UMA STREAM
				.filter(x -> x % 2 == 0) // FILTRA APENAS OS NUMEROS PARES
				.map(x -> x * 10) // APLICA A MULTIPLICAÇÃO NESSES NUMEROS PARES
				.collect(Collectors.toList()); // RETORNA DE STREAM PARA LISTA
		System.out.println(Arrays.toString(newList.toArray()));
		

	}

}
