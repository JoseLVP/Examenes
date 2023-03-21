package examen_3;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class JoseL_Valcarcel_Examen_3{

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Bienvenido();

	}

	static void Bienvenido() {

		System.out.println(" - Bievenido a Casa Paco - ");

		CantidadPersonas();

	}

	static void CantidadPersonas() {

		System.out.println(" - Indique el Numero de Personas [1-5] -");
		int NumeroPersonas = sc.nextInt();

		if (NumeroPersonas >= 1 && NumeroPersonas <= 5) {

			System.out.println("El Numero de personas indicadas es [" + NumeroPersonas + "] Es correcto?");
			System.out.println("> [1] - Continuar");
			System.out.println("> [2] - Cambiar Numero Peronas");
			System.out.println("> [3] - Cancelar Pedido");

			
			
			int SeleccionPeronas = sc.nextInt();

			if (SeleccionPeronas == 1) {
				
				MenuPrincipal(NumeroPersonas);
			}
			if (SeleccionPeronas == 2) {
				CantidadPersonas();
			}
			if (SeleccionPeronas == 3) {
				Bienvenido();
			}
			
			if (SeleccionPeronas <=0 || SeleccionPeronas>= 4) {
				System.err.println("Indique un valor Valido");
				System.out.println();
				CantidadPersonas();
				
			}

		} else {
			System.err.println("Indique un valor Valido");
			CantidadPersonas();
		}

	}
	
	

	static void MenuPrincipal(int NumeroPersonas) {

		int TablaPersonas[] = new int [NumeroPersonas];
	

		System.out.println(" - Menu del Dia - ");

		System.out.println("> [#1] - Patatas Fritas con Albongidas");
		System.out.println("> [#2] - Salmon Ahumado con Patatas Horneadas");
		System.out.println("> [#3] - Lentejas con Chorizo");

		
		
		for (int i = 0; i <=TablaPersonas.length-1; i++) {
			
			System.out.println();
			System.out.println("Indique el Pedido del Cliente [" +(i+1)+ "]");
			
			int NumeroPedido = sc.nextInt();
			
			if (NumeroPedido>=1 && NumeroPedido<=3) {
				
				TablaPersonas[i] = NumeroPedido;
				System.out.println("Pedido Anotado!");
			} else {
				
				System.err.println("Introduzca un Valor Valido, Por favor");
				i--;
			}
		}
		System.out.println();
		
		RepasoFinal(TablaPersonas, NumeroPersonas);
		
	}
	
	static void RepasoFinal(int[] TablaPersonas, int NumeroPersonas) {
		
		
		 for (int j = 0; j <=TablaPersonas.length-1; j++) {
			 
			 System.out.print("El Cliente " +(j+1)+ " -> Va a tomar el Menu #" +TablaPersonas[j] );
			 
			 if (TablaPersonas[j] == 1) {
				System.out.println(" - Patatas Fritas con Albongidas");
			}
			 if (TablaPersonas[j] == 2) {
				System.out.println(" - Salmon Ahumado con Patatas Horneadas");
				}
			 if (TablaPersonas[j] == 3) {
				System.out.println(" - Lentejas con Chorizo");
				}	 
		 }
		
		System.out.println();
		System.out.println(" - Los datos son Correctos? -");
		System.out.println(" [1] - Confirmar Datos y Solicitar Pedido");
		System.out.println(" [2] - Modificar Pedido");
		System.out.println(" [3] - Modificar Numero Clientes");
		System.out.println(" [4] - Cancelar Pedido");
		
		int SeleccionFinal = sc.nextInt();
		
		if (SeleccionFinal == 1) {
			
			ImprimirTicket(TablaPersonas);
		}
		
		if (SeleccionFinal == 2) {
			
			System.out.print("Indique el Pedido que desea cambiar -> ");
			int CambioPedido = sc.nextInt();
			System.out.println("Que Menu desea en Sustitucion al Anterior? #1, #2, #3 ?");
			int NuevoPedido = sc.nextInt();
			TablaPersonas[CambioPedido-1] = NuevoPedido;
			RepasoFinal(TablaPersonas, NumeroPersonas);
			
		}
		
		if (SeleccionFinal == 3) {
			
			CantidadPersonas();
		}
		
		if (SeleccionFinal == 4) {
			
			Bienvenido();
		}
		
		if (SeleccionFinal <=0 || SeleccionFinal>=5) {
			System.err.println("Introduzca un Valor Valido, Por favor");
			
		}
	}
	
	static void ImprimirTicket(int[] TablaPersonas) {
		
		System.out.println("+------------------------------------------------");
		System.out.println("|                       					 	 ");
		System.out.println("|   Imprimiendo Ticket  						 ");
		System.out.println("|                       						 ");
		System.out.println("|   #1 - Patatas Fritas con Albongidas           ");
		System.out.println("|   #2 - Salmon Ahumado con Patatas Horneadas    ");
		System.out.println("|   #3 - Lentejas con Chorizo                    ");
		System.out.println("|                       					 	 ");
		System.out.println("|  "+Arrays.toString(TablaPersonas)+ "           ");
		System.out.println("|                       					 	 ");
		System.out.println("+------------------------------------------------");
		
		
		for (int w = 0; w<=10; w++) {
			
			System.out.println();	
		}
		
		
		Bienvenido();
	}
	
}
