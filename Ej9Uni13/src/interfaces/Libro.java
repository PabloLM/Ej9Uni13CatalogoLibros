package interfaces;

/* Interfaz
* 
* String getAutor()
*  void setAutor(String autor)
* String getTitulo()
* 	void setTitulo(String titulo)
* int getReferencia()
* 	void setReferencia(int referencia)
* double getPrecio()
* 	void setPrecio(double precio)
* 
* void imprimirLibro() <- toString bonito
*/
public interface Libro {
	
	  String getAutor();
	   void setAutor(String autor);
	  String getTitulo();
	  	void setTitulo(String titulo);
	  int getReferencia();
	  	void setReferencia(int referencia);
	  double getPrecio();
	 	void setPrecio(double precio);
	 	
	 void imprimirLibro();
}
