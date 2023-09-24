package exercicio;

public class EstruturaDeDados1 {

public boolean pesquisarElemento(int[] vetor, int elemento) {
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == elemento) {
				return true;
			} 
		} 
		return false;
	}
	
	public int menorElemento(int[] vetor) {
		int auxiliar = vetor[0];
		
		for (int i = 0; i < vetor.length; i++) {
			if (auxiliar > vetor[i]) {
				auxiliar = vetor[i];
			}
		}
		return auxiliar;
	}
	
	public int maiorElemento(int[] vetor) {
		int auxiliar = vetor[0];
		
		for (int i = 0; i < vetor.length; i++) {
			if (auxiliar < vetor[i]) {
				auxiliar = vetor[i];
			}
		}
		return auxiliar;
	}
	
	public int sucessor(int[] vetor, int elemento) {
	
		for (int i = 0; i  < vetor.length; i++) {
			if (vetor[i] == elemento) {
				return vetor[i + 1];
			}
		}
		throw new IllegalArgumentException("Elemento não encontrado!");
	}
	
	public int antecessor(int[] vetor, int elemento) {
		
		for (int i = 0; i  < vetor.length; i++) {
			if (vetor[i] == elemento) {
				return vetor[i - 1];
			}
		}
		throw new IllegalArgumentException("Elemento não encontrado!");
	}
	
	
	public int[] inserir(int[] vetor, int elemento) {
        int novoTamanho = vetor.length + 1;
        int[] novoArray = new int[novoTamanho];

        for (int i = 0; i < vetor.length; i++) {
            novoArray[i] = vetor[i];
        }

        novoArray[novoTamanho - 1] = elemento;

        return novoArray;
    }

	public int[] deletar(int[] vetor, int elemento) {
		int indice = -1;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == elemento) {
                indice = i;
                break;
            }

        }
        if (indice == -1) {
            return vetor;
        }
        
        int novoTamanho = vetor.length - 1;
        int[] novoVetor = new int[novoTamanho];

        int novoIndice = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (i != indice) {
                novoVetor[novoIndice] = vetor[i];
                novoIndice++;
            }
        }

        return novoVetor;
	}
}
