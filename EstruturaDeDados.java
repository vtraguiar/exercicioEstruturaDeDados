package exercicio;

import java.util.Scanner;

public class EstruturaDeDados {
	public static void main(String[] args) {
		
		EstruturaDeDados1 edd = new EstruturaDeDados1();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor desejado para o tamanho do array: ");
		int vetor = sc.nextInt();
		
		int[] array = new int[vetor];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		
		System.out.println("""
				O que você deseja fazer ?
				
				1 - Adicionar um valor ao vetor.
				2 - Remover um valor do vetor.
				3 - Ver o elemento antecessor.
				4 - Ver o elemento sucessor.
				5 - Pesquisar algum elemento.
				6 - Ver o maior elemento.
				7 - Ver o menor elemento.
				""");
		
		int escolha = sc.nextInt();		
		
		switch(escolha) {
			case 1:
				System.out.println("Digite o valor desejado: ");
				int valor = sc.nextInt();
				array = edd.inserir(array, valor);
				break;
				
			case 2:
				System.out.println("Digite o valor desejado: ");
				int valor1 = sc.nextInt();
				array = edd.deletar(array, valor1);
				break;
				
			case 3:
				System.out.println("Digite o valor desejado: ");
				int valor2 = sc.nextInt();
				System.out.println(edd.antecessor(array, valor2));
				break;
			
			case 4: 
				System.out.println("Digite o valor desejado: ");
				int valor3 = sc.nextInt();
				System.out.println(edd.sucessor(array, valor3));
				break;
				
			case 5:
				System.out.println("Digite o valor desejado: ");
				int valor4 = sc.nextInt();
				System.out.println(edd.pesquisarElemento(array, valor4));
				break;
				
			case 6:
				System.out.println(edd.maiorElemento(array));
				break;
			
			case 7:
				System.out.println(edd.menorElemento(array));
				break;
				
			default:
				System.out.println("Digite um valor válido!");
				
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}
	
	
}
