/*
 * Clase estática de gestión del fichero de texto que contiene la última referencia asignada a un libro.
 * ( Para el proceso de secuencialización del asignado de referencias)
 * -----------------------------------------
 * Métodos:
 * 		--
 * 		leerUltimaRef 			<- Devuelve la última referencia asignada abriendo el fichero para leer
 * 		--
 * 		actualizarUltimaRed 	<- Sobrescribe el registro que contiene la referencia sumandole uno al anterior valor
 * 		--
 * 		crearFicheroPorDefecto 	<- En caso de no existir el fichero se crea por defecto con un valor inicial predeterminado
 * 		--
 */

package ficheros;

import java.io.File;

public class GestionadoraFicheroRef
{
	// Atributo, el fichero que gestiona
	
	private static File ficheroRef = new File("ultimaRef.txt");
	
	// Métodos de la clase
	
	/*
	 * leerUltimaRef
	 * -------------
	 */
	public static int leerUltimaRef()
	{ // resguardo
		int ultimaReferencia = -1;
		
		return ultimaReferencia;
	}
	
	/*
	 * actualizarUltimaRef
	 * -------------------
	 */
	public static void actualizarUltimaRef()
	{
		// resguardo
	}
}
