package singleton;

public class Configuracao {

	private static Configuracao instancia;
	
	public static Configuracao getInstancia(){
		
		if(instancia == null)
			instancia = new Configuracao();
		
		return instancia;
	}
	
	// construtor privado
	private Configuracao(){
		// ler as configuracoess
	}
	
}
