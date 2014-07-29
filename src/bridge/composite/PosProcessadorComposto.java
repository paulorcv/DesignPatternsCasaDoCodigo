package bridge.composite;

import java.util.ArrayList;
import java.util.List;

import bridge.PosProcessador;


public class PosProcessadorComposto implements PosProcessador {

	private List<PosProcessador> processadores = new ArrayList<PosProcessador>();

	public PosProcessadorComposto() {

	}

	public void add(PosProcessador processador){
		processadores.add(processador);
	}

	@Override
	public byte[] processar(byte[] bytes) {
		
		for(PosProcessador p: processadores){
			bytes = p.processar(bytes);
		}		
		return bytes;
	}

}
