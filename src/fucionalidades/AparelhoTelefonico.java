package fucionalidades;

public class AparelhoTelefonico {

	public void ligar(String numero) {
		if(numero.equals(numero)) {
			System.out.println("nenhum numero digitado");
		}
		else {
			System.out.println("ligando para" + numero);
		}
	}
	
	public void atender() {
		System.out.println("Atendendo o telefone");
	}
	
	public void iniciarCorreioDeVoz() {
		System.out.println("iniciando correio de voz...");
	}
	
	
}
