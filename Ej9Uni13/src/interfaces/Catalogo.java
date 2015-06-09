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
	ArrayList<LibroImp> getCatalogoLibros();
	// Setters
	void setCatalogoLibros(ArrayList<LibroImp> arrayListLibros);
	// Funcionalidades que se deben implementar - aunque esto no está claro (por decidir)
	LibroImp obtenerLibro(int ISBN);
}
