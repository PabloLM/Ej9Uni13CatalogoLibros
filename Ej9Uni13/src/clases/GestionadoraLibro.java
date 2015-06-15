/*
 * Clase de gestión de LibroImp. A cargo de José María.
 * 
 * Métodos estáticos:
 * 
 * 		LibroImp generarLibro()
 */
package clases;

import java.util.Random;

import enums.UtilidadHumanos;

public class GestionadoraLibro
{
	/*
	 * generarLibro
	 * ------------
	 * Resumen: Método estático que genera con datos generados aleatoriamente un libro menos su titulo, y lo devuelve.
	 * Cabecera: LibroImp generarLibro()
	 * Precondiciones: El titulo no debe ser null
	 * Entradas: Una cadena correspondiente al titulo del libro
	 * Salidas: Un objeto LibroImp
	 * Postcondiciones: Se devuelve asociado al nombre de la funcion un LibroImp con atributos aleatorios
	 */
	public static LibroImp generarLibro(String titulo)
	{	// Resguardo
		String autorRnd;
		double precioRnd;
		LibroImp libroGenerado = null;
		Random rnd = new Random();
		
		autorRnd = UtilidadHumanos.generarNombreApellidosApellidos();
		precioRnd = rnd.nextInt(101);
		
		libroGenerado = new LibroImp(autorRnd, titulo, precioRnd);
		// Por terminar
		
		return libroGenerado;
	}
}
