package builder;

import bridge.GeradorArquivo;

public class TesteBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GeradorArquivo ga = new BuilderGerador().gerandoEmXML().comCriptografia().
				comCompactacao().comCompactacao().construir();

	}

}
