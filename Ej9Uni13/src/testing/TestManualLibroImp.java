package testing;

import clases.LibroImp;
import enums.UtilidadHumanos;


public class TestManualLibroImp
{

	public static void main(String[] args)
	{
		LibroImp l = null;
		for (int i = 0; i < 10; i++)
		{
			System.out.print("1: ");
			l = new LibroImp(UtilidadHumanos.generarNombreApellidosApellidos(), "Titulo1", 25);
			l.imprimirLibro();
		}
	}

}
