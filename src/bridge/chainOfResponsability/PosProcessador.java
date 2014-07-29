package bridge.chainOfResponsability;

public abstract class PosProcessador {

	private PosProcessador proximo;
	
	public PosProcessador(PosProcessador prox){
		proximo = prox;
	}
	
	public PosProcessador(){
		proximo = new PosProcessadorNulo();
	}
	
	public byte[] processarCadeia(byte[] bytes){
		bytes = processar(bytes);
		return proximo.processarCadeia(bytes);
	}
	
	protected abstract byte[] processar(byte[] bytes);
}
