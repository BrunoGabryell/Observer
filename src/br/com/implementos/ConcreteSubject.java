package br.com.implementos;


import java.util.ArrayList;
import br.com.interfaces.Observer;
import br.com.interfaces.Subject;

public class ConcreteSubject implements Subject{

	private final ArrayList<Observer> assinantes = new ArrayList<>();
	private String publicacao;
	
	@Override
	public void registrarAssinante(Observer assinante){
		assinantes.add(assinante);
	}
	
	@Override
	public void removerAssinante(Observer assinante){
		assinantes.remove(assinante);
	}
	
	@Override
	public void notificarTodosAssinantes(){
		for(Observer assinante : assinantes){
			assinante.informar();
		}
	}
	
	public String getPublicacao(){
		return publicacao;
	}
	
	public void setPublicacao(String puclicacao){
		this.publicacao = publicacao;
		notificarTodosAssinantes();
	}

}