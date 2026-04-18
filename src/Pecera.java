
public class Pecera {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre = "Acuario Nemo";
		int capacidad = 200;  //litros
		double temperatura = 24.5;
		boolean luzEncendida = true;
		
		double capacidad80 = capacidad*80/100;
		
	
		if (temperatura>28) {
			System.out.println("Vigile la temperatura");
		}
	
		System.out.println("La pecera " + nombre + " tiene " +
		capacidad + " litros de capacidad, esta a " + temperatura +
		" grados. Luz: " + luzEncendida + ". La llenamos al 80%: " + 
		capacidad80 + " litros.");
	}

}
