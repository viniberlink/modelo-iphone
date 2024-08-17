package iphone.aparelhotelefonico;

public class AparelhoTelefonico implements Telefone{	
	public void ligar(String numero) {
		System.out.println("LIGANDO PARA O NÚMERO: " + numero);
	}
	public void atender() {
		System.out.println("ATENDENDO");
	}
	public void iniciarCorreioVoz() {
		System.out.println("INICIANDO CORREIO DE VOZ");
	}
}
