package iphone.reprodutormusical;

public class ReprodutorMusical implements iTunes{
	public void tocar() {
		System.out.println("TOCANDO");
	}
	public void pausar() {
		System.out.println("PAUSANDO");
	}
	public void selecionarMusica(String musica) {
		System.out.println("MÚSICA SELECIONADA: " + musica);
	}
}
