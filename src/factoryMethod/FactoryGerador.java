package factoryMethod;

import bridge.Compactador;
import bridge.Criptografador;
import bridge.GeradorArquivo;
import bridge.GeradorPropriedades;
import bridge.GeradorXML;
import bridge.PosProcessador;
import bridge.composite.PosProcessadorComposto;

public abstract class FactoryGerador {

	public static final String ZIP = "ZIP";
	public static final String CRYPTO = "CRYPTO";
	
	public static GeradorArquivo criarGeradorXML( String... processadores ){
			
		GeradorArquivo g = new GeradorXML(criarProcessador(processadores));
		return g;
	}
	
	public static GeradorArquivo criarGeradorPropriedades( String... processadores ){
		
		GeradorArquivo g = new GeradorPropriedades(criarProcessador(processadores));
		return g;
	}
	
	private static PosProcessador criarProcessador(String... processadores){
		
		PosProcessador retorno = null;
		
		if(processadores.length > 1){
			PosProcessadorComposto pp =  new PosProcessadorComposto();
			for(String proc: processadores){
				pp.add(criarProcessador(proc));
			}
			retorno = pp;
		}else if(processadores[0].equals(ZIP)){
			retorno =  new Compactador();
		}else if(processadores[0].equals(CRYPTO)){
			retorno =  new Criptografador();
		}
	
		return retorno;
	}

	
}
