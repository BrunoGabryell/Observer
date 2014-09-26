package br.com.implementos;

import br.com.interfaces.Observer;

public class ConcreteObserver implements Observer{

	private final ConcreteSubject revista;
	private String nome;
	
	public ConcreteObserver(ConcreteSubject revista){
		this.revista = revista;
		revista.registrarAssinante(this);
		
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}

	@Override
	public void informar(){
		System.out.println(this.getNome()+": Notificação de nova publicação!");
		
	}
}
