package iphone.navegadorinternet;

public class NavegadorInternet implements Safari{
	public void exibirPagina(String url) {
		System.out.println("ACESSANDO A URL: " + url);
	}
	public void adicionarNovaAba() {
		System.out.println("ADICIONANDO ABA NOVA");
	}
	public void atualizarPagina() {
		System.out.println("ATUALIZANDO PÁGINA");
	}
}
