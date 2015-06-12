/*
 * Clase est�tica de gesti�n del fichero Catalogo.dat
 * -----------------------------------------
 * M�todos:
 * 		--
 * 		CatalogoImp obtenerCatalogo() <- Lectura y devoluci�n del registro donde se guarda el cat�logo
 * 		--
 * 		
 */

package ficheros;

import java.io.File;

import clases.CatalogoImp;

public class GestionadoraFicheroCatalogo
{
	// Atributo est�tico, fichero que gestiona
	
	private static File ficheroCatalogo = new File("Catalogo.dat");
	
	// M�todos de la gestionadora
	
	/*
	 * obtenerCatalogo
	 * -----------------
	 * Resumen: M�todo est�tico que abre el fichero Catalogo.dat para leer y devuelve el objeto CatalogoImp contenido en el 
	 * �nico registro del fichero si existe.
	 * Cabecera: CatalogoImp obtenerCatalogo()
 	 * Salidas: Un objeto CatalogoImp
 	 * Postcondiciones: En caso de haberr algun error se devuelve null y en otro caso ha sido encontrado y se devuelve el Catalogo
	 */
	public static CatalogoImp obtenerCatalogo()
	{
		// En resguardo
		CatalogoImp catalogoFichero = null;
		
		return catalogoFichero;
	}
}
