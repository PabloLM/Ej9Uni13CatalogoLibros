/*
 * Clase est�tica de gesti�n del fichero de texto que contiene la �ltima referencia asignada a un libro.
 * ( Para el proceso de secuencializaci�n del asignado de referencias)
 * -----------------------------------------
 * M�todos:
 * 		--
 * 		leerUltimaRef 			<- Devuelve la �ltima referencia asignada abriendo el fichero para leer
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
	
	// M�todos de la clase
	
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
