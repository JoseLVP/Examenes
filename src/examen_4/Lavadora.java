package examen_4;

import java.util.Scanner;

public class Lavadora extends Electrodomesticos {

	private int Precio;
	private boolean AguaCaliente;
	
	
	public Lavadora(String Marca, int Potencia, boolean AguaCaliente) {
		super(Marca, Potencia);
		AguaCaliente = false;
	}


	public Lavadora(String Marca, int Precio, int Potencia, boolean AguaCaliente) {
		super(Marca, Potencia);
		AguaCaliente = true;
	}


	public int getPrecio() {
		return Precio;
	}


	public void setPrecio(int precio) {
		Precio = precio;
	}


	public boolean isAguaCaliente() {
		return AguaCaliente;
	}


	public void setAguaCaliente(boolean aguaCaliente) {
		AguaCaliente = aguaCaliente;
	}
	
	
	@Override
	public String toString() {
		return "Lavadora [Precio=" + Precio + ", AguaCaliente=" + AguaCaliente + "]";
	}
	


	static void MostrarDatos1(String Marca, int Potencia, boolean Caliente) {
		
		System.out.println("La Marca Elegida es -> " +Marca);
		System.out.println("La Potencia Elegida es -> " +Potencia+ "Kw/Hora");
		System.out.println("El Agua esta Actualmente Caliente? -> " +Caliente);
		
		
		
		
	}
	
	static void MostrarDatos2(String Marca, int Precio, int Potencia, boolean Caliente) {
		
		System.out.println("La Marca Elegida es -> " +Marca);
		System.out.println("El Precio de la Lavadora es -> " +Precio+ " €");
		System.out.println("La Potencia Elegida es -> " +Potencia+ " Kw/Hora");
		System.out.println("El Agua esta Actualmente Caliente? -> " +Caliente);
		
		
	}
	
	static double Consumo(int Potencia) {
		
		System.out.println("\nCuantas Horas usa La Lavadora?");
		int HorasConsumo = new Scanner(System.in).nextInt();
		
		double Calculo = (Potencia / 100) * HorasConsumo;
		
		
		return Calculo;
	}
	
	static double Precio(double Consumo) {
		
		System.out.println("El Precio del Kw/H esta a 0.35 centimos");
		
		double Precio = Consumo * 0.35;
		
		return Precio;
	}
	
}
