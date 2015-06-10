package clases;
/**Anal-isis
 * 
 * Propiedades:
 * NOMBRE		CARACTER		TIPO		CONSULTABLE		MODIFICABLE
 * l			básica			LibroImp		SI				SI
 * nl			básica			NodoListaImp	SI				SI	
 * 
 * Interfaz:
 * LibroImp getLibroImp()
 *  void setLibroImp(LibroImp l)
 * NodoListaImp getNodoLista()
 *  setNodoLista(NodoLista nl)
 */
import interfaces.NodoLista;

public class NodoListaImp implements NodoLista {
	//Atributos
	private LibroImp l;
	private NodoListaImp nl;
	
	//Gets & Sets
	public LibroImp getLibroImp() {
		
		return l;
	}


	public void setLibroImp(LibroImp l) {
		this.l=l;
		
	}

	
	public NodoListaImp getNodoLista() {
		
		return nl;
	}

	
	public void setNodoLista(NodoListaImp nl) {
		this.nl=nl;
		
	}



}
