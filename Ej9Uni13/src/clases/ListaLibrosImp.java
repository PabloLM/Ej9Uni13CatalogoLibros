/*
 * Clase ListaLibrosImp - Implementa ListaLibros
 * ---------------------------------------------
 * ESTUDIO DE CLASE
 * ---------------------------------------------
 * Propiedades
 * 
 * NOMBRE		B/D		TIPO			CONSULTABLE		MODIFICABLE
 * ----------------------------------------------------------------
 * punteroLista	Básica	NodoListaImp	SI				SI
 * ----------------------------------------------------------------
 * Interfaz
 * 
 * NodoListaImp getListaLibros()
 * void setListaLibros()
 */

package clases;

import interfaces.ListaLibros;

public class ListaLibrosImp implements ListaLibros
{
	// Atributos
	private NodoListaImp PunteroLista;
	
	// Constructor
	public ListaLibrosImp()
	{
		PunteroLista = null;
	}
	
	public ListaLibrosImp(NodoListaImp punteroLista)
	{
		PunteroLista = punteroLista;
	}
	
	// Sobrescrituras de Object
	
	// Implementaciones de la interface ListaLibros
	
	/*
	 * getListaLibros
	 * --------------
	 * Estudio aqui
	 */
	@Override
	public NodoListaImp getListaLibros()
	{
		return PunteroLista;
	}
	
	/*
	 * setListaLibros
	 * --------------
	 * Estudio aqui
	 */
	@Override
	public void setListaLibros(NodoListaImp nuevoPuntero)
	{
		PunteroLista = nuevoPuntero;
	}
	
	/*
	 * estaVacia
	 * ---------
	 * Estudio aqui
	 */
	@Override
	public boolean estaVacia()
	{
		boolean vacia = true;
		
		vacia = PunteroLista == null ? true : false;
		
		return vacia;
	}
	
	/*
	 * añadirElemento
	 * --------------
	 * Resumen: Añade un nuevo nodo al final de la lista
	 * Cabecera: boolean añadirElemento(NodoListaImp nuevoNodo)
	 * Precondiciones: nuevoNodo debe apuntar a null
	 */
	@Override
	public void añadirElemento(NodoListaImp nuevoNodo)
	{
		boolean exito = false;
		NodoListaImp ultimoNodoComprobado = PunteroLista;
		
		// Avanzo en la lista siempre y cuando el siguiente nodo no sea null
		while(ultimoNodoComprobado.getNodoLista() != null)
		{
			ultimoNodoComprobado = ultimoNodoComprobado.getNodoLista();
		}
		// Una vez salga del bucle tengo guardado el antepenultimo nodo de la lista y a este le seteo el siguiente al nuevoNodo
		ultimoNodoComprobado.getNodoLista().setNodoLista(nuevoNodo);
	}

	@Override
	public void suprimirElemento(NodoListaImp nodoObjetivo)
	{
		NodoListaImp nodoLeido = PunteroLista;
		
		// Avance por la lista hasta encontrar el nodo con un libro con el mismo ISBN
		while (nodoLeido.getNodoLista().getLibroImp().getReferencia() != nodoObjetivo.getLibroImp().getReferencia())
		{
			nodoLeido = nodoLeido.getNodoLista();
		}
		// Al salir del bucle tengo guardado justamente el nodo anterior al que se desea eliminar
		// Por tanto tan solo he de eliminar el enlace del nodo que queremos borrar y cambiar el campo siguiente del nodo anterior al borrado
		// al nodo posterior al eliminado
		nodoLeido.setNodoLista(nodoLeido.getNodoLista().getNodoLista());
	}

	@Override
	public void imprimirListaLibros()
	{
		
	}

}
