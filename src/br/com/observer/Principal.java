package br.com.observer;
import br.com.implementos.ConcreteObserver;
import br.com.implementos.ConcreteSubject;

public class Principal {

	public void main (String Args[]){
		
		ConcreteSubject revista = new ConcreteSubject();
		
		ConcreteObserver assinante1 = new ConcreteObserver(revista);
		assinante1.setNome("Professor Romulo");
		ConcreteObserver assinante2 = new ConcreteObserver(revista);
		assinante2.setNome("Professora Roberta");
		ConcreteObserver assinante3 = new ConcreteObserver(revista);
		assinante3.setNome("Professor Antonio");
		ConcreteObserver assinante4 = new ConcreteObserver(revista);
		assinante4.setNome("Professor Hellton");
		
		revista.setPublicacao("1º Edição Revista de Professores");
	}	
}
