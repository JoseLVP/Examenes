package examen_1;

import java.util.Scanner;

public class Examen_1_JoseL_Valcarcel {

	static Scanner sc = new Scanner(System.in);
	static int Contador=0;
	static double PrecioTotal5=0;
	static int LitrosVendido=0;
	static int Facturacion600=0;
	
	public static void main(String[] args) {
		
		
		MenuPrincipal();

	}

	

	static void MenuPrincipal() {
		System.out.println("****************************************************");
		System.out.println("Bienvenido al Sevicio Automatico de Compra de Aceite");
		System.out.println("Seleccione una Accion a Realizar");
		System.out.println("****************************************************");
		System.out.println();
		System.out.println(" -> Comprar Aceite [Seleccione 1]\n -> Salir del Programa [Seleccione 2]");
		
		int SeleccionMenu = sc.nextInt();
		
		if (SeleccionMenu == 1) {
			SeleccionProducto();
		}
		
		if (SeleccionMenu == 2) {
			MenuPrincipal();
		}
	}
	
	static void SeleccionProducto() {

		System.out.println();
		System.out.println("Seleccione un Producto para Comprarlo");
		System.out.println();
		System.out.println(" -> Aceite de Oliva <> 2.45€ x Litro  [Seleccione 1]");
		System.out.println(" -> Aceite Virgen <> 3.28€ x Litro  [Seleccione 2]");
		System.out.println(" -> Aceite Virgen Extra <> 6.81€ x Litro  [Seleccione 3]");
		System.out.println();
		System.out.println(" Para volver al menu Principal [Seleccione 4]");
		
		int SeleccionAceite = sc.nextInt();
		
		if (SeleccionAceite == 3) {
			System.out.println();
			System.err.println("Producto Agotado, Seleccione otro");
			SeleccionProducto();
		}
		
		if (SeleccionAceite == 4) {
			MenuPrincipal();
		}
		
		
		if (SeleccionAceite == 1) {
			Aceite1();
		}
		
		if (SeleccionAceite == 2) {
			Aceite2();
		}
		
	}
	
	static void Aceite1() {
		
		System.out.println("Ha seleecionado el > Aceite de Oliva <");
		System.out.println("Indique el Numero de Litros que desea Adquirir - 2.45€ x Litro");
		
		int LitrosAceite1 = sc.nextInt();
		
		LitrosVendido = LitrosAceite1 + LitrosVendido;
		
		double PrecioTotal1 = LitrosAceite1 * 2.45;
		
		System.out.println("-> El precio Total de litros es de: " +PrecioTotal1+ "€, Es Correcto? [1 - Continuar | 2 - Modificar | 3 - Cambiar Producto | 4 - Salir]");
		
		if (PrecioTotal1 >= 600) {
			Facturacion600++;
		}
		
		int ConfirmacionAceite = sc.nextInt();
		
		
		if (ConfirmacionAceite == 1) {
			ImprimirTicket1(PrecioTotal1);
		}
		if (ConfirmacionAceite == 2) {
			Aceite1();
		}
		if (ConfirmacionAceite == 3) {
			SeleccionProducto();
		}
		if (ConfirmacionAceite == 4) {
			MenuPrincipal();
		}
		
		
	}
	
	
	static void Aceite2() {
		
		System.out.println("Ha seleecionado el > Aceite Virgen <");
		System.out.println("Indique el Numero de Litros que desea Adquirir - 3.28€ x Litro");
		
		int LitrosAceite2 = sc.nextInt();
		
		double PrecioTotal = LitrosAceite2 * 3.28;
		
		System.out.println("-> El precio Total de litros es de: " +PrecioTotal+ "€, Es Correcto? [1 - Continuar | 2 - Modificar | 3 - Cambiar Producto | 4 - Salir]");
		
		int ConfirmacionAceite = sc.nextInt();
		
		
		if (ConfirmacionAceite == 1) {
			ImprimirTicket2(PrecioTotal);
		}
		if (ConfirmacionAceite == 2) {
			Aceite2();
		}
		if (ConfirmacionAceite == 3) {
			SeleccionProducto();
		}
		if (ConfirmacionAceite == 4) {
			MenuPrincipal();
		}
		
	}

	
	static void ImprimirTicket1(double PrecioTotal1) {
		
		System.out.println("Imprimiendo Ticket...");
		
		System.out.println("+------------------------------------------------+");
		System.out.println("|                                                ");
		System.out.println("|     >Producto -> Aceite de Oliva               ");
		System.out.println("|     >Precio x Litro -> 2.45€                   ");
		System.out.println("|                                                ");
		System.out.println("|     >Precio Total ->"+PrecioTotal1+"           ");
		System.out.println("|                                                ");
		System.out.println("|     >Codigo Producto -> 7489#                  ");
		System.out.println("|                                                ");
		System.out.println("|                                                ");
		System.out.println("|                                                ");
		System.out.println("+------------------------------------------------+");
		
		PrecioTotal5 = PrecioTotal5 + PrecioTotal1;
		
		
		
		
		for (int i = 0; i<=15; i++) {
			System.out.println();
		}
		
		Contador++;
		if (Contador!=5) {
			MenuPrincipal();
		}
		
		if (Contador==5) {
			MenuPrincipal2();
		}
		
	}
	
	static void ImprimirTicket2(double PrecioTotal) {

		
		System.out.println("Imprimiendo Ticket...");
		
		System.out.println("+------------------------------------------------+");
		System.out.println("|                                                ");
		System.out.println("|       >Producto -> Aceite Virgen               ");
		System.out.println("|       >Precio x Litro -> 3.28€                 ");
		System.out.println("|                                                ");
		System.out.println("|       >Precio Total ->"+PrecioTotal+"          ");
		System.out.println("|                                                ");
		System.out.println("|                                                ");
		System.out.println("|       >Codigo Producto -> 2457#                ");
		System.out.println("|                                                ");
		System.out.println("|                                                ");
		System.out.println("+------------------------------------------------+");
		
		for (int i = 0; i<=15; i++) {
			System.out.println();
		}
		
		
		
		Contador++;
		if (Contador!=5) {
			MenuPrincipal();
		}
		
		if (Contador==5) {
			MenuPrincipal2();
		}
		
	}

	static void MenuPrincipal2() {
		System.out.println("****************************************************");
		System.out.println("Bienvenido al Sevicio Automatico de Compra de Aceite");
		System.out.println("Seleccione una Accion a Realizar");
		System.out.println("****************************************************");
		System.out.println();
		System.out.println(" -> Comprar Aceite [Seleccione 1]\n -> Salir del Programa [Seleccione 2]\n -> Facturacion total [Seleccione 3]");
		
		
		
		int SeleccionMenu = sc.nextInt();
		
		if (SeleccionMenu == 1) {
			SeleccionProducto();
		}
		
		if (SeleccionMenu == 2) {
			MenuPrincipal2();
		}
		
		if (SeleccionMenu == 3) {
			MenuFacturacion(PrecioTotal5);
		}
		
	}

	static void MenuFacturacion(double PrecioTotal5) {
		
		System.out.println("***Has entrado en el Menu de Facturacion***");
		System.out.println();
		System.out.println("La Facturacion total del Producto 1 [Aceite de Oliva] es de -> " +PrecioTotal5+ "€ en total");
		System.out.println("La cantidad de Litros Vendidos del Producto 1 [Aceite de Oliva] es de -> " +LitrosVendido+ " Litros en total");
		System.out.println("Las veces que el Producto 1 [Aceite de Oliva] ha facturado más de 600€ ha sido de -> " +Facturacion600+ " Veces");
		System.out.println();
		System.out.println();
		
		System.out.println("*******Cerrando Facturacion*******");
		System.out.println();
		MenuPrincipal2();
	}



}



















