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

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

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
		String lectura;
		int ultimaReferencia = -1;
		FileReader fr = null;
		BufferedReader br = null;
		
		if (ficheroRef.exists() == false)
		{
			crearFicheroRefPorDefecto();
		}
		
		try
		{
			fr = new FileReader(ficheroRef);
			br = new BufferedReader(fr);
			// Parseo a entero de la linea leida en texto correspondiente a la ultima referencia
			lectura = br.readLine();
			ultimaReferencia = Integer.parseInt(lectura);
		} catch (FileNotFoundException e)
		{
			System.out.println("No se encontr� el fichero ultimaRef.txt en leerUltimaRef()");
		} catch (RuntimeException e)
		{
			e.printStackTrace();
			System.out.println("Runtime exception en leerUltimaRef()");
		} catch (IOException e)
		{
			System.out.println("IOException pete gordo en leerUltimaRef()");
		} finally // Cierre de streams
		{
			try
			{
				if (br != null)
				{
					br.close();
				} else if (fr != null)
				{
					fr.close();
				}
			} catch (Exception e2)
			{
				System.out.println("Error al cerrar streams en leerUltimaRef()");
			}
		}
		
		return ultimaReferencia;
	}
	
	/*
	 * actualizarUltimaRef
	 * -------------------
	 */
	public static void actualizarUltimaRef()
	{
		int ultimaRefActualizada;
		
		FileWriter fw = null;
		BufferedWriter bw = null; 
		
		ultimaRefActualizada = leerUltimaRef() + 1;
		
		try
		{
			fw = new FileWriter(ficheroRef);
			bw = new BufferedWriter(fw);
			
			bw.write(Integer.toString(ultimaRefActualizada));
		} catch (IOException e)
		{
			System.out.println("Problemitas en actualizarUltimaRef");
		} finally
		{
			try
			{
				if (bw != null)
				{
					bw.close();
				} else if (fw != null)
				{
					fw.close();
				}
			} catch (Exception e2)
			{
				System.out.println("Error al cerrar streams en actualizarUltimaRef");
			}
		}
	}

	/*
	 * crearFicheroRefPorDefecto
	 */
	private static void crearFicheroRefPorDefecto()
	{
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try
		{
			fw = new FileWriter(ficheroRef);
			bw = new BufferedWriter(fw);
			
			bw.write("1000");
			bw.newLine();
		} catch (Exception e)
		{
			// TODO: handle exception
		} finally
		{
			try
			{
				if (bw != null)
				{
					bw.close();
				} else if (fw != null)
				{
					fw.close();
				}
			} catch (Exception e2)
			{
				System.out.println("Error al cerrar streams en crearFicheroRefPorDefecto");
			}
		}
	}

}
