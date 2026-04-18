
public class Pecera {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre = "Acuario Nemo";
		int capacidad = 200;  //litros
		double temperatura = 24.5;
		boolean luzEncendida = true;
		
		double capacidad80 = capacidad*0.80;
		
		//Peces en total
		int contPeques=0, contMedis=0, contGrands=0;
		

		
		if (temperatura>28) {
			System.out.println("Vigile la temperatura");
		}
	
		System.out.println("La pecera " + nombre + " tiene " +
		capacidad + " litros de capacidad, esta a " + temperatura +
		" grados. Luz: " + luzEncendida + ". La llenamos al 80%: " + 
		capacidad80 + " litros.");
		
		
		String [] arrayPeces = { "Nemo","Dory", "Bubbles","Gill","Peach"};
		int[]  arrayTamanios = {8,20,3,15,6};
		
		
		System.out.println("--- Peces grandes ---");
		for(int i=0;i<arrayPeces.length; i++) {
			
			// Filtro: solo imprime los mayores de 10 cm
			if (arrayTamanios[i]>10) {
				System.out.println("El pez "+arrayPeces[i]+ " mide " + arrayTamanios[i]+ "cm.");
			}
		}
		System.out.println("");
			
		System.out.println("--- Clasificacion ---");
		for(int i=0;i<arrayPeces.length; i++) {
			
			// Para usar switch con rangos, convertimos el tamaño a una categoría (1, 2 o 3)
			int categoria;
			
			if (arrayTamanios[i]<5) {
				categoria=1;
			}
			else if (arrayTamanios[i]>=5 && arrayTamanios[i]<=15) {
				categoria=2;
			}
			else {
				categoria=3;
			}
		
			// aqui el switch
			switch (categoria){
				case 1:
					System.out.println(arrayPeces[i] + " -> pequeño");
					contPeques++;
					break;
				case 2:
					System.out.println(arrayPeces[i] + " -> mediano");
					contMedis++;
					break;
				case 3:
					System.out.println(arrayPeces[i] + " -> grande");
					contGrands++;
					break;
			}
			
		 }
		
	
		System.out.println("");
		
		System.out.println("Peces pequeños: " + contPeques);
		System.out.println("Peces medianos: " + contMedis);
		System.out.println("Peces grandes: " + contGrands);
		
		
		
		}
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


