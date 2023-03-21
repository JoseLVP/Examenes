package examen_4;

import java.util.Scanner;

public class Controller {

	static Scanner sc = new Scanner(System.in);
	static int PrecioLavadora = 400;
	static int SeleccionContructor;

	public static void main(String[] args) {

		System.out.println("\n ** Compra de Electrodomesticos ** ");
		MenuPrincipal();

	}

	static void MenuPrincipal() {

		System.out.println("\nSeleccione un Producto ->\n[ 1 ] > Lavadora\n[ 2 ] > Horno");

		int Seleccion = sc.nextInt();

		switch (Seleccion) {
		case 1 -> {

			System.out.println("1 - Lavadora");
			System.out.println("\nIntroduza la Marca Deseada -> ");
			String MarcaLavadora = sc.next();
			System.out.println("\nIndique la Potencia Deseada -> ");
			int PotenciaLavadora = sc.nextInt();
			System.out.println("Indique Contructor a Formar [1 / 2]");
			SeleccionContructor = sc.nextInt();

			switch (SeleccionContructor) {
			case 1 -> {
				Lavadora miLavadora = new Lavadora(MarcaLavadora, PotenciaLavadora, false);

				miLavadora.MostrarDatos1(miLavadora.getMarca(), miLavadora.getPotencia(), false);

				double Consumo = miLavadora.Consumo(PotenciaLavadora);

				System.out.println("La Potencia Consumida es de un Total de -> " + Consumo + " Kw/Dia");

				System.out.println("\nEl Coste total es de -> " + miLavadora.Precio(Consumo) + " €");

				

			}

			case 2 -> {
				System.out.println("Como desea que se encuentre el agua? [True - Caliente | False - Fria");
				boolean SeleccionAgua = sc.nextBoolean();
				Lavadora miLavadora2 = new Lavadora(MarcaLavadora, PrecioLavadora, PotenciaLavadora, SeleccionAgua);

				miLavadora2.MostrarDatos2(miLavadora2.getMarca(), PrecioLavadora, miLavadora2.getPotencia(),
						SeleccionAgua);

				double Consumo = miLavadora2.Consumo(PotenciaLavadora);

				System.out.println("La Potencia Consumida es de un Total de -> " + Consumo + " Kw/Dia");

				System.out.println("\nEl Coste total es de -> " + miLavadora2.Precio(Consumo) + " €");

				

			}

			}
		}

		default -> System.err.println("Seleccione una Opcion Valida / Solo Lavadora");

		}

		MenuPrincipal();

	}

}
