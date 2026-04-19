import java.util.ArrayList;

public class AcuarioPOO {

	static class Pez{
		private String nombre;
		private double tamanio;
		private String espacie;
		private boolean hambre;
		
		public Pez(String nombre,double tamanio,String espacie){
			this.nombre=nombre;
			this.tamanio=tamanio;
			this.espacie=espacie;
		}
		
	
		
		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		


		public double getTamanio() {
			return tamanio;
		}

		public void setTamanio(double tamanio) {
			this.tamanio = tamanio;
		}


		

		public String getEspacie() {
			return espacie;
		}

		public void setEspacie(String espacie) {
			this.espacie = espacie;
		}


		
		

		public boolean isHambre() {
			return hambre;
		}

		public void setHambre(boolean hambre) {
			this.hambre = hambre;
		}


		

		
		public void comer() {
			hambre=false;
		}
		
	}

	static class Acuario{
		String nombre;
		int capacidad;
		double temperatura;
		
		private ArrayList<Pez> peces = new ArrayList<>();
		

		public void agregarPez(Pez p) {
			 
		}
		
		
		
		
		public void alimentarTodos() {
			for (Pez p : peces) {
			
			}
			
		}
		
		public void estado() {
			
		}
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// = "Acuario Nemo";
	
		Pez p1= new Pez("Nemo",15,"cangrejo");
		Pez p2= new Pez("Dory",7, "rio");
		Pez p3= new Pez("Bubbles",3, "mar");
		
		System.out.println("Nombre " + p1.getNombre()+
				". Especie " + p1.getEspacie()+
				". Tamaño " + p1.getTamanio());
		
		//alimentarTodos();
	}

}
