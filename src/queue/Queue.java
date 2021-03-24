package queue;

import structure.Structure;;

public class Queue<T> extends Structure<T>{

	public Queue(){
		super();
	}
	
	public Queue(int capacidade){
		super(capacidade);
	}
	
	public void enfileira(T elemento){
		//this.elementos[this.tamanho] = elemento;
		//this.tamanho++;
		
		//this.elementos[this.tamanho++] = elemento;
		
		this.adiciona(elemento);
	}
	
	public T espiar(){
		
		if (this.estaVazia()){
			return null;
		}
		
		return this.elementos[0];
	}
	
	public T get(Integer n) {
		int x = tamanho();
		for(int i = 0;i <= x;i++) {
			if(this.elementos[i] == elementos[n]) {
				return this.elementos[i];
			}
		}
		return null;
	}
	
	public int size() {
		int x = tamanho();
		return x;
	}
	
	public T desenfileira(){
		
		final int POS = 0;
		
		if (this.estaVazia()){
			return null;
		}
		
		T elementoASerRemovido = this.elementos[POS];
		
		this.remove(POS);
		
		return elementoASerRemovido;
		
	}
}

