package musica;

public class Nododoble {
	private Cancion valor;
	private Nododoble siguiente;
	private Nododoble anterior;
	
	public Nododoble(Cancion val, Nododoble sigui,Nododoble ant) {
		siguiente=sigui;
		anterior=ant;
		valor=val;
	}
	
	
	public Cancion getValor() {
		return valor;
	}
	public void setValor(Cancion valor) {
		this.valor = valor;
	}
	public Nododoble getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(Nododoble siguiente) {
		this.siguiente = siguiente;
	}
	public Nododoble getAnterior() {
		return anterior;
	}
	public void setAnterior(Nododoble anterior) {
		this.anterior = anterior;
	}
	

}
