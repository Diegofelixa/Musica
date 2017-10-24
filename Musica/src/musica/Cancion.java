package musica;


public class Cancion {
	private String id_cancion;
	private String nombrecancion;
	private String album;
	private String artista;
	public String getNombrecancion() {
		return nombrecancion;
	}
	public void setNombrecancion(String nombrecancion) {
		this.nombrecancion = nombrecancion;
	}
	private String genero;
	public String getId_cancion() {
		return id_cancion;
	}
	public void setId_cancion(String i) {
		this.id_cancion = i;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "DATOS: "+"ID"+this.id_cancion+" Nombre de la cancion;"+this.nombrecancion+" ARTISTA:"+this.artista+"ALBUM"+this.album+"GENERO"+this.genero;
	}
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Cancion temp=(Cancion) o;
		return this.id_cancion.compareTo(temp.getId_cancion());
	}

}
