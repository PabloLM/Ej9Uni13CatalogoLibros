package clases;
/** ENUNCIADO
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



import interfaces.Libro;

import java.io.Serializable;

/**Analisis
 * 
 * Propiedades:
 * 
 * NOMBRE		CARACTER		TIPO		CONSULTABLE		MODIFICABLE
 * autor		básica			String		SI				SI
 * título		básica			String		SI				SI	
 * referencia	básica 			entero		SI				NO	 					 
 * precio		básica			real		SI				SI
 * 
 * Interfaz 
 * 
 * String getAutor()
 *  void setAutor(String autor)
 * 
 * String getTitulo()
 * 	void setTitulo(String titulo)
 * 
 * int getReferencia()
 *
 * double getPrecio()
 * 	void setPrecio(double precio)
 * 
 * void imprimirLibro()
 */
public class LibroImp implements Libro,Cloneable,Comparable<LibroImp>,Serializable {
	
	// Long utilizado para la serializacion, do not touch
	private static final long serialVersionUID = 1L;
	
	// Atributos
	
	private String autor;
	private String titulo;
	private int referencia;
	private double precio;
	
	// Constructores
	
	public LibroImp(){
		this.autor=null;
		this.titulo=null;
		this.referencia=0000;
		this.precio=0.0;
	}
	
	public LibroImp(String autor,String titulo,int referencia,double precio){
		this.autor=autor;
		this.titulo=titulo;
		this.referencia=referencia;
		this.precio=precio;
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
	
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	// Sobrescrituras Object y compareTo
	
	@Override
	public String toString(){
		String s=null;
		s=getAutor()+","+getTitulo()+","+getReferencia()+","+getPrecio();
		return s;
		
	}
	//Dos libros son iguales si tienen el mismo autor y el mismo titulo 
	@Override
	public boolean equals(Object o){
		boolean res=false;
		
		if (o instanceof LibroImp && o!=null) {
			LibroImp l=(LibroImp) o;
			
			res = this.getAutor()==l.getAutor() && this.getTitulo()==l.getTitulo() ? true : false;
		}
				
		return res;
	}
	/**Devuelve
	 *  1 si la referencia del objeto que realiza la llamada es mayor
	 *  0 si las referencias son iguales
	 *  -1 si la referencia del objeto que realiza la llamada es menor
	 */
	@Override
	public int compareTo(LibroImp l){
		int res=0;
		
		if (this.getReferencia() != l.getReferencia())
		{
			res = this.getReferencia() < l.getReferencia() ? -1 : 1;
		}

		return res;
	}
	//Clona un objeto de tipo LibroImp
	@Override
	public LibroImp clone(){
		LibroImp l=null;
		
		try {
			l=(LibroImp) super.clone();
			
		} catch (CloneNotSupportedException e) {
			
		}
		
		return l;
		
	}
	
	// Funcionalidades implementadas de la interface Libro
	
	@Override
	public void imprimirLibro()
	{
		System.out.println("ISBN: "+getReferencia()
				+"\nTítulo: "+getTitulo()
				+"\nAutor: "+getAutor()
				+"Precio: "+getPrecio());
	}
}
