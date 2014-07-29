package observer;

public class Teste {

	public static void main(String[] args) throws InterruptedException {
		
		GraficoBarras graficoBarras = new GraficoBarras();
		AcoesLogger acoesLogger = new AcoesLogger();
		CarteiraAcoes carteira = new CarteiraAcoes();
		carteira.addObservador(graficoBarras);
		carteira.addObservador(acoesLogger);
		
		Thread.sleep(2000);
		carteira.adicionaAcoes("COMPo2", 200);
		Thread.sleep(2000);
		carteira.adicionaAcoes("EMP34", 400);
		Thread.sleep(2000);
		carteira.adicionaAcoes("ABC", 300);
		Thread.sleep(2000);
		carteira.adicionaAcoes("PRD", -100);
		Thread.sleep(2000);
		carteira.adicionaAcoes("JNF", -1999);
		Thread.sleep(2000);
		
		for(int i=0; i<100; i++){
			carteira.adicionaAcoes("JNF", i);
			Thread.sleep(200);
		}
		
		
	}

}
