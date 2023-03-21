package examen_2;

import java.util.Scanner;

public class JoseL_Valcarcel_Examen_2 {

	static Scanner sc = new Scanner(System.in);
	static String NombreUsuario, ApellidoUsuario, EmailUsuario, ContraseñaUsuario;
	static int Contador = 0;
	static String NuevaNuevaContraseña;
	
	public static void main(String[] args) {
		
		Bienvenido();
		

	}

	static void Bienvenido() {
		
		System.out.println("***** Bienvenido al Menu de Windows *****");
		MenuPrincipal();
	}
	
	static void MenuPrincipal() {
		
		System.out.println("*** Seleccione una funcion para Realizar ***");
		System.out.println();
		
		System.out.println("+----------------------------------------------+");
		System.out.println("|                                               ");
		System.out.println("| -> Nuevo Usuario              [ Seleccione 1 ]");
		System.out.println("| -> Modificar Usuario          [ Seleccione 2 ]");
		System.out.println("| -> Eliminar Usuario           [ Seleccione 3 ]");
		System.out.println("| -> Cambiar Contraseña         [ Seleccione 4 ]");
		System.out.println("| -> Visualizar Datos Usuario   [ Seleccione 5 ]");
		System.out.println("|                                               ");
		System.out.println("+----------------------------------------------+");
		int SeleccionMenu = sc.nextInt();
		
		if (SeleccionMenu == 1) 
			NuevoUsuario();
		
		if (SeleccionMenu == 2) 
			ModificarUsuario();
		
		if (SeleccionMenu == 3) 
			EliminarUsuario();
		
		if (SeleccionMenu == 4) 
			CambiarContraseña();
		
		if (SeleccionMenu == 5) {
			
			if (Contador == 0) {
				System.err.println("Aun no se han introducido datos de Usuario");
				System.out.println();
				MenuPrincipal();
			}
			
			if (Contador >=1) {
				System.out.println("El Nombre y Apellido del Usuario es -> " +NombreUsuario+ " " +ApellidoUsuario);
				System.out.println("El Email del Usuario es -> " +EmailUsuario);
				System.out.println();
				MenuPrincipal();
			}
		}
		
		if (SeleccionMenu >=6 || SeleccionMenu <=0) {
			
			System.err.println("Seleccione una Opcion Valida");
			System.out.println();
			MenuPrincipal();
			
		}
			
		
	}
	
	static void NuevoUsuario() {
			
		System.out.println(" > Ha seleccionado [Nuevo Usuario], Es correcto? [ 1 - Continuar | 2 - Volver ]");
		int SeleccionNuevoUsuario = sc.nextInt();
		
		if (SeleccionNuevoUsuario == 2)
			MenuPrincipal();
		
		if (SeleccionNuevoUsuario >=3 || SeleccionNuevoUsuario <=0)
			System.out.println(" -> Seleccione una Opcion Valida");
		
		if (SeleccionNuevoUsuario == 1) {
			IntroducirDatosNuevoUsuario();
		}
		
	}
	
	static void IntroducirDatosNuevoUsuario() {
		
		System.out.println(" > Introduce el Nombre del Usuario");
		NombreUsuario = sc.next();
		System.out.println(" > Introduce el Primer Apellido del Usuario");
		ApellidoUsuario = sc.next();
		System.out.println(" > Introduce el email del Usuario");
		EmailUsuario = sc.next();
		System.out.println(" > Introduce la contraseña del Usuario");
		ContraseñaUsuario = sc.next();
		
		System.out.println(" > Los datos Introducidos son -> ");
		System.out.println();
		
		System.out.println(" -> El nombre y apellidos del Usuario son -> " +NombreUsuario+ " " +ApellidoUsuario);
		System.out.println(" -> El email del Usuario es -> " +EmailUsuario);
		System.out.println(" -> La contraseña del Usuario es -> ****** ");
		
		
		System.out.println();
		System.out.println(" > Que desea hacer a continuacion -> [ 1 - Mostrar Contraseña | 2 - Volver al Menu Principal] | 3 - Modificar Datos Introducidos");
		
		int SeleccionFinalizar = sc.nextInt();
		
		if (SeleccionFinalizar == 1) {
			System.err.println(" > La contraseña del Usuario es -> " +ContraseñaUsuario);
			System.out.println();
			
			System.out.println(" > Que desea hacer a continuacion -> [ 1 - Volver al Menu Principal] | 2 - Modificar Datos Introducidos");
			
			SeleccionFinalizar = sc.nextInt();
			
			
			if (SeleccionFinalizar <=0 || SeleccionFinalizar >=3) {
				System.out.println(" > Seleccione una seleccion Valida");
				
			}
			
			if (SeleccionFinalizar == 1) {
				Contador++;
				MenuPrincipal();
			}
			
			if (SeleccionFinalizar == 2) {
				IntroducirDatosNuevoUsuario();
			}
			
		}
		
		if (SeleccionFinalizar == 2) {
			Contador++;
			MenuPrincipal();
		}
		
		if (SeleccionFinalizar == 3) {
			IntroducirDatosNuevoUsuario();
		}
		
	}
		
	static void ModificarUsuario() {
		
		if (Contador == 0) {
			System.err.println("No existe ningun Usuario disponible, Por favor, cree un nuevo usuario");
			System.out.println();
			MenuPrincipal();
			
		}
		
		
		System.out.println("Ha seleccionado [Modificar Usuario], Es correcto? [ 1 - Continuar | 2 - Volver ]");
		int SeleccionModificarUsuario = sc.nextInt();
		
		if (SeleccionModificarUsuario == 1) {
			DatosModificarUsuario();
		}
		
		if (SeleccionModificarUsuario == 2) {
			MenuPrincipal();
		}
	}
	
	static void DatosModificarUsuario() {
		
		System.out.println("El Nombre y Apelido del usuario Actual es -> " +NombreUsuario+ " " +ApellidoUsuario+ " Desea Modificarlo? [ 1 - Si | 2 - No]");
		
		int ModificarNombreApellido = sc.nextInt();
		
		if (ModificarNombreApellido == 1) {
			
			System.out.println("Introduzca el Nuevo Nombre del Usuario");
			String NuevoNombre = sc.next();
			NombreUsuario = NuevoNombre;
			
			System.out.println();
			System.out.println("Introduzca el Nuevo Apellido del Usuario");
			String NuevoApellido = sc.next();
			ApellidoUsuario = NuevoApellido;
			
		if (ModificarNombreApellido == 2) {}
		
		System.out.println("La direccion de Email del Usuario es -> " +EmailUsuario+" Desea Modificarlo? [ 1 - Si | 2 - No]");
		
		int ModificarEmail = sc.nextInt();
		
		if (ModificarEmail == 1) {
			System.out.println("Introduzca el Nuevo Email del Usuario");
			String NuevoEmail = sc.next();
			EmailUsuario = NuevoEmail;
		}
		
		if (ModificarNombreApellido == 2) {}
		
		System.out.println("La contraseña del Usuario es -> " +ContraseñaUsuario+" Desea Modificarlo? [ 1 - Si | 2 - No]");
		
		int ModificarContraseña = sc.nextInt();
		
		if (ModificarContraseña == 1) {
			System.out.println("Introduzca la nueva contraseña del Usuario");
			String NuevaContraseña = sc.next();
			ContraseñaUsuario = NuevaContraseña;
		}
		
		if (ModificarContraseña == 2) {}
		
		System.out.println("Los datos finales son -> ");
		System.out.println("   Nombre Usuario -> " +NombreUsuario);
		System.out.println("   Apellido Usuario -> " +ApellidoUsuario);
		System.out.println("   Email Usuario -> " +EmailUsuario);
		System.out.println("   Contraseña Usuario -> " +ContraseñaUsuario);
		
		System.out.println();
		System.out.println("Los nuevos datos son Correctos? [ 1 - Confirmar y Volver al Menu Principal | 2 - Modificar Datos Usuario ]");
		
		int ConfirmarCambio = sc.nextInt();
		
		if (ConfirmarCambio == 1) {
			MenuPrincipal();
		}
		
		if (ConfirmarCambio == 2) {
			DatosModificarUsuario();
		}
		}
	}
	
	static void EliminarUsuario() {
		
		if (Contador == 0) {
			System.err.println("No existe ningun Usuario disponible, Por favor, cree un nuevo usuario");
			System.out.println();
			MenuPrincipal();
			
		}
		
		System.out.println("Ha seleccionado [Eliminar Usuario], Es correcto? [ 1 - Continuar | 2 - Volver ]");
		int ConfirmarEliminarUsuario = sc.nextInt();
		
		if (ConfirmarEliminarUsuario == 1) {
			EjecucionEliminarUsuario();
		}
		
		if (ConfirmarEliminarUsuario == 2) {
			MenuPrincipal();
		}
		
	}
	
	static void EjecucionEliminarUsuario() {
		
		System.out.println("El usuario existente es -> " +NombreUsuario+ " " +ApellidoUsuario+ " Con Email -> " +EmailUsuario);
		System.out.println();
		System.out.println("Desea realmente Eliminar el Usuario Existente?... [ 1 - Confirmar | 2 - Volver]");
		int DecisionEliminarUsuario = sc.nextInt();
		
		if (DecisionEliminarUsuario == 2) {
			MenuPrincipal();
		}
		
		if (DecisionEliminarUsuario == 1) {
			
			System.out.println("Esta Realmente Seguro? Esta Decision no se puede Revertir  [ 1 - Confirmar | 2 - Volver]");
			
			int DecisionFinalEliminarUsuario = sc.nextInt();
			
			if (DecisionFinalEliminarUsuario == 2) {
				MenuPrincipal();
			}
			
			if (DecisionFinalEliminarUsuario == 1) {
				System.err.println("Eliminando Usuario...");
				Contador = 0;
				System.out.println();
				MenuPrincipal();
			}
			
		}
	}
	
	static void CambiarContraseña() {
		
		if (Contador == 0) {
			System.err.println("No existe ningun Usuario disponible, Por favor, cree un nuevo usuario");
			System.out.println();
			MenuPrincipal();
			
		}
		
		System.out.println("Ha seleccionado [Cambiar Contraseña], Es correcto? [ 1 - Continuar | 2 - Volver ]");
		int SeleccionModificarContraseña = sc.nextInt();
		
		if (SeleccionModificarContraseña == 2) {
			MenuPrincipal();
		}
		
		if (SeleccionModificarContraseña == 1) {
			EjecucionCambiarContraseña2();
		}
	}
	
	static void EjecucionCambiarContraseña2() {
		
		System.out.println("Introduzca la nueva contraseña de Usuario -> ");
		NuevaNuevaContraseña = sc.next();
		
		System.out.println("La nueva contraseña es -> " +NuevaNuevaContraseña+ " Es correcto? [ 1 - Confirmar y Volver al Menu | 2 - Modificar la nueva Contraseña]");
		
		int AcabarContraseña = sc.nextInt();
		
		if (AcabarContraseña == 1) {
			ContraseñaUsuario = NuevaNuevaContraseña;
			MenuPrincipal();
		}
		 if (AcabarContraseña == 2) {
			EjecucionCambiarContraseña2();
		}
	}
}
