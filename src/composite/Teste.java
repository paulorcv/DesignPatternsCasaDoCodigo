package composite;

public class Teste {

	public static void main(String[] args) {
		TrechoSimples trecho1 = new TrechoSimples("São Paulo", "Brasília", 245);
		TrechoSimples trecho2 = new TrechoSimples("Brasília", "Recife", 123);
		TrechoSimples trecho3 = new TrechoSimples("Recife", "Natal", 345);
		TrechoComposto trechoComposto1 = new TrechoComposto(trecho2, trecho3, 30);
		TrechoComposto trechoComposto2 = new TrechoComposto(trecho1, trechoComposto1, 50);
		
		System.out.println("O preço total é: " + trechoComposto2.getPreco());

	}

}
