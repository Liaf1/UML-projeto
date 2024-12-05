package fucionalidades;

 public class ReprodutorMusical {
	
	public void tocar(){
		System.out.println("Tocando...");
	}
	
	public void pausar() {
		System.out.println("pausado.");
	}
	
	public void selecionarMusica(String musica) {
		if(musica.equals(musica)) {
			System.out.println("nenhuma música selecionada ");
		}
		else {
		System.out.println("selecionando a música" + musica);
	}
	}
}
