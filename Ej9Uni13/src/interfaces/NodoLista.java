package interfaces;

import clases.LibroImp;
import clases.NodoListaImp;
/**
* Interfaz:
* LibroImp getLibroImp()
*  void setLibroImp(LibroImp l)
* NodoListaImp getNodoLista()
*  setNodoLista(NodoLista nl)
*/ 
public interface NodoLista {
	
	LibroImp getLibroImp();
	 void setLibroImp(LibroImp l);
	NodoListaImp getNodoLista();
	 void setNodoLista(NodoListaImp nl);
}
