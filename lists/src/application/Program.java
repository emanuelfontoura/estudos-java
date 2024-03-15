package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		// DECLARAR
		List<Integer> list = new ArrayList<>();
		
		// ADICIONAR AO FINAL DA LIST
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(70);
		
		for(int number : list) {
			System.out.println(number);
		}
		System.out.println("------------------------");
		
		// ADICIONAR EM UMA POSIÇÃO ESPECIFICADA DA LIST
		list.add(2, 40);
		list.add(3, 50);
		
		// OBTER O TAMANHO DA LIST
		System.out.println(list.size());
		
		// REMOVER UM ELEMENTO DA LIST
		list.remove(5);
		
		// REMOVER ELEMENTOS QUE ATENDAM A UMA CONDIÇÃO
		list.removeIf(x -> x < 30);
		
		// OBTER O INDEX DE UM ELEMENTO DA LIST
		System.out.println(list.indexOf(40));
					
		// NOVA LIST BASEADA EM OUTRA OBTENDO ELEMENTOS SOB UMA CONDIÇÃO
		List<Integer> newList = list.stream().filter(x -> x > 30).collect(Collectors.toList());
		
		// ENCONTRAR O PRIMEIRO ELEMENTO QUE ATENDA A UMA CONDIÇÃO
		Integer num = list.stream().filter(x -> x < 50).findFirst().orElse(null);
		
		System.out.println(num);
		
		// PERCORRER A LIST
		for(int number : list) {
			System.out.println(number);
		}
		
		System.out.println("---------------------");
		
		for(int number : newList) {
			System.out.println(number);
		}
	}

}
