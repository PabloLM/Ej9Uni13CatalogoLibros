/*
 * Clase CatalogoImp - Implementa Interface Catalogo
 * -------------------------------------------------
 * PROPIEDADES:
 * 
 * NOMBRE			CARACTER		TIPO					CONSULTABLE		MODIFICABLE
 * --------------------------------------------------------------------------------
 * CatalogoLibros	Básica			ArrayList<LibroImp>		SI				SI
 * 
 * 
 * INTERFAZ:
 * 		ArrayList<LibroImp> getCatalogoLibros()
 * 		void setCatalogoLibros(ArrayList<LibroImp> nCatalogoLibros)
 * 
 * FUNCIONALIDADES:
 */
package clases;

import java.io.Serializable;
import java.util.ArrayList;

import interfaces.Catalogo;

public class CatalogoImp implements Catalogo, Cloneable, Comparable<CatalogoImp>, Serializable
{
	// Atributos
	
	private ArrayList<LibroImp> CatalogoLibros;
	
	// Constructores
	
	public CatalogoImp()
	{
		CatalogoLibros = null;
	}
	
	public CatalogoImp(ArrayList<LibroImp> catalogoLibros)
	{
		int longitudCatalogoLibros = catalogoLibros.size();
		// Recorrido de los valores de catalogoLibros y copia de estos en CatalogoLibros (atrib de clase)
		for (int i = 0; i < longitudCatalogoLibros; i++)
		{
			CatalogoLibros.add(catalogoLibros.get(i));
		}
	}
	
	public CatalogoImp(CatalogoImp catalogo)
	{
		// to do
	}
	
	// Getters
	
	@Override
	public ArrayList<LibroImp> getCatalogoLibros()
	{
		// Devuelve la referencia, debe cambiarse a devolver una copia de los valores del atributo
		return CatalogoLibros;
	}
	
	// Setters
	
	@Override
	public void setCatalogoLibros(ArrayList<LibroImp> arrayListLibros)
	{
		CatalogoLibros = new ArrayList<>();
		int longitudArrayList = arrayListLibros.size();
		// Copia de valores de un arrayList en otro
		for (int i = 0; i < longitudArrayList; i++)
		{
			CatalogoLibros.add(arrayListLibros.get(i));
		}
	}
	
	// Implementacion de compareTo y sobrescrituras Object
	
	@Override
	protected CatalogoImp clone()
	{
		return new CatalogoImp(this); // Ojo, constructor copia no terminado
	}
	
	/*
	 * Primero se comprueba si tienen diferente longitud. En caso de no ser igual de tamaño no son iguales
	 * 
	 * Se recorren sendos arrayList en caso de ser de mismo tamaño para ver si son iguales los libros en los indices identicos
	 * y en caso de existir una desigualdad de libros en un indice se deja de comprobar más libros en indices y se da por desiguales los catalogos
	 */
	@Override
	public boolean equals(Object obj)
	{
		CatalogoImp c = null;
		boolean res = false;
		
		if (obj != null && obj instanceof CatalogoImp)
		{
			c = (CatalogoImp) obj;
			if (this.CatalogoLibros.size() == c.getCatalogoLibros().size())
			{
				ArrayList<LibroImp> librosAComparar = c.getCatalogoLibros();
				int longitudCatalogo = c.getCatalogoLibros().size();
				boolean librosIguales;
				
				for (int i = 0; i < longitudCatalogo; i++)
				{
					librosIguales = this.CatalogoLibros.get(i).equals(librosAComparar.get(i));
					// Comprobación de la existencia de un par de libros desigual en un indice, en caso de existir desigualdad i es asignado un valor para salir del bucle
					i = librosIguales == false ? longitudCatalogo : i;
				}
			}
			
		}
		return res;
	}
	
	@Override
	public int compareTo(CatalogoImp o)
	{
		int res = 0;
		
		if (this.CatalogoLibros.size() != o.getCatalogoLibros().size())
		{
			res = this.CatalogoLibros.size() < o.getCatalogoLibros().size() ? -1 : 1;
		}
		
		return res;
	}
	
	@Override
	public String toString()
	{
		// Probar esto
		return this.CatalogoLibros.toString();
	}
	
	// METODOS
	
	/*
	 * obtenerLibro
	 * ------------
	 * Resumen: Busca un objeto LibroImp en base a su referencia en el arrayList del catalogo. Si lo encuentra lo devuelve si no devuelve null.
	 * Cabecera: LibroImp obtenerLibro(int ISBN)
	 * Entradas: Un entero correspondiente a la referencia del libro buscado
	 * Salidas: Un libroImp en caso de ser encontrado
	 * Postcond: Se devuelve asociado al nombre de la funcion el LibroImp si este ha sido encontrado, en caso contrario este devuelve null
	 */
	@Override
	public LibroImp obtenerLibro(int ISBN)
	{
		LibroImp libroBuscado = null, libroLeido = null;
		boolean encontrado = false;
		for (int i = 0; i < this.CatalogoLibros.size() || encontrado == false; i++)
		{
			libroLeido = this.CatalogoLibros.get(i);
			libroBuscado = ISBN == libroLeido.getReferencia() ? libroLeido : null;
			encontrado = libroBuscado != null ? true : false;
		}
		return libroBuscado;
	}
}
