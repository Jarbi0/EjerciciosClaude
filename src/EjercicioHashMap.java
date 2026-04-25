import java.util.HashMap;

public class EjercicioHashMap {
	/*
	HashMap<String, String> mapa = new HashMap<>();
	
	mapa.put("SNI123", "Juan");		// añadir
	mapa.get("DNI123"); 			// obtener por clave → "Juan"
	mapa.remove("DNI123");			// eliminar
	mapa.containsKey("DNI123");		// ¿existe esa clave? → true/false
	mapa.size();					// número de elementos
	
	
	// Recorrer todos los pares
	for (String clave : mapa.keySet()) {
	System.out.println(clave + " → " + mapa.get(clave));
	}
	

*/
static class TelefonoInexistente extends RuntimeException{
	public TelefonoInexistente(String mensaje) {
		super(mensaje);
	}
}
	
 static class Agenda{
	 private String propietario;
	 private HashMap<String,String> contacto = new HashMap<>();
	 
	 
	 Agenda(String propietario){
		 setPropietario(propietario);
		 this.contacto = new HashMap<>();
	 }

	 
	 public String getPropietario() {
		 return propietario;
	 }
	 public void setPropietario(String propietario) {
		 this.propietario = propietario;
	 }
	 

	 public HashMap<String, String> getContacto() {
		 return contacto;
	 }
	 public void setContacto(HashMap<String, String> contacto) {
		 this.contacto = contacto;
	 }
	 
	 
	 public void añadirContacto(String telefono, String nombre) {
		 if (!contacto.containsKey(telefono)) {
			 contacto.put(telefono, nombre);
			 System.out.println("se ha eñadido: " + telefono+ " " + nombre);
		 } else System.out.println("Ese telefono ya existe");
	 }	 
	 public void eliminarContacto(String telefono) {
		 if (contacto.containsKey(telefono)) {
			 contacto.remove(telefono);
			 System.out.println("telefono y contacto de " + telefono+ " han sido elimindados");
			 }else throw new TelefonoInexistente ("El contacto no existe");
	 }
	 public void buscarContactos(String telefono) {
		 if(contacto.containsKey(telefono)) {
			 System.out.println("El nombre del telefono " + telefono +" es: " + contacto.get(telefono));
		 }else throw new TelefonoInexistente ("Contacto no encontrado");
	 }
	 public void mostrarContactos() {
		 System.out.println("Los lientes de: " + getPropietario());
		 for(String telefono : contacto.keySet()) {
			 System.out.println( " "+ telefono+ " son -> "+ contacto.get(telefono));
		 }
	 }
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Agenda p1 = new Agenda("Empresa1");

		
		p1.añadirContacto("73455", "Juan");
		p1.añadirContacto("68324", "Andres");
		p1.añadirContacto("68324", "Ana");
		p1.añadirContacto("25666", "Karen");
		p1.mostrarContactos();
		
		System.out.println("");
		
		p1.eliminarContacto("73455");
		p1.mostrarContactos();
		
		System.out.println("");
		
		p1.buscarContactos("25666");
		p1.mostrarContactos();
	}

}
