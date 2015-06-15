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
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import clases.CatalogoImp;

public class GestionadoraFicheroCatalogo
{
	// Atributo est�tico, fichero que gestiona
	
	private static File ficheroCatalogo = new File("Catalogo.dat");
	
	// M�todos de la gestionadora
	
	/*
	 * obtenerCatalogo // En resguardo
	 * -----------------
	 * Resumen: M�todo est�tico que abre el fichero Catalogo.dat para leer y devuelve el objeto CatalogoImp contenido en el 
	 * �nico registro del fichero si existe.
	 * Cabecera: CatalogoImp obtenerCatalogo()
 	 * Salidas: Un objeto CatalogoImp
 	 * Postcondiciones: En caso de haberr algun error se devuelve null y en otro caso ha sido encontrado y se devuelve el Catalogo
	 */
	public static CatalogoImp obtenerCatalogo()
	{
		CatalogoImp catalogoFichero = null;
		
		// Declaracion de streams
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		if (!ficheroCatalogo.exists()) // Si no existe el fichero Catalogo
		{
			System.out.println("No existe ningun fichero Catalogo.dat que tratar");
		} else
		{
			try
			{
				fis = new FileInputStream(ficheroCatalogo);
				ois = new ObjectInputStream(fis);
				
				catalogoFichero = (CatalogoImp) ois.readObject();
			} catch (IOException e)
			{
				System.out.println("IOException en obtenerCatalogo()");
				// e.printStackTrace();
			} catch (ClassNotFoundException e)
			{
				System.out.println("La clase leida del fichero no es congruente, has tocado la Clase Catalogo y usas ficheros antiguos?");
				// e.printStackTrace();
			} finally
			{
				try
				{
					if (ois != null)
					{
						ois.close();
					} else if (fis != null)
					{
						fis.close();
					}
				} catch (Exception e)
				{
					System.out.println("Error cerrando streams en obtenerCatalogo()");
				}
			} // Fin cierre streams
		} // Fin else
		
		return catalogoFichero;
	}
}
