package builder;

import bridge.Compactador;
import bridge.Criptografador;
import bridge.GeradorArquivo;
import bridge.GeradorPropriedades;
import bridge.GeradorXML;
import bridge.PosProcessador;
import bridge.chainOfResponsability.PosProcessadorNulo;
import bridge.composite.PosProcessadorComposto;

public class BuilderGerador {

	private GeradorArquivo instancia;
	
	public BuilderGerador gerandoEmXML(){
		
		instancia = new GeradorXML(null);
		
		return this;
	}
	
	public BuilderGerador gerandoEmPropriedades(){
		
		instancia = new GeradorPropriedades(null);
		
		return this;
	}
	
	public BuilderGerador comCriptografia(){
		adicionaProcessador(new Criptografador());
		return this;
	}
	
	public BuilderGerador comCompactacao(){
		
		adicionaProcessador(new Compactador());
		
		return this;
	}
	
	private void adicionaProcessador(PosProcessador p){
		PosProcessador atual = instancia.getProcessador();
		if(atual instanceof PosProcessadorNulo){
			instancia.setProcessador(p);
		}else{
			PosProcessadorComposto pc = new PosProcessadorComposto();
			pc.add(atual);
			pc.add(p);
			instancia.setProcessador(pc);
		}
	}
	
	public GeradorArquivo construir(){
		return instancia;
	}
	
}
