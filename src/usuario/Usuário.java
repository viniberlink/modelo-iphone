package usuario;

import iphone.aparelhotelefonico.AparelhoTelefonico;
import iphone.aparelhotelefonico.Telefone;
import iphone.navegadorinternet.NavegadorInternet;
import iphone.navegadorinternet.Safari;
import iphone.reprodutormusical.ReprodutorMusical;
import iphone.reprodutormusical.iTunes;

public class Usuário {
	public static void main(String[] args) {
		
		System.out.println("///// NAVEGADOR DE INTERNET /////");
		Safari safari = new NavegadorInternet();
		
		safari.exibirPagina("https://www.dio.me/");
		safari.adicionarNovaAba();
		safari.atualizarPagina();
		
		System.out.println("///// REPRODUTOR MUSICAL /////");
		iTunes itunes = new ReprodutorMusical();
		
		itunes.tocar();
		itunes.pausar();
		itunes.selecionarMusica("Sozinho - Caetano Veloso");
		
		System.out.println("///// APARELHO TELEFONICO /////");
		Telefone telefone = new AparelhoTelefonico();
		
		telefone.ligar("00-987654321");
		telefone.atender();
		telefone.iniciarCorreioVoz();
	}
}
