import java.util.ArrayList;

public class CarritoCompra {
	class Carrito{
		private String propietario;
		private ArrayList<String> productos;
		private ArrayList<Double> precios;
		
		
		
		
		public String getPropietario() {
			return propietario;
		}
		public void setPropietario(String propietario) {
			this.propietario = propietario;
		}
		
		
		
		public ArrayList<String> getProductos() {
			return productos;
		}
		public void setProductos(ArrayList<String> productos) {
			this.productos = productos;
		}
		
		
		
		public ArrayList<Double> getPrecios() {
			return precios;
		}
		public void setPrecios(ArrayList<Double> precios) {
			this.precios = precios;
		}
		
		
		// 2
		public void añadirProducto(String producto, double precio) {
			if (producto != null && !producto.isEmpty()) {
				this.productos.addLast(producto);
			} else System.out.println("Producto no valido");
			if (precio>0) {
				this.precios.addLast(precio);
			} else System.out.println(0);	
		}
		
		// 3 
		public void eliminarProducto(String producto) {
			this.productos.remove(producto);
			this.precios.remove(producto);
		}
		
		// 4
		public void calcularTotal(double total) {
			for (int i=0;i<precios.size(); i++) {
				total = total + precios[i];
			}
		System.out.println("Total: " + total + "€");
		}
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	}

}
