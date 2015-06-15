/*
 * Clase que usa los Enums de Nombres, Apellidos y Sexo para generar multitud de objetos relacionados con el
 * nombre de una persona. 
 */

package enums;

import java.util.Random;

public class UtilidadHumanos
{
	/*
	 * generarNombreApellidosApellidos
	 * -------------------------------
	 * Resumen: Genera y devuelve una cadena con un nombre y dos apellidos de sexo aleatorio
	 * Cabecera: String generarNombreApellidosApellidos()
	 */
	public static String generarNombreApellidosApellidos()
	{
		int sexoRnd, mujer = 0, hombre = 1;
		String nombreGenerado = null;
		Random rnd = new Random();
		
		sexoRnd = rnd.nextInt(2);
		
		// Asigno un nombre acorde al sexo aleatoriamente escogido
		nombreGenerado = sexoRnd == mujer ? EnumNombresFemeninos.values()[rnd.nextInt(21)].toString() : EnumNombresMasculinos.values()[rnd.nextInt(21)].toString();
		// Le concateno dos apellidos cualesquiera
		nombreGenerado += " " + EnumApellidos.values()[rnd.nextInt(41)].toString() + " " + EnumApellidos.values()[rnd.nextInt(41)].toString();
		return nombreGenerado;
	}
	
	// Debug ágil
//	public static void main(String[] args)
//	{
//		System.out.println(generarNombreApellidosApellidos());
//	}
}
