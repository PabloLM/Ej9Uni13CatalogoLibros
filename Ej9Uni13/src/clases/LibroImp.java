package clases;

import java.io.Serializable;

import interfaces.Libro;
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
 * referencia:básica entero	consultable	 					hay que guardar en un archivo externo el valor de la ultima referencia 
 * precio:	básica	Real	consultable	modificable
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
public class LibroImp implements Libro,Cloneable,Comparable<LibroImp>,Serializable {
	
	private String autor;
	private String titulo;
	private int referencia;
	private double precio;
	
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
	@Override
	public String toString(){
		String s=null;
		s=getAutor()+","+getTitulo()+","+getReferencia()/*+","+getPrecio()*/;
		return s;
		
	}
	//Dos libros son iguales si tienen el mismo autor y el mismo titulo 
	@Override
	public boolean equals(Object o){
		boolean res=false;
		
		if (o instanceof LibroImp&& o!=null) {
			LibroImp l=(LibroImp) o;
			
			if (this.getAutor()==l.getAutor() && this.getTitulo()==l.getTitulo()) {
				res=true;
			}
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
		if (this.getReferencia()>l.getReferencia()) {
			res=1;
		}else if(this.getReferencia()<l.getReferencia()){
			res=-1;
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
}
