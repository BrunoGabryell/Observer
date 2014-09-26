package br.com.interfaces;

public interface Subject {
		
	void registrarAssinante(Observer assinante);
	void removerAssinante(Observer assinante);
	void notificarTodosAssinantes();
	
}
