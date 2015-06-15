package main;

import java.util.ArrayList;
import java.util.Scanner;

import clases.GestionadoraCatalogo;
import clases.LibroImp;
import ficheros.GestionadoraFicheroCatalogo;

/**PG
 * 
 * Inicio
 * 
 * repetir
 * mostrarMenu y validar opcion 
 * 	si opcion no es salir 
 * 		segun opcion
 * 			caso 1
 * 				Realizar consultas sobre los libros 
 * 					mostrarMenu y validar opcion 
 * 						si opcion no es salir 
 * 							segun opcion
 * 								caso 1
 * 									obtenerLibroISBN
 * 								caso 2 
 * 									obtenerLibroAutor
 * 								caso 3
 * 									obtenerLibroTitulo
 * 							fin segun
 * 						fin si		
 * 			caso 2
 * 				Dar de alta un libro en el catálogo
 * 			caso 3
 * 				Dar de baja un libro en el catálogo
 * 			caso 4
 * 				Calcular el precio de todos los libros de la libreria 
 * 			caso 5 
 * 				mostrarLibreria //esto deberia ser un metodo to string de la clase catalogo
 * 		fin segun
 *  finsi
 *  
 *  mientras no quiera salir
 *  
 *  FIN
 **/


public class BuenillosLibrary {
	
	public static void mostrarMenu(){
		System.out.println("1) Realizar consultas sobre los libros");
		System.out.println("2) Dar de alta un libro en el catalogo");
		System.out.println("3) Dar de baja un libro en el catalogo");
		System.out.println("4) Calcular el precio de todos los libros");
		System.out.println("5) Mostrar todos los libros");
		System.out.println("0) Salir");
		}
	
	public static void mostrarSubMenu(){
		System.out.println("1) Obtener un libro segun su ISBN");
		System.out.println("2) Obtener un libro segun su Autor");
		System.out.println("3) Obtener un libro segun su Titulo");
		System.out.println("0) Salir");
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcion,opcionSubMenu,ISBN;
		double precio;
		String autor=null;String titulo=null;
		ArrayList<LibroImp> libros=null;
		LibroImp l=new LibroImp();
		
		do {
			mostrarMenu();//a validar
			opcion=teclado.nextInt();
			
			if (opcion!=0) {
				
				switch (opcion) {
				case 1:
						mostrarSubMenu();//a validar
						opcionSubMenu=teclado.nextInt();
						if (opcionSubMenu!=0) {
							switch (opcionSubMenu) {
							case 1:
									System.out.println("Introduzca el ISBN del Libro que desee");
									ISBN=teclado.nextInt();
									GestionadoraCatalogo.obtenerLibroISBN(ISBN);
									System.out.println(l.toString());
								break;
							case 2:
									System.out.println("Introduzca el nombre del Autor del libro que desee");
									autor=teclado.next();
									libros=GestionadoraCatalogo.obtenerLibroAutor(autor);
									System.out.println(libros.toString());		
								break;
							case 3:
									System.out.println("Introduzca el nombre del Titulo del libro que desee");
									titulo=teclado.next();
									libros=GestionadoraCatalogo.obtenerLibroTitulo(titulo);
									System.out.println(libros.toString());
								break;
							
							}//Fin segund peque
						}//Fin if peque 
					
					break;
				case 2:
						System.out.println("Introduzca un Autor");
						autor=teclado.next();
						System.out.println("Introduzca un Titulo");
						titulo=teclado.next();
						System.out.println("Introduzca un Precio");
						precio=teclado.nextDouble();
						
						LibroImp librito=new LibroImp(autor,titulo,precio);
						//Aqui va el metodo insertar elemento de la lista 
						
					break;
				case 3:
						System.out.println("Introduzca el ISBN del libro que desea borrar");
						ISBN=teclado.nextInt();
						//Aqui va el metodo suprimir elemento de la lista 
					break;
				case 4:
						System.out.println("El precio total de todos los libros del catalogo es " + GestionadoraCatalogo.precioTotal());
					break;
				case 5:
						System.out.println(GestionadoraFicheroCatalogo.obtenerCatalogo().toString());
					break;
				}//Fin segun gordo
				
			}//Fin if gordo
			
		} while (opcion!=0);
		
		
	}

}
