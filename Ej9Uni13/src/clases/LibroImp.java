package clases;
/**
 9. Implementar una clase Libro que contenga las propiedades: autor, título, referencia y precio, cada una de ellas con su significado natural.
  La clase Libro posee todo tipo de constructores. También deben añadirse los métodos habituales básicos. Dos libros son iguales si tienen la misma referencia.
   Además, los libros tienen definido un orden natural también por su referencia.
   
Implementar una clase catálogo, con las propiedades adecuadas. El catálogo contendrá los libros que disponemos, que no pueden tener elementos repetidos 
(puede haber dos libros con el mismo título, autor y precio, pero no con la misma referencia).
 Esta clase permitirá realizar las operaciones típicas de una lista.
 
Por otro lado necesitamos un programa que gestione información sobre el catálogo. Según menú de opciones queremos saber:
- Hacer todo tipo de consulta, como haría cualquier socio. Por autor, por título, por referencia.
- Dar de alta libros en el catálogo.
- Dar de baja libros en el catálogo
- Calcular el precio de todos los libros de la librería.
- Imprimir por pantalla los datos de todos los libros de la librería.
Aunque la gestión de la información se hace sobre una lista, los datos iniciales son cargador en dicha lista desde un archivo de libros y
 serán volcados en dicho archivo una vez realizada algún tipo de modificación sobre ellos.
 */

/**Analisis
 * 
 * Propiedades:
 * autor:	básica	String	consultable	modificable
 * título:	básica	String	consultable	modificable	
 * referencia:básica entero	consultable	 
 * precio:	básica	Precio	consultable	modificable
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
