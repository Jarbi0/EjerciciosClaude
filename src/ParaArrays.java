
public class ParaArrays {
	static class Alumno{
		
		private String nombre;
		private double [] notas= new double [5];
	
		
		Alumno(String nombre,double [] notas){
			setNombre(nombre);
			setNotas(notas);
		}
		



		public String getNombre() {		
				return nombre;
		}
		public void setNombre(String nombre) {
			if(nombre!= null && !nombre.isEmpty()) {  // ni nulo ni vacio
				this.nombre=nombre;
			}else this.nombre="Nombre incorrecto";
		}
		
		
		
		
		public double[] getNotas() {
			return notas;
		}
		public void setNotas(double [] notas) {
			for(int i = 0;i<5;i++) {
				if (notas[i]<=10 && notas[i]>=0) {
					this.notas[i]=notas[i];
			}else this.notas[i]=0;
			}
		}
		
		
		
		
		public void anadirNota(int posicion, double nota) {
			if (posicion >= 0 && posicion < 5 && nota >= 0 && nota <= 10) {
				this.notas[posicion]= nota;
			} else System.out.println("Posicion o nota invalida");
			
		}
		
		public void mostrarNotas() {
			for( int j=0; j<5; j++) {
			System.out.println("Nota: " + (j+1) + ". Ha sacado un: "+ notas[j]);
			}
		}
		
		public double calcularMedia() {
			double media= 0;
			for(int k=0;k<5;k++) {
				media=media+notas[k];
			}
			media= media/5;
			return media;
		}
			
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] notasA1= {7.5, 8, 5.5, 9, 6};
		Alumno a1= new Alumno("Juan", notasA1);
		
		a1.anadirNota(2, 4);
		System.out.println("");
		a1.mostrarNotas();
		System.out.println("");
		System.out.println("Nota media: " + a1.calcularMedia());
	}

}
