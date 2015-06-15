package clases;


import java.util.ArrayList;

import ficheros.GestionadoraFicheroCatalogo;

public class GestionadoraCatalogo {
	
	
	
	/**Interfaz
	 * Comentario:Devuelve el Libro que corresponda al ISBN indicado
	 * Cabecera:public static LibroImp obtenerLibroISBN (ISBN cualquiera)
	 * Precondiciones:no tiene
	 * Entrada:un ISBN
	 * Salida:un objeto de tipo LibroImp
	 * Postcondiciones:Se devolverá ASN un objeto de tipo LibroImp cuyo ISBN sea el indicado anteriormente por parámetros  
	 */
	
	public static LibroImp obtenerLibroISBN (int ISBN){
		return null;
		
	}
	
	/**Interfaz
	 * Comentario:Devuelve un ArrayList<LibroImp> que contendrá los libros escritos por el autor indicado por parámetros
	 * Cabecera:public static ArrayList<LibroImp>obtenerLibroAutor(String autor)
	 * Precondiciones:no tiene
	 * Entrada:una cadena que representa el nombre del autor 
	 * Salida:un ArrayList<LibroImp>
	 * Postcondiciones:Se devolverá ASN un ArrayList<LibroImp> que contendrá los libros escritos por el autor indicado por parámetros
	 */
	
	
	public static ArrayList<LibroImp>obtenerLibroAutor(String autor){
		return null;
		
	}
	
	/**Interfaz
	 * Comentario:Devuelve un ArrayList<LibroImp> con todos los libros que tengan el titulo indicado por parámetros 
	 * Cabecera:public static ArrayList<LibroImp>obtenerLibroTitulo(String titulo)
	 * Precondiciones:no tiene 
	 * Entrada:una cadena que representa el titulo del libro 
	 * Salida:un ArrayList<LibroImp>
	 * Postcondiciones:Se devolverá ASN un ArrayList<LibroImp> que cotnendrá los libros con el titulo indicado por parámetros 
	 */
	
	public static ArrayList<LibroImp>obtenerLibroTitulo(String titulo){
		return null;
		
	}
	
	
	
	/**Interfaz
	 * Comentario:Devuelve el precio total de los libros del catalogo
	 * Cabecera:public static double precioTotal()
	 * Precondiciones:no tiene 
	 * Entrada:																esta por ver 
	 * Salida:un real con el precio total
	 * Postcondiciones:se devolverá ASN un real con el precio total de los libros del catalago 
	 */
	
	public static double precioTotal(){
			//GestionadoraFicheroCatalogo.obtenerCatalogo();
			return 0.0;			
		
	}
	
	
	
	
	
	/**Interfaz
	 * Comentario:
	 * Cabecera:
	 * Precondiciones:
	 * Entrada:
	 * Salida:
	 * Postcondiciones:
	 */
	
}