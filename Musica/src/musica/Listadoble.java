package musica;

public class Listadoble {
	private Nododoble inicio;
	private Nododoble fin;

	
	public Listadoble()
	{
		inicio=null;
		fin=null;
		
	}
	public void insertaralinicio(Cancion valor)
	{
		if(inicio==null) {
			inicio=new Nododoble(valor,null,null);
			fin=inicio;
		}
		else {
			Nododoble nuevo=new Nododoble(valor,inicio,null);
			inicio.setAnterior(nuevo);
			inicio=nuevo;
		}
	}

	public boolean vacio(){
		
		if(fin==null&&inicio==null) {
		
			return true;
		}else 
			return false;
	}
	
	public void insertarfinal(Cancion valor) {
		if(fin==null) {
			fin=new Nododoble(valor,null,null);
			inicio=fin;
		}else {
			Nododoble nuevo=new Nododoble(valor,null,fin);
			fin.setSiguiente(nuevo);
			fin=nuevo;
		}
	
	}
	
	public Cancion  eliminarinicio() {
		Cancion valor=inicio.getValor();
		inicio=inicio.getSiguiente();
		if(inicio!=null) {
			inicio.setAnterior(null);
			
		}else {
			fin=null;
		}
		return valor;
		
	}
	
	public Cancion  eliminarfinal() {
		Cancion valor=fin.getValor();
		fin=fin.getAnterior();
		if(fin!=null) {
			inicio.setSiguiente(null);
			
		}else {
			inicio=null;
		}
		return valor;	
	}
	
	
	
	public StringBuilder mostrarfrente() {
		StringBuilder cadena = new StringBuilder();
	    Nododoble temp=inicio;
	    cadena.append("NULL<---> ");
	    while(temp!=null) {
	    	cadena.append(temp.getValor());
	    	cadena.append("-->");
			temp=temp.getSiguiente();
	    	
	    }
		cadena.append("NULL");
		return cadena;
	}
	
	
	public StringBuilder mostrardetras() {
		StringBuilder cadena = new StringBuilder();
	    Nododoble temp=fin;
	    cadena.append("NULL<---> ");
	    while(temp!=null) {
	    	cadena.append(temp.getValor());
	    	cadena.append("-->");
			temp=temp.getAnterior();
	    	
	    }
		cadena.append("NULL");
		return cadena;
	}
	
}
