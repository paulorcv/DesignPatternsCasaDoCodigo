package chainofresponsibility;

import java.util.HashMap;
import java.util.Map;

public class RecuperadorCacheMemoria extends RecuperadorArquivo {

	private Map<String, Arquivo> cache = new HashMap<>();
	
	
	
	public RecuperadorCacheMemoria(RecuperadorArquivo proximo) {
		super(proximo);
	}



	@Override
	protected Arquivo recuperaArquivo(String nome) {
		if(cache.containsKey(nome))
			return cache.get(nome);
		else
			return null;
	}
	
	protected Arquivo chamarProximo(String nome){
		Arquivo a = super.chamarProximo(nome);
		cache.put(nome, a);
		return a;
	}

}
