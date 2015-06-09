package clases;
/**
 9. Implementar una clase Libro que contenga las propiedades: autor, t�tulo, referencia y precio, cada una de ellas con su significado natural.
  La clase Libro posee todo tipo de constructores. Tambi�n deben a�adirse los m�todos habituales b�sicos. Dos libros son iguales si tienen la misma referencia.
   Adem�s, los libros tienen definido un orden natural tambi�n por su referencia.
   
Implementar una clase cat�logo, con las propiedades adecuadas. El cat�logo contendr� los libros que disponemos, que no pueden tener elementos repetidos 
(puede haber dos libros con el mismo t�tulo, autor y precio, pero no con la misma referencia).
 Esta clase permitir� realizar las operaciones t�picas de una lista.
 
Por otro lado necesitamos un programa que gestione informaci�n sobre el cat�logo. Seg�n men� de opciones queremos saber:
- Hacer todo tipo de consulta, como har�a cualquier socio. Por autor, por t�tulo, por referencia.
- Dar de alta libros en el cat�logo.
- Dar de baja libros en el cat�logo
- Calcular el precio de todos los libros de la librer�a.
- Imprimir por pantalla los datos de todos los libros de la librer�a.
Aunque la gesti�n de la informaci�n se hace sobre una lista, los datos iniciales son cargador en dicha lista desde un archivo de libros y
 ser�n volcados en dicho archivo una vez realizada alg�n tipo de modificaci�n sobre ellos.
 */

/**Analisis
 * 
 * Propiedades:
 * autor:	b�sica	String	consultable	modificable
 * t�tulo:	b�sica	String	consultable	modificable	
 * referencia:b�sica entero	consultable	 
 * precio:	b�sica	Precio	consultable	modificable
 * 
 * Interfaz
 * 
 * String getAutor()
 *  void setAutor(String autor)
 * String getTitulo()
 * 	void setTitulo(String titulo)
 * int getReferencia()
 * 	void setReferencia(int referencia)
 * double getPrecio()
 * 	void setPrecio(double precio)
 */
public class LibroImp {
	
	private String autor;
	private String titulo;
	private int referencia;
//	private double precio;
	
	public LibroImp(){
		this.autor=null;
		this.titulo=null;
		this.referencia=0000;
//		this.precio=0.0;
	}
	
	public LibroImp(String autor,String titulo,int referencia,int precio){//cambia el parametro de precio
		this.autor=autor;
		this.titulo=titulo;
		this.referencia=referencia;
//		this.precio=precio;
	}
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getReferencia() {
		return referencia;
	}
	public void setReferencia(int referencia) {
		this.referencia = referencia;
	}
	/*
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	*/
	public String toString(){
		String s=null;
		s=getAutor()+","+getTitulo()+","+getReferencia()/*+","+getPrecio()*/;
		return s;
		
	}
	//Dos libros son iguales si tienen la misma referencia.
	public boolean equals(LibroImp l){
		boolean res=false;
		
		return res;
	}
	/**Devuelve
	 *  1 si la referencia es mayor
	 *  0 si las referencias son iguales
	 *  -1 si la referencia es menor
	 */
	public int compareTo(LibroImp l){
		int res=0;
		
		return res;
	}
	
	public LibroImp clone(){
		return null;
		
	}
}
