import java.util.ArrayList;

public class BibliotecaEjercicio {
	static class Biblioteca{
		
		private String nombre;
		private ArrayList<String> libros;
		private ArrayList<String> autores;
		
		public String getNombre(String nombre) {
			return nombre;
		}
		public void setNombre() {
			this.nombre= nombre;
		}
		
		
		public void añadirLibro(String libro, String autor) {
			if (libro!=null && !libro.isEmpty() && autor!=null && !autor.isEmpty()) {
				this.libros.addLast(libro);
				this.autores.addLast(autor);
				System.out.println("Hemos añadido el libro y  su autor.");
			} else System.out.println("Libro o autor incorrectos");
		}
		
		
		public void eliminarLibro(String libro) {
			int indice = libros.indexOf(libro);
			if (indice!=-1) {
				libros.remove(indice);
				autores.remove(indice);
				System.out.println("Libro y autor eliminados.");
			} else System.out.println("Ese libro no se encuentra en nuestros archivos");
			}
		
		
		public void buscarAutor(String libro) {
			int indice = libros.indexOf(libro);
			if (indice!=-1) {
				System.out.println("El autor de este libro es: " + autores.get(indice));
			} else System.out.println("Ese libro no se encuentra en nuestros archivos");
			}
		
		
		public void mostrarLibros() {
			for (int i=0;i<libros.size();i++) {
				System.out.println("Libro: " + libros.get(i) + " pertenece al autor: " + autores.get(i));
				}
			}
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		
	}

}
