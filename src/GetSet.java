
public class GetSet {
	
	static class Persona{
		private String nombre;
		private int edad;
		private String email;
		
		Persona(String nombre,int edad, String email){
			setNombre(nombre);
			setEdad(edad);
			setEmail(email);
		}
		
		
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			if (nombre!=null && !nombre.isEmpty()) { // devuelve true si lengrh no es 0
				this.nombre = nombre;
			}else this.nombre="Nombre incorrecto";
		}
		
		
		
		public int getEdad() {
			return edad;
		}
		public void setEdad(int edad) {
			if (edad>0 && edad<=120) {
				this.edad= edad;
			}else this.edad= 0;
		}
		
		
		
		public String getEmail() {;
			return email;
		}
		public void setEmail(String email) {
			if (email.contains("@") && (email.contains(".com") || email.contains(".es"))) {;
				this.email=email;
			}else this.email="Correo incorrecto";
		}
		
		
		public void mostrarInfo() {
			System.out.println("-Nombre: "+ getNombre() + 
					".			-Edad: " + getEdad() 
					+ ".			-Email: "+ getEmail()+ ".");
		}
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona hombre1= new Persona("Juan", 35, "correo@adoo.com");
		Persona mujer1= new Persona("Maria", 93, "alww@loyrt.com");
		Persona error = new Persona("", -5, "sinArrobacom");
		
		
		hombre1.mostrarInfo();
		mujer1.mostrarInfo();
		error.mostrarInfo();
	}

}
