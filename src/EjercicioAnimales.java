
public class EjercicioAnimales {
	// interfaz de sonido
	interface Sonido{
		void hacerSonido();
		void descripcionSonido();
	}
	// clase padre
	static class Animal{
		
		private String nombre;
		private int edad;
		
		// constructor
		Animal(String nombre, int edad){
			setNombre(nombre);
			setEdad(edad);
		}
		
		
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre=nombre;
		}
		
		public int getEdad() {
			return edad;
		}
		public void setEdad(int edad) {
			this.edad=edad;
		}
		
		
		public void mostrarInfo() {
			System.out.println("Nombre: " + nombre + ", edad: "+ edad);
		}
		
	}
	
		static class Perro extends Animal implements Sonido{
			
			private String raza;
			
		Perro(String nombre, int edad,String raza) {
			super(nombre, edad);
			this.raza=raza;	
		}

		@Override
		public void hacerSonido() {
			System.out.println("guau guau");	
		}

		@Override
		public void descripcionSonido() {			
			System.out.println("ladra");
		}
		
		public void mostrarInfo() {
			super.mostrarInfo();
			System.out.println("Raza: " + raza);
		}
		
	}
		
	static class Gato extends Animal implements Sonido{
		
		private boolean esCallejero;
		
		Gato(String nombre, int edad, boolean esCallejero){
			super(nombre, edad);
			this.esCallejero=esCallejero;
		}
			
		@Override
		public void hacerSonido() {
			System.out.println("miaauu");
		}
			
		@Override
		public void descripcionSonido() {
			System.out.println("maulla");
		}
		
		public void mostrarInfo() {
			super.mostrarInfo();
			System.out.println("Callejero?: " + esCallejero);
		}
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Perro perro1 = new Perro("Tonbi",10 , "chigui");
		Gato gati1= new Gato("Lolo", 8, true);
		
		perro1.mostrarInfo();
		perro1.hacerSonido();
		perro1.descripcionSonido();
		
		System.out.println("");
		
		gati1.mostrarInfo();
		gati1.hacerSonido();
		gati1.descripcionSonido();
		
	}

}
