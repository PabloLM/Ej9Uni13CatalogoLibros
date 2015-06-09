/*
 * Interfaz de Catalogo
 * --------------------
 * ArrayList<LibroImp> getLibros()
 * void setLibros(ArrayList<LibroImp> arrayListLibros)
 */

package interfaces;

import java.util.ArrayList;

import clases.LibroImp;

public interface Catalogo
{
	// Getters
	ArrayList<LibroImp> getLibros();
	// Setters
	void setLibros(ArrayList<LibroImp> arrayListLibros);
	// Funcionalidades que se deben implementar - aunque esto no est� claro (por decidir)
	LibroImp obtenerLibro(int ISBN);
}
