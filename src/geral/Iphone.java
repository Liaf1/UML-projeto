package geral;
import fucionalidades.ReprodutorMusical;
import fucionalidades.AparelhoTelefonico;
import fucionalidades.NavegadorWeb;

public class Iphone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ReprodutorMusical reprodutor = new ReprodutorMusical();
	
		reprodutor.tocar();
		reprodutor.pausar();
		reprodutor.selecionarMusica("");	
		
	AparelhoTelefonico telefone = new AparelhoTelefonico();
		
		telefone.ligar("");
		telefone.atender();
		telefone.iniciarCorreioDeVoz();
	
	
	 NavegadorWeb navegador = new NavegadorWeb();
	 	
	 	navegador.exibirPagina("");
	 	navegador.adicionarNovaAba();
	 	navegador.atualizarPagina();
	 
	}

}
