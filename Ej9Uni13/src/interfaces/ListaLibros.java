package interfaces;

import clases.NodoListaImp;

public interface ListaLibros
{
	// Getters
		NodoListaImp getListaLibros();
	// Setters
		void setListaLibros(NodoListaImp puntero);
	// Metodos
		boolean estaVacia();
		void aņadirElemento(NodoListaImp nuevoNodo);
		void suprimirElemento(NodoListaImp nodoObjetivo);
		void imprimirListaLibros();
}
