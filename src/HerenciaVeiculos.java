
public class HerenciaVeiculos {
	
	static class Vehiculo{
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
	
	// clase coche
	static class Coche extends Vehiculo{
		private int numeroPuertas;
		
		Coche(String marca, int velocidadMaxima, int numeroPuertas){
			super(marca,velocidadMaxima);
			this.numeroPuertas= numeroPuertas;
		}
		
		@Override
		public void mostrarInfo() {
			super.mostrarInfo();
			System.out.println("puertas: "+ numeroPuertas);
		}
		
	}
	
	
	// clase moto
	static class Moto extends Vehiculo{
		private boolean tieneSidecar;
		
		Moto(String marca, int velocidadMaxima, boolean tieneSidecar){
			super(marca,velocidadMaxima);
			this.tieneSidecar= tieneSidecar;
		}
		
		@Override
		public void mostrarInfo() {
		    super.mostrarInfo();
		    System.out.println("tieneSidecar: " + tieneSidecar);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Coche coche1=new Coche("marca1", 120, 4);
		Moto moto1 = new Moto("marcamoto", 160, true);
		
		coche1.mostrarInfo();
		moto1.mostrarInfo();
	}

}
