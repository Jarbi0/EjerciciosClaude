
public class AcuarioPOO {

	class Pez{
		String nombre;
		double tamanio;
		String espacie;
		boolean hambre;
		
		Pez(String nombre,double tamanio,String espacie,boolean hambre){
			this.nombre=nombre;
			this.tamanio=tamanio;
			this.espacie=espacie;
			this.hambre=hambre;	
		}
		
		public void get() {
			
		}
		
		public boolean comer() {
			return hambre=false;
		}
		
	}

	class Acuario{
		String nombre;
		int capacidad;
		double temperatura;
		String [] peces;
		
		//agregar peces
		
		public boolean alimentado() {
			
		}
		
		public void estado() {
			
		}
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
