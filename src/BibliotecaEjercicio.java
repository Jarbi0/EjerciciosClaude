import java.util.ArrayList;

public class BibliotecaEjercicio {
	static class Biblioteca{
		
		private String nombre;
		private ArrayList<String> libros;
		private ArrayList<String> autores;
		
		Biblioteca(String nombre){
			setNombre(nombre);
			this.libros= new ArrayList<>();
			this.autores= new ArrayList<>();
		}
		
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			if(nombre!=null && !nombre.isEmpty()) {
				this.nombre= nombre;
			}else System.out.println("Npombre incorrecto");
		}
		
		
		public void añadirLibro(String libro, String autor) {
			if (libro!=null && !libro.isEmpty() && autor!=null && !autor.isEmpty()) {
				this.libros.addLast(libro);
				this.autores.addLast(autor);
				System.out.println("Hemos añadido el libro: " + libro +" y su autor: "+ autor);
			} else System.out.println("Libro o autor incorrectos");
		}
		
		
		public void eliminarLibro(String libro) {
			int indice = libros.indexOf(libro);
			if (indice!=-1) {
				libros.remove(indice);
				autores.remove(indice);
				System.out.println("Libro: " + libro + " y su autor eliminados.");
			} else System.out.println("Ese libro no se encuentra en nuestros archivos");
			}
		
		
		public void buscarAutor(String libro) {
			int indice = libros.indexOf(libro);
			if (indice!=-1) {
				System.out.println("El autor de este libro es: " + autores.get(indice));
			} else System.out.println("Ese libro no se encuentra en nuestros archivos");
			}
		
		
		public void mostrarLibros() {
			System.out.println("Los libros de " + nombre + " son:");
			for (int i=0;i<libros.size();i++) {
				System.out.println("Libro: " + libros.get(i) + " pertenece al autor: " + autores.get(i));
				}
			}
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Biblioteca biblio=new Biblioteca("La lectura"); 

		biblio.añadirLibro("libro1", "autor1");
		biblio.añadirLibro("libro2", "autor2");
		biblio.añadirLibro("libro3", "autor3");
		
		System.out.println("");
		
		
		biblio.mostrarLibros();
		
		System.out.println("");
		
		biblio.buscarAutor("libro2");
		
		System.out.println("");
		
		biblio.eliminarLibro("libro1");
		
		System.out.println("");
		
		biblio.mostrarLibros();
		
		
	}

}
