/*
 * Clase estática de gestión del fichero Catalogo.dat
 * -----------------------------------------
 * Métodos:
 * 		--
 * 		CatalogoImp obtenerCatalogo() <- Lectura y devolución del registro donde se guarda el catálogo
 * 		--
 * 		
 */

package ficheros;

import java.io.File;

import clases.CatalogoImp;

public class GestionadoraFicheroCatalogo
{
	// Atributo estático, fichero que gestiona
	
	private static File ficheroCatalogo = new File("Catalogo.dat");
	
	// Métodos de la gestionadora
	
	/*
	 * obtenerCatalogo
	 * -----------------
	 * Resumen: Método estático que abre el fichero Catalogo.dat para leer y devuelve el objeto CatalogoImp contenido en el 
	 * único registro del fichero si existe.
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
