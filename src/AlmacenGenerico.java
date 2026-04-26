import java.util.ArrayList;

public class AlmacenGenerico {
	
	static class excepcionExcepciones extends RuntimeException{
		public excepcionExcepciones(String mensaje) {
			super(mensaje);
		}
	}
	
	
	static class Caja<T>{
		private T nombre;
		private ArrayList<T> items = new ArrayList <>();
		
		Caja(T nombre) {
			setNombre(nombre);
			this.items= new ArrayList<>();
		}

		public T getNombre() {
			return nombre;
		}
		public void setNombre(T nombre) {
			this.nombre = nombre;
		}
		
		public void añadir(T item) {
			items.add(item);
			System.out.println("Elemento: " + item + " ha sido añadido.");
		}
		public void eliminar(T item) {
			if (items.contains(item)) {
				items.remove(item);
				System.out.println("Elemento: " + item + " ha sido eliminado.");
			} else throw new excepcionExcepciones("Este item: " + item + " no esta.");
		}
		public void mostrar() {
			System.out.println("Almacen " + nombre + ":");
			for (T m : items) {
				System.out.println(m);
			}
		}
		public void obtener(int indice) {
			System.out.println("En la posicion " + indice + " del almacen "+ nombre+ " esta: " +items.get(indice));
		}
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Caja<String> almacen1 = new Caja<>("Comida");
		Caja<Integer> almacen2 = new Caja<>(0);
		
		almacen1.añadir("pan");
		almacen1.añadir("leche");
		almacen1.añadir("azucar");
		almacen1.añadir("alioli");
		almacen2.añadir(6);
		almacen2.añadir(8);
		almacen2.añadir(9);
		almacen2.añadir(3);
		
		almacen1.mostrar();
		almacen2.mostrar();
		
		almacen1.eliminar("pan");
		almacen2.eliminar(3);
		
		almacen1.obtener(2);
		almacen2.obtener(1);
		
		almacen1.mostrar();
		almacen2.mostrar();
	}

}
