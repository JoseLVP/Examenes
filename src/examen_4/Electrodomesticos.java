package examen_4;

public class Electrodomesticos {

	private String Marca;
	private int Potencia;
	
	
	public Electrodomesticos() {
	}


	public Electrodomesticos( String marca, int potencia) {
		this.Marca = marca;
		this.Potencia = potencia;
	}


	public String getMarca() {
		return Marca;
	}


	public void setMarca(String marca) {
		this.Marca = marca;
	}


	public int getPotencia() {
		return Potencia;
	}


	public void setPotencia(int potencia) {
		this.Potencia = potencia;
	}
	
	
	
	
	
	
	
}
