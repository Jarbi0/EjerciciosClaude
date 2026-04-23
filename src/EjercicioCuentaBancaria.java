
public class EjercicioCuentaBancaria {
	static class CuentaBancaria{
		private String titular;
		private double saldo;
	
		CuentaBancaria(String titular,double saldo){
			setSaldo(saldo);
			this.titular=titular;
		}
		
		public double getSaldo() {
			return saldo;
		}

		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}




		public void ingresar(double cantidad) {
			if(cantidad<=0) {
			throw new IllegalArgumentException("Valor no valido");
			}
		}
		
		public void retirar(double cantidad) {
			if (cantidad>saldo || cantidad<=0) {
				throw new IllegalArgumentException("Valor no valido2");
			}
		}
		
		public void mostrarSaldo(){
			System.out.println("Su saldo es de : "+ saldo+ "€");
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CuentaBancaria b1= new CuentaBancaria("BBk", 12000);
		
		try {
			b1.ingresar(0);
		} catch (IllegalArgumentException e) {
			System.out.println("Error: "+ e.getMessage());
		}
		
		try {
			b1.retirar(110);
		} catch (IllegalArgumentException e) {
			System.out.println("Eror2: " + e.getMessage());
		}
		
		System.out.println("Saldo: " + b1.getSaldo() + "€ en Titular:  " + b1.titular);
	}

}
