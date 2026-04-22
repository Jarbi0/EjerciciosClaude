
public class HerenciaVeiculos {
	
	class Vehiculo{
		private String marca;
		private int velocidadMaxima;
		
		Vehiculo(String marca, int velocidadMaxima){
			setMarca(marca);
			setVelocidadMaxima(velocidadMaxima);
		}
		
		
		public String getMarca() {
			return marca;
		}
		public void setMarca(String marca) {
			this.marca = marca;
		}
		
		
		public int getVelocidadMaxima() {
			return velocidadMaxima;
		}
		public void setVelocidadMaxima(int velocidadMaxima) {
			this.velocidadMaxima= velocidadMaxima;
		}
		
		
		
		public void mostrarInfo() {
			System.out.println("velocidadMaxima; " + velocidadMaxima + " marca: "+ marca);
		}
	}
	
	class Coche extends Vehiculo{
		private int numeroPuertas;
		
		Coche(String marca, int velocidadMaxima, int numeroPuertas){
			super(marca,velocidadMaxima);
			this.numeroPuertas= numeroPuertas;
		}
		
		public void mostrarInfo() {
			System.out.println("velocidadMaxima; " + getVelocidadMaxima() + " marca: "+ getMarca() + "puertas: "+ numeroPuertas);
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
